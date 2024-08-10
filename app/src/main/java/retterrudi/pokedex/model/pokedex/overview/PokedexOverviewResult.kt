package retterrudi.pokedex.model.pokedex.overview

import kotlinx.serialization.Serializable

@Serializable
data class PokedexOverviewResult(
    val name: String,
    val url: String
)