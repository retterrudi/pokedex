package retterrudi.pokedex.model.pokedex

import kotlinx.serialization.Serializable
import retterrudi.pokedex.model.PokeApiLanguage

@Serializable
data class PokedexName (
    val language: PokeApiLanguage,
    val name: String,
)

