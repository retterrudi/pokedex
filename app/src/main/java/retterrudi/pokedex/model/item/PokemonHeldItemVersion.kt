package retterrudi.pokedex.model.item

import kotlinx.serialization.Serializable
import retterrudi.pokedex.model.Version

@Serializable
data class PokemonHeldItemVersion(
    val version: Version,
    val rarity: Int,
)