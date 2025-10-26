package com.jstreamv2.presentation.ui.screens

import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.Text
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import data.repository.RecommendedItem
import com.jstreamv2.presentation.ui.MediaCard

@Composable
fun RecommendationsScreen(items: List<RecommendedItem>, onItemClick: (Int) -> Unit) {
    Column(modifier = Modifier.fillMaxWidth().padding(16.dp)) {
        Text("Recommended for you", style = MaterialTheme.typography.headlineSmall)
        Spacer(Modifier.height(8.dp))
        LazyRow {
            items(items) { item ->
                MediaCard(posterUrl = null, title = item.title, rating = null, modifier = Modifier.padding(end = 8.dp), onClick = { onItemClick(item.id) })
            }
        }
    }
}
