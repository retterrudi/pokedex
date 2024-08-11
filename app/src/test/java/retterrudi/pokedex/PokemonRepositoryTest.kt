package retterrudi.pokedex

import kotlinx.coroutines.runBlocking
import org.junit.Test
import org.junit.Assert.*
import retterrudi.pokedex.data.DefaultAppContainer

class PokemonRepositoryTest {

    private val container = DefaultAppContainer()

    @Test
    fun `basic call to api`() = runBlocking {
        val result = container.pokemonRepository.getPokedexOverview()
        assertEquals("national", result.results[0].name)
    }

    @Test
    fun `GET pokedex by name`() = runBlocking {
        val national = container.pokemonRepository.getPokedex("national")
        assertEquals("national", national.name)

        val kanto = container.pokemonRepository.getPokedex("kanto")
        assertEquals("kanto", kanto.name)
    }

    @Test
    fun `GET pokemon by name`() = runBlocking {
        val bulbasaur = container.pokemonRepository.getPokemon("bulbasaur")
        assertEquals("bulbasaur", bulbasaur.name)

        val nidoqueen = container.pokemonRepository.getPokemon("nidoqueen")
        assertEquals("nidoqueen", nidoqueen.name)
    }
}