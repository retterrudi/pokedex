package retterrudi.pokedex.model.pokemon

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable
import retterrudi.pokedex.model.Version

/**
 * Note: Maybe GameIndex is enough for the name
 * */
@Serializable
data class PokemonGameIndex(
    @SerialName("game_index") val gameIndex: Int,
    val version: Version,
)