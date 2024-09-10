package retterrudi.pokedex

import androidx.compose.runtime.Composable
import androidx.navigation.NavController
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import retterrudi.pokedex.navigation.PokedexNavHost

@Composable
fun PokedexApp(navController: NavHostController = rememberNavController()) {
    PokedexNavHost(navController = navController)
}