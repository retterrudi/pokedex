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
}