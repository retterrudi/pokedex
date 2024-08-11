package retterrudi.pokedex.model

import kotlinx.serialization.Serializable

@Serializable
data class GenerationName(
    val name: String,
    val url: String,
)