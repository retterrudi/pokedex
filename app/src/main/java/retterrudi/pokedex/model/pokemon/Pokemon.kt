package retterrudi.pokedex.model.pokemon

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable
import retterrudi.pokedex.model.Version
import retterrudi.pokedex.model.VersionGroup
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

@Serializable
data class PokemonAbility(
    val ability: PokemonAbilityName,
    @SerialName("is_hidden") val isHidden: Boolean,
    val slot: Int,
)

@Serializable
data class PokemonAbilityName(
    val name: String,
    val url: String,
)

@Serializable
data class PokemonCries(
    val latest: String,
    val legacy: String,
)

@Serializable
data class PokemonForm(
    val name: String,
    val url: String,
)

/**
 * Note: Maybe GameIndex is enough for the name
 * */
@Serializable
data class PokemonGameIndex(
    @SerialName("game_index") val gameIndex: Int,
    val version: Version,
)

@Serializable
data class PokemonMove(
    val move: PokemonMoveName,
    @SerialName("version_group_details") val versionGroupDetails: List<PokemonMoveVersion>
)

@Serializable
data class PokemonMoveName(
    val name: String,
    val url: String,
)

@Serializable
data class PokemonMoveVersion(
    @SerialName("level_learned_at") val levelLearnedAt: Int,
    @SerialName("move_learn_method") val moveLearnMethod: MoveLearnMethodName,
    @SerialName("version_group") val versionGroup: VersionGroup,
)

@Serializable
data class MoveLearnMethodName(
    val name: String,
    val url: String,
)