package retterrudi.pokedex.model.item

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class PokemonHeldItem(
    val item: ItemName,
    @SerialName("version_details") val versionDetails: PokemonHeldItemVersion,
)