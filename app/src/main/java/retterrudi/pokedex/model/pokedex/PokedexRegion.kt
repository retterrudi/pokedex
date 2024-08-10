package retterrudi.pokedex.model.pokedex

import kotlinx.serialization.Serializable

@Serializable
data class PokedexRegion(
    val name: String,
    val url: String,
)
