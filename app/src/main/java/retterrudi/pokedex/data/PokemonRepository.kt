package retterrudi.pokedex.data

import retterrudi.pokedex.model.PokedexOverview
import retterrudi.pokedex.network.PokemonApiService

interface PokemonRepository {
    suspend fun getPokedexOverview(): PokedexOverview
}

class NetworkPokemonRepository(
    private val pokemonApiService: PokemonApiService
) : PokemonRepository {
    override suspend fun getPokedexOverview(): PokedexOverview =
        pokemonApiService.getPokedexOverview()
}