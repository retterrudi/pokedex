package retterrudi.pokedex

import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.runtime.Composable
import androidx.navigation.NavController
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import retterrudi.pokedex.navigation.PokedexNavHost

@Composable
fun PokedexApp(
    innerPadding: PaddingValues,
    navController: NavHostController = rememberNavController()
) {
    PokedexNavHost(
        innerPadding,
        navController = navController
    )
}