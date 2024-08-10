package retterrudi.pokedex.model.pokemon

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable
import retterrudi.pokedex.model.stats.StatName

@Serializable
data class PokemonStat(
    val stat: StatName,
    val effort: Int,
    @SerialName("base_stat") val baseStat: Int,
)
