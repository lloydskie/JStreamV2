package com.jstreamv2.presentation.ui.screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.foundation.lazy.grid.items
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import presentation.ui.animation.FadeInImage
import presentation.ui.animation.LoadingSkeleton
import com.jstreamv2.presentation.ui.MediaCard

// Data models (replace with actual models)
data class PersonDetail(
    val id: Int,
    val name: String,
    val profilePath: String?,
    val knownFor: String,
    val biography: String,
    val movies: List<MediaItem>,
    val tvShows: List<MediaItem>
)
data class MediaItem(
    val id: Int,
    val title: String,
    val posterPath: String?
)

@Composable
fun PersonDetailScreen(
    person: PersonDetail,
    onMediaClick: (mediaId: Int, isMovie: Boolean) -> Unit,
    modifier: Modifier = Modifier
) {
    var selectedTab by remember { mutableStateOf(0) }
    val tabTitles = listOf("Movies", "TV Shows")

    Column(
        modifier = modifier.fillMaxSize()
    ) {
        // Profile Section
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(16.dp),
            verticalAlignment = Alignment.CenterVertically
        ) {
            if (person.profilePath.isNullOrEmpty()) {
                LoadingSkeleton(modifier = Modifier.size(96.dp).padding(end = 16.dp))
            } else {
                FadeInImage(
                    url = person.profilePath,
                    contentDescription = "Profile Photo",
                    modifier = Modifier
                        .size(96.dp)
                        .padding(end = 16.dp)
                )
            }
            Column(
                modifier = Modifier.weight(1f)
            ) {
                Text(
                    text = person.name,
                    style = MaterialTheme.typography.headlineSmall,
                    fontWeight = FontWeight.Bold
                )
                Text(
                    text = person.knownFor,
                    style = MaterialTheme.typography.bodyMedium,
                    color = Color.Gray
                )
            }
        }
        // Biography
        Text(
            text = person.biography,
            style = MaterialTheme.typography.bodyMedium,
            modifier = Modifier
                .fillMaxWidth()
                .padding(horizontal = 16.dp, vertical = 8.dp),
            textAlign = TextAlign.Start,
            maxLines = 8
        )
        // Tabs
        TabRow(selectedTabIndex = selectedTab) {
            tabTitles.forEachIndexed { index, title ->
                Tab(
                    selected = selectedTab == index,
                    onClick = { selectedTab = index },
                    text = { Text(title) }
                )
            }
        }
        // Media Grid
        when (selectedTab) {
            0 -> MediaGrid(
                items = person.movies,
                onItemClick = { id -> onMediaClick(id, true) }
            )
            1 -> MediaGrid(
                items = person.tvShows,
                onItemClick = { id -> onMediaClick(id, false) }
            )
        }
    }
}

@Composable
fun MediaGrid(
    items: List<MediaItem>,
    onItemClick: (Int) -> Unit
) {
    LazyVerticalGrid(
        columns = GridCells.Fixed(3),
        modifier = Modifier
            .fillMaxWidth()
            .padding(8.dp),
        contentPadding = PaddingValues(4.dp)
    ) {
        items(items) { item ->
            MediaCard(
                title = item.title,
                posterPath = item.posterPath,
                modifier = Modifier
                    .padding(4.dp)
                    .clickable { onItemClick(item.id) }
            )
        }
    }
}
