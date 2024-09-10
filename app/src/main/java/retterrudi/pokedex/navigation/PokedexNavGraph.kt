package retterrudi.pokedex.navigation

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.NavHostController
import retterrudi.pokedex.ui.pokedexCollection.PokedexCollectionDestination
import retterrudi.pokedex.ui.pokedexCollection.PokedexCollectionScreen

@Composable
fun PokedexNavHost(
    navController: NavHostController,
    modifier: Modifier = Modifier,
) {
    NavHost(
        navController = navController,
        startDestination = PokedexCollectionDestination.route,
        modifier = modifier
    ) {
        composable(route = PokedexCollectionDestination.route) {
            PokedexCollectionScreen(

            )
        }
    }

}
