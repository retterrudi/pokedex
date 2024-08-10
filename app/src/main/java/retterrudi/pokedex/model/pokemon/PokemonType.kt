package retterrudi.pokedex.model.pokemon

import kotlinx.serialization.Serializable

@Serializable
data class PokemonType(
    val type: PokemonTypeName,
    val slot: Int,
)

@Serializable
data class PokemonTypeName(
    val name: String,
    val url: String,
)
