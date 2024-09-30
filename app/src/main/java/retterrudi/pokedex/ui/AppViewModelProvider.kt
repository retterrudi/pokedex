package retterrudi.pokedex.ui

import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.createSavedStateHandle
import androidx.lifecycle.viewmodel.CreationExtras
import androidx.lifecycle.viewmodel.initializer
import androidx.lifecycle.viewmodel.viewModelFactory
import retterrudi.pokedex.PokedexApplication
import retterrudi.pokedex.ui.SinglePokedex.SinglePokedexViewModel
import retterrudi.pokedex.ui.pokedexCollection.PokedexCollectionViewModel

object AppViewModelProvider {
    val Factory = viewModelFactory {
        initializer {
            PokedexCollectionViewModel(pokedexApplication().container.pokemonRepository)
        }

        initializer {
            SinglePokedexViewModel(
                this.createSavedStateHandle(),
                pokedexApplication().container.pokemonRepository
            )
        }
    }
}

fun CreationExtras.pokedexApplication(): PokedexApplication =
    (this[ViewModelProvider.AndroidViewModelFactory.APPLICATION_KEY] as PokedexApplication)