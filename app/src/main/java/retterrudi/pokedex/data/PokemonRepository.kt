package retterrudi.pokedex.data

import retterrudi.pokedex.model.pokedex.Pokedex
import retterrudi.pokedex.model.pokedex.overview.PokedexOverview
import retterrudi.pokedex.network.PokemonApiService

interface PokemonRepository {
    suspend fun getPokedexOverview(): PokedexOverview
    suspend fun getPokedex(pokedexName: String): Pokedex
}

class NetworkPokemonRepository(
    private val pokemonApiService: PokemonApiService
) : PokemonRepository {
    override suspend fun getPokedexOverview(): PokedexOverview =
        pokemonApiService.getPokedexOverview()

    override suspend fun getPokedex(pokedexName: String): Pokedex =
        pokemonApiService.getPokedex(pokedexName)
}