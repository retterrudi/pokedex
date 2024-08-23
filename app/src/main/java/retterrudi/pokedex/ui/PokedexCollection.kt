package retterrudi.pokedex.ui

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.foundation.lazy.grid.items
import androidx.compose.material3.Card
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@Composable
fun PokedexGrid(
    pokedexList: List<String>,
    contentPadding: PaddingValues,
    modifier: Modifier = Modifier,
) {
    LazyVerticalGrid(
        columns = GridCells.Fixed(2),
        contentPadding = contentPadding,
        modifier = modifier,
        verticalArrangement = Arrangement.spacedBy(4.dp),
        horizontalArrangement = Arrangement.spacedBy(4.dp),
    ) {
        items(pokedexList) { item ->
            PokedexCard(
                pokedexName = item,
                modifier = Modifier.height(48.dp)
            )
        }
    }
}

@Preview(
    showBackground = true,
    widthDp = 400
)
@Composable
fun PokedexGridPreview() {
    PokedexGrid(
        pokedexList = listOf("kanto", "national", "test"),
        contentPadding = PaddingValues(4.dp),
    )
}

@Composable
fun PokedexCard(
    pokedexName: String,
    modifier: Modifier = Modifier,
) {
    Card(
        onClick = { /*TODO*/ },
        modifier = modifier,
    ) {
        Box(
            modifier = Modifier.fillMaxHeight(),
            contentAlignment = Alignment.Center
        ) {
            Text(text = pokedexName, Modifier.padding(12.dp, 4.dp))
        }
    }
}

@Preview(
    showBackground = true,
    heightDp = 48
)
@Composable
fun PokedexCardPreview() {
    PokedexCard(
        "kanto",
        Modifier.width(200.dp)
    )
}