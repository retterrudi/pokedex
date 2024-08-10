package retterrudi.pokedex.model.pokedex

import kotlinx.serialization.Serializable
import retterrudi.pokedex.model.PokeApiLanguage

@Serializable
data class PokedexDescription (
    val description: String,
    val language: PokeApiLanguage
)
