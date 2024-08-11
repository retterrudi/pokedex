package retterrudi.pokedex.model.pokemon

import kotlinx.serialization.Serializable

@Serializable
data class PokemonCries(
    val latest: String,
    val legacy: String,
)