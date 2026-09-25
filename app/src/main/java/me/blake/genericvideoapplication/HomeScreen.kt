package me.blake.genericvideoapplication

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier

@Composable
fun HomeScreen(innerPadding: PaddingValues) {
    Column(
        modifier = Modifier.padding()
            .padding(innerPadding)
    ) {
        VideoPlayer(videoUrl = "https://www.w3schools.com/tags/movie.mp4")
    }
}