package retterrudi.pokedex.model.stats

import kotlinx.serialization.Serializable

@Serializable
data class StatName(
    val name: String,
    val url: String,
)
