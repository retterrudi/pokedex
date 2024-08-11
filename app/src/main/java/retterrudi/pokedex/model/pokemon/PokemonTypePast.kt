package retterrudi.pokedex.model.pokemon

import kotlinx.serialization.Serializable
import retterrudi.pokedex.model.GenerationName

@Serializable
data class PokemonTypePast(
    val generation: GenerationName,
    val types: List<PokemonType>,
)

