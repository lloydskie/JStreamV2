package com.jstreamv2.presentation.ui

import androidx.compose.foundation.horizontalScroll
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.rememberScrollState
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

@Composable
fun HorizontalMediaList(
    sectionTitle: String,
    items: List<MediaCardData>,
    modifier: Modifier = Modifier,
    onItemClick: (MediaCardData) -> Unit = {}
) {
    Column(modifier = modifier) {
        Text(
            text = sectionTitle,
            style = androidx.compose.material3.MaterialTheme.typography.headlineMedium,
            modifier = Modifier.padding(8.dp)
        )
        Row(
            modifier = Modifier.horizontalScroll(rememberScrollState()).padding(horizontal = 8.dp)
        ) {
            items.forEach { item ->
                MediaCard(
                    posterUrl = item.posterUrl,
                    title = item.title,
                    rating = item.rating,
                    modifier = Modifier.padding(end = 12.dp),
                    onClick = { onItemClick(item) }
                )
            }
        }
    }
}

data class MediaCardData(
    val posterUrl: String?,
    val title: String?,
    val rating: Double?
)
