package retterrudi.pokedex.model.pokedex

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable
import retterrudi.pokedex.model.VersionGroup

@Serializable
data class Pokedex(
    val descriptions: List<PokedexDescription>,
    val id: Int,
    @SerialName("is_main_series") val isMainSeries: Boolean,
    val name: String,
    val names: List<PokedexName>,
    @SerialName("pokemon_entries") val pokemonEntries: List<PokedexEntry>,
    val region: PokedexRegion?,
    @SerialName("version_groups") val versionGroups: List<VersionGroup>
)
