package retterrudi.pokedex

import android.app.Application
import retterrudi.pokedex.data.AppContainer
import retterrudi.pokedex.data.DefaultAppContainer

class PokedexApplication : Application() {
    lateinit var container: AppContainer
    override fun onCreate() {
        super.onCreate()
        container = DefaultAppContainer()
    }
}