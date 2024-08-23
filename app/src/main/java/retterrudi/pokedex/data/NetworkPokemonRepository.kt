package retterrudi.pokedex.data

import retterrudi.pokedex.model.pokedex.Pokedex
import retterrudi.pokedex.model.pokedex.overview.PokedexOverview
import retterrudi.pokedex.model.pokemon.Pokemon
import retterrudi.pokedex.network.PokemonApiService

class NetworkPokemonRepository(
    private val pokemonApiService: PokemonApiService
) : PokemonRepository {
    override suspend fun getPokedexOverview(): PokedexOverview =
        pokemonApiService.getPokedexOverview()

    override suspend fun getPokedex(pokedexName: String): Pokedex =
        pokemonApiService.getPokedex(pokedexName)

    override suspend fun getPokemon(pokemonName: String): Pokemon =
        pokemonApiService.getPokemon(pokemonName)
}