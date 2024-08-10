package retterrudi.pokedex.model

import kotlinx.serialization.Serializable

@Serializable
data class PokeApiLanguage (
    val name: String,
    val url: String,
)
