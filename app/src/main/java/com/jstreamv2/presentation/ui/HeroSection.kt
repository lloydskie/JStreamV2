package com.jstreamv2.presentation.ui

import presentation.ui.animation.FadeInImage
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material3.Button
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.material3.MaterialTheme
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.PlayArrow
import androidx.compose.material.icons.filled.Add
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.unit.dp
// Coil usage replaced with FadeInImage

@Composable
fun HeroSection(
    backdropUrl: String?,
    title: String?,
    overview: String?,
    onPlayClick: () -> Unit = {},
    onAddClick: () -> Unit = {}
) {
    Box(modifier = Modifier.height(320.dp).fillMaxWidth()) {
    FadeInImage(url = backdropUrl, contentDescription = title, modifier = Modifier.fillMaxSize())
        Box(
            modifier = Modifier.fillMaxSize().background(
                Brush.verticalGradient(
                    colors = listOf(Color.Transparent, Color.Black),
                    startY = 0f, endY = 600f
                )
            )
        )
        Column(
            modifier = Modifier.align(Alignment.BottomStart).padding(16.dp)
        ) {
            Text(
                text = title ?: "",
                style = MaterialTheme.typography.displayLarge,
                maxLines = 1,
                overflow = TextOverflow.Ellipsis
            )
            Spacer(Modifier.height(8.dp))
            Text(
                text = overview ?: "",
                style = MaterialTheme.typography.bodyLarge,
                maxLines = 3,
                overflow = TextOverflow.Ellipsis
            )
            Spacer(Modifier.height(16.dp))
            Row {
                Button(onClick = onPlayClick) {
                    Icon(Icons.Default.PlayArrow, contentDescription = "Play")
                    Text("Play")
                }
                Spacer(Modifier.width(8.dp))
                Button(onClick = onAddClick) {
                    Icon(Icons.Default.Add, contentDescription = "Add")
                    Text("Add")
                }
            }
        }
    }
}
