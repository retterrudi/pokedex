package retterrudi.pokedex.network

import retrofit2.http.GET
import retterrudi.pokedex.model.PokedexOverview

interface PokemonApiService {

    @GET("pokedex?limit=32")
    suspend fun getPokedexOverview(): PokedexOverview
}