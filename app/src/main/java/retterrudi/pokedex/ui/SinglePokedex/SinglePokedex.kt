package retterrudi.pokedex.ui.SinglePokedex

import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.lifecycle.viewmodel.compose.viewModel
import retterrudi.pokedex.navigation.NavigationDestination
import retterrudi.pokedex.ui.AppViewModelProvider

object SinglePokedexDestination : NavigationDestination {
    override val route = "single_pokedex"
    const val pokedexName = "pokedexName"
    val routeWithArgs = "$route/{$pokedexName}"
}

@Composable
fun SinglePokedexScreen(
    navigateBack: () -> Unit,
    viewModel: SinglePokedexViewModel = viewModel(factory = AppViewModelProvider.Factory),
    modifier: Modifier = Modifier,
) {
    Text("THIS IS A TEST")
}
