package retterrudi.pokedex.network

import retrofit2.http.GET
import retrofit2.http.Path
import retterrudi.pokedex.model.pokedex.Pokedex
import retterrudi.pokedex.model.pokedex.overview.PokedexOverview

interface PokemonApiService {

    @GET("pokedex?limit=32")
    suspend fun getPokedexOverview(): PokedexOverview

    @GET("pokedex/{name}")
    suspend fun getPokedex(@Path("name") pokedexName: String): Pokedex
}