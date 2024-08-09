package retterrudi.pokedex.model

import kotlinx.serialization.Serializable

@Serializable
data class PokedexOverview(
    val count: Int,
    val next: String?,
    val previous: String?,
    val results: List<PokedexOverviewResult>
)

@Serializable
data class PokedexOverviewResult(
    val name: String,
    val url: String
)