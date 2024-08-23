package retterrudi.pokedex.data

import retterrudi.pokedex.model.pokedex.Pokedex
import retterrudi.pokedex.model.pokedex.overview.PokedexOverview
import retterrudi.pokedex.model.pokemon.Pokemon

interface PokemonRepository {
    suspend fun getPokedexOverview(): PokedexOverview
    suspend fun getPokedex(pokedexName: String): Pokedex
    suspend fun getPokemon(pokemonName: String): Pokemon
}

