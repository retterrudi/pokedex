package retterrudi.pokedex.ui.pokedexCollection

import androidx.lifecycle.ViewModel
import retterrudi.pokedex.data.PokemonRepository
import retterrudi.pokedex.model.pokedex.overview.PokedexOverviewResult

data class PokedexCollectionUiState(val pokedexList: List<PokedexOverviewResult>)

class PokedexCollectionViewModel(val pokemonRepository: PokemonRepository) : ViewModel() {
    // TODO
}
