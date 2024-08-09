package retterrudi.pokedex.data

import kotlinx.serialization.json.Json
import okhttp3.MediaType.Companion.toMediaType
import retrofit2.Retrofit
import retrofit2.converter.kotlinx.serialization.asConverterFactory
import retterrudi.pokedex.network.PokemonApiService

interface AppContainer {
    val pokemonRepository: PokemonRepository
}

class DefaultAppContainer : AppContainer {
    private val baseUrl = "https://pokeapi.co/api/v2/"

    private val networkJson = Json { ignoreUnknownKeys = true }

    private val retrofit: Retrofit = Retrofit.Builder()
        .baseUrl(baseUrl)
        .addConverterFactory(networkJson.asConverterFactory("application/json".toMediaType()))
        .build()

    private val retrofitService: PokemonApiService by lazy {
        retrofit.create(PokemonApiService::class.java)
    }

    override val pokemonRepository: PokemonRepository by lazy {
        NetworkPokemonRepository(retrofitService)
    }
}