package retterrudi.pokedex.model

import kotlinx.serialization.Serializable

@Serializable
data class PokemonSpecies(
    val name: String,
    val url: String
)
