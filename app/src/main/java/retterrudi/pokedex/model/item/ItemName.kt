package retterrudi.pokedex.model.item

import kotlinx.serialization.Serializable

@Serializable
data class ItemName(
    val name: String,
    val url: String,
)

