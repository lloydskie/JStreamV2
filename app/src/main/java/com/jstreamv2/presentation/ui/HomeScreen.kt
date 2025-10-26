package com.jstreamv2.presentation.ui

import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Search
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.List
import androidx.compose.material.icons.filled.Person
import androidx.compose.material.icons.filled.PlayArrow
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import com.jstreamv2.presentation.theme.NetflixTheme
import androidx.compose.foundation.clickable
import kotlinx.coroutines.launch
import kotlinx.coroutines.launch

@Composable
fun HomeScreen(
    featured: MediaCardData?,
    popularMovies: List<MediaCardData>,
    topRatedMovies: List<MediaCardData>,
    upcomingMovies: List<MediaCardData>,
    popularTv: List<MediaCardData>,
    topRatedTv: List<MediaCardData>,
    genres: List<String>,
    selectedGenre: String?,
    onGenreSelect: (String) -> Unit,
    onSearchClick: () -> Unit,
    onRefresh: () -> Unit,
    onMediaClick: (MediaCardData) -> Unit,
    modifier: Modifier = Modifier
) {
    val scope = rememberCoroutineScope()
    var refreshing by remember { mutableStateOf(false) }

    NetflixTheme {
        Scaffold(
            topBar = {
                TopAppBar(
                    title = {
                        Row(verticalAlignment = Alignment.CenterVertically) {
                            Icon(
                                painter = painterResource(id = R.drawable.ic_jstream_logo),
                                contentDescription = "JStream Logo",
                                tint = Color.Unspecified,
                                modifier = Modifier.size(32.dp)
                            )
                            Spacer(Modifier.width(8.dp))
                            Text("JStream", style = MaterialTheme.typography.headlineMedium)
                        }
                    },
                    actions = {
                        IconButton(onClick = onSearchClick) {
                            Icon(Icons.Default.Search, contentDescription = "Search")
                        }
                    }
                )
            },
            bottomBar = {
                NavigationBar {
                    NavigationBarItem(
                        icon = { Icon(Icons.Default.Home, contentDescription = "Home") },
                        label = { Text("Home") },
                        selected = true,
                        onClick = {}
                    )
                    NavigationBarItem(
                        icon = { Icon(Icons.Default.Search, contentDescription = "Search") },
                        label = { Text("Search") },
                        selected = false,
                        onClick = onSearchClick
                    )
                    NavigationBarItem(
                        icon = { Icon(Icons.Default.List, contentDescription = "My List") },
                        label = { Text("My List") },
                        selected = false,
                        onClick = {}
                    )
                    NavigationBarItem(
                        icon = { Icon(Icons.Default.Person, contentDescription = "Profile") },
                        label = { Text("Profile") },
                        selected = false,
                        onClick = {}
                    )
                }
            }
        ) { innerPadding ->
            Column(modifier = modifier.padding(innerPadding).fillMaxSize()) {
                // Pull-to-refresh
                if (refreshing) {
                    LoadingIndicator()
                }
                // Hero Section
                featured?.let {
                    HeroSection(
                        backdropUrl = it.posterUrl,
                        title = it.title,
                        overview = null,
                        onPlayClick = {},
                        onAddClick = {}
                    )
                }
                // Genre Chips
                LazyRow(modifier = Modifier.padding(vertical = 8.dp)) {
                    items(genres) { genre ->
                        GenreChip(
                            genre = genre,
                            selected = genre == selectedGenre,
                            onClick = { onGenreSelect(genre) },
                            modifier = Modifier.padding(end = 8.dp)
                        )
                    }
                }
                // Horizontal Lists
                HorizontalMediaList(
                    sectionTitle = "Popular Movies",
                    items = popularMovies,
                    onItemClick = onMediaClick
                )
                HorizontalMediaList(
                    sectionTitle = "Top Rated Movies",
                    items = topRatedMovies,
                    onItemClick = onMediaClick
                )
                HorizontalMediaList(
                    sectionTitle = "Upcoming Movies",
                    items = upcomingMovies,
                    onItemClick = onMediaClick
                )
                HorizontalMediaList(
                    sectionTitle = "Popular TV Shows",
                    items = popularTv,
                    onItemClick = onMediaClick
                )
                HorizontalMediaList(
                    sectionTitle = "Top Rated TV Shows",
                    items = topRatedTv,
                    onItemClick = onMediaClick
                )
            }
        }
    }
}
