package retterrudi.pokedex.model.pokemon

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class PokemonMove(
    val move: PokemonMoveName,
    @SerialName("version_group_details") val versionGroupDetails: List<PokemonMoveVersion>
)