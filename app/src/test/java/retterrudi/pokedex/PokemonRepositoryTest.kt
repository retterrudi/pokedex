package retterrudi.pokedex

import kotlinx.coroutines.runBlocking
import org.junit.Test
import retterrudi.pokedex.data.DefaultAppContainer

class PokemonRepositoryTest {

    private val container = DefaultAppContainer()

    @Test
    fun `basic call to api`() = runBlocking {
        val result = container.pokemonRepository.getPokedexOverview()
        println(result.toString())
    }

    @Test
    fun `GET pokedex by name`() = runBlocking {
        val national = container.pokemonRepository.getPokedex("national")
        println(national.toString())

        val kanto = container.pokemonRepository.getPokedex("kanto")
        println(kanto.toString())
    }

    @Test
    fun `GET pokemon by name`() = runBlocking {
        val bulbasaur = container.pokemonRepository.getPokemon("bulbasaur")
        println(bulbasaur.toString())

        val nidoqueen = container.pokemonRepository.getPokemon("nidoqueen")
        println(nidoqueen.toString())
    }
}