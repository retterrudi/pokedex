package retterrudi.pokedex.model.pokemon

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable
import retterrudi.pokedex.model.MoveLearnMethodName
import retterrudi.pokedex.model.VersionGroup

@Serializable
data class PokemonMoveVersion(
    @SerialName("level_learned_at") val levelLearnedAt: Int,
    @SerialName("move_learn_method") val moveLearnMethod: MoveLearnMethodName,
    @SerialName("version_group") val versionGroup: VersionGroup,
)