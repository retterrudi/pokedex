package retterrudi.pokedex.model.pokedex.overview

import kotlinx.serialization.Serializable

@Serializable
data class PokedexOverview(
    val count: Int,
    val next: String?,
    val previous: String?,
    val results: List<PokedexOverviewResult>
)
