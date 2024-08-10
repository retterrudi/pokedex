package retterrudi.pokedex.model.item

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable
import retterrudi.pokedex.model.Version

@Serializable
data class ItemName(
    val name: String,
    val url: String,
)

@Serializable
data class PokemonHeldItem(
    val item: ItemName,
    @SerialName("version_details") val versionDetails: PokemonHeldItemVersion,
)

@Serializable
data class PokemonHeldItemVersion(
    val version: Version,
    val rarity: Int,
)
