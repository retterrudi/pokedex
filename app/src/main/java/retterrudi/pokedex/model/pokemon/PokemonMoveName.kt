package retterrudi.pokedex.model.pokemon

import kotlinx.serialization.Serializable

@Serializable
data class PokemonMoveName(
    val name: String,
    val url: String,
)