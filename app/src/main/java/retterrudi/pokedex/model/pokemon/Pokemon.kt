package retterrudi.pokedex.model.pokemon

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable
import retterrudi.pokedex.model.item.PokemonHeldItem

@Serializable
data class Pokemon(
    val abilities: List<PokemonAbility>,
    @SerialName("base_experience") val baseExperience: Int,
    val cries: PokemonCries,
    val forms: List<PokemonForm>,
    @SerialName("game_indices") val gameIndices: List<PokemonGameIndex>,
    val height: Int,
    @SerialName("held_items") val heldItems: List<PokemonHeldItem>,
    val id: Int,
    @SerialName("is_default") val isDefault: Boolean,
    @SerialName("location_area_encounters") val locationAreaEncounters: String,
    val moves: List<PokemonMove>,
    val name: String,
    val order: Int,
    // Probably not needed
//    @SerialName("past_abilities") val pastAbilities: List<>,
    @SerialName("past_types") val pastTypes: List<PokemonTypePast>,
    val species: PokemonSpecies,
    val sprites: PokemonSprites,
    val stats: List<PokemonStat>,
    val types: List<PokemonType>,
    val weight: Int,
)

