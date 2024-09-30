package retterrudi.pokedex.navigation

import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.NavHostController
import androidx.navigation.NavType
import androidx.navigation.navArgument
import retterrudi.pokedex.ui.SinglePokedex.SinglePokedexDestination
import retterrudi.pokedex.ui.SinglePokedex.SinglePokedexScreen
import retterrudi.pokedex.ui.pokedexCollection.PokedexCollectionDestination
import retterrudi.pokedex.ui.pokedexCollection.PokedexCollectionScreen

@Composable
fun PokedexNavHost(
    innerPadding: PaddingValues,
    navController: NavHostController,
    modifier: Modifier = Modifier,
) {
    NavHost(
        navController = navController,
        startDestination = PokedexCollectionDestination.route,
        modifier = modifier.padding(innerPadding)
    ) {
        composable(route = PokedexCollectionDestination.route) {
            PokedexCollectionScreen(
                pokedexOnClick = { navController.navigate("${SinglePokedexDestination.route}/${it}")}
            )
        }

        composable(
            route = SinglePokedexDestination.routeWithArgs,
            arguments = listOf(navArgument(SinglePokedexDestination.pokedexName) {
                type = NavType.StringType
            })
        ) {
            SinglePokedexScreen(
                navigateBack = { navController.navigateUp() }
            )
        }
    }

}
