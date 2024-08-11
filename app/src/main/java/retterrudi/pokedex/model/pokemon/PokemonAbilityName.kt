package retterrudi.pokedex.model.pokemon

import kotlinx.serialization.Serializable

@Serializable
data class PokemonAbilityName(
    val name: String,
    val url: String,
)