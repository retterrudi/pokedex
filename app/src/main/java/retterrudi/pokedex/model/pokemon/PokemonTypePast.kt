package retterrudi.pokedex.model.pokemon

import kotlinx.serialization.Serializable

@Serializable
data class PokemonTypePast(
    val generation: GenerationName,
    val types: List<PokemonType>,
)

@Serializable
data class GenerationName(
    val name: String,
    val url: String,
)
