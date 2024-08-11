package retterrudi.pokedex.model.pokemon

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class PokemonAbility(
    val ability: PokemonAbilityName,
    @SerialName("is_hidden") val isHidden: Boolean,
    val slot: Int,
)