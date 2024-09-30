package retterrudi.pokedex.ui.SinglePokedex

import androidx.lifecycle.SavedStateHandle
import androidx.lifecycle.ViewModel
import retterrudi.pokedex.data.PokemonRepository

class SinglePokedexViewModel(
    savedStateHandle: SavedStateHandle,
    private val pokedexRepository: PokemonRepository
) : ViewModel() {

    private val pokedexName: String = checkNotNull(savedStateHandle[SinglePokedexDestination.pokedexName])


}