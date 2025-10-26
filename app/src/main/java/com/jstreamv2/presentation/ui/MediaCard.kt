package com.jstreamv2.presentation.ui

import presentation.ui.animation.FadeInImage
import androidx.compose.foundation.layout.*
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Text
import androidx.compose.material3.LinearProgressIndicator
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.unit.dp
// Coil usage replaced with FadeInImage

@Composable
fun MediaCard(
    posterUrl: String? = null,
    posterPath: String? = null,
    title: String? = null,
    rating: Double? = null,
    progressPercent: Int = 0,
    modifier: Modifier = Modifier,
    onClick: () -> Unit = {}
) {
    Card(
        modifier = modifier.width(140.dp).height(240.dp),
        shape = MaterialTheme.shapes.medium,
        elevation = CardDefaults.cardElevation(8.dp),
        onClick = onClick
    ) {
        Column(modifier = Modifier.fillMaxSize()) {
            val url = posterUrl ?: posterPath
            FadeInImage(
                url = url,
                contentDescription = title,
                modifier = Modifier.height(180.dp).fillMaxWidth()
            )
            Spacer(Modifier.height(8.dp))
            Text(
                text = title ?: "",
                style = MaterialTheme.typography.bodyLarge,
                maxLines = 1,
                overflow = TextOverflow.Ellipsis,
                modifier = Modifier.padding(horizontal = 8.dp)
            )
            Text(
                text = "★ ${rating ?: "-"}",
                style = MaterialTheme.typography.labelLarge,
                modifier = Modifier.padding(horizontal = 8.dp)
            )
            if (progressPercent in 1..99) {
                // progress bar overlay
                LinearProgressIndicator(progress = progressPercent / 100f, modifier = Modifier.fillMaxWidth().padding(horizontal = 8.dp))
            }
        }
    }
}
