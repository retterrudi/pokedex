package retterrudi.pokedex.ui.pokedexCollection

import android.util.Log
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.launch
import retterrudi.pokedex.data.PokemonRepository

const val TAG: String = "POKEDEX_COLLECTION_VIEWMODEL"

sealed interface PokedexCollectionUiState {
    data class Success(val pokedexList: List<String>) : PokedexCollectionUiState
    data object Loading : PokedexCollectionUiState
    data object Error : PokedexCollectionUiState
}

class PokedexCollectionViewModel(val pokemonRepository: PokemonRepository) : ViewModel() {
    // TODO
    var uiState: PokedexCollectionUiState by mutableStateOf(PokedexCollectionUiState.Loading)

    init {
        getPokedexCollection()
    }

    fun reloadData() {
        getPokedexCollection()
    }

    private fun getPokedexCollection() {
        viewModelScope.launch {
            uiState = PokedexCollectionUiState.Loading
            uiState = try {
                PokedexCollectionUiState.Success(
                    pokemonRepository.getPokedexOverview()
                        .results
                        .map { it.name }
                )
            } catch (e: Exception) {
                Log.e(TAG, e.message.toString())
                e.printStackTrace()
                PokedexCollectionUiState.Error
            }
        }
    }
}
