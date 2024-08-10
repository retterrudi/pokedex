package retterrudi.pokedex.model.pokemon

import kotlinx.serialization.Serializable

@Serializable
data class PokemonSpecies(
    val name: String,
    val url: String
)
