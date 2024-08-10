package retterrudi.pokedex.model.pokedex

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable
import retterrudi.pokedex.model.pokemon.PokemonSpecies

@Serializable
data class PokedexEntry(
    @SerialName("entry_number") val entryNumber: Int,
    @SerialName("pokemon_species") val pokemonSpecies: PokemonSpecies,
)
