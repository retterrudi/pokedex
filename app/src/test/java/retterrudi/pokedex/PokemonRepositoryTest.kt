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
}