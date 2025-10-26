package com.jstreamv2.presentation.ui

import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.foundation.lazy.grid.items
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

@Composable
fun GenreBrowseScreen(
    movieGenres: List<String>,
    tvGenres: List<String>,
    onGenreClick: (String, Boolean) -> Unit, // genre, isMovie
    modifier: Modifier = Modifier
) {
    var showMovies by remember { mutableStateOf(true) }
    Column(modifier = modifier.fillMaxSize().padding(16.dp)) {
        Row(modifier = Modifier.fillMaxWidth(), horizontalArrangement = Arrangement.SpaceBetween) {
            Text("Browse Genres", style = MaterialTheme.typography.headlineMedium)
            SegmentedButton(
                options = listOf("Movies", "TV Shows"),
                selectedIndex = if (showMovies) 0 else 1,
                onOptionSelected = { showMovies = it == 0 }
            )
        }
        Spacer(Modifier.height(16.dp))
        LazyColumn {
            val genres = if (showMovies) movieGenres else tvGenres
            items(genres) { genre ->
                GenreChip(
                    genre = genre,
                    onClick = { onGenreClick(genre, showMovies) },
                    modifier = Modifier.padding(vertical = 4.dp)
                )
            }
        }
    }
}

@Composable
fun GenreResultsScreen(
    genre: String,
    isMovie: Boolean,
    results: List<MediaCardData>,
    onResultClick: (MediaCardData) -> Unit,
    onSortChange: (String) -> Unit,
    sortOptions: List<String> = listOf("Popular", "Top Rated", "Release Date"),
    selectedSort: String = "Popular",
    onFilterToggle: (Boolean) -> Unit,
    showMovies: Boolean,
    modifier: Modifier = Modifier,
    onLoadMore: () -> Unit = {}
) {
    Scaffold(
        topBar = {
            TopAppBar(
                title = { Text(genre) },
                actions = {
                    SegmentedButton(
                        options = listOf("Movies", "TV Shows", "All"),
                        selectedIndex = when {
                            showMovies -> 0
                            !showMovies -> 1
                            else -> 2
                        },
                        onOptionSelected = {
                            onFilterToggle(it == 0)
                        }
                    )
                    DropdownMenuButton(
                        options = sortOptions,
                        selectedOption = selectedSort,
                        onOptionSelected = onSortChange
                    )
                }
            )
        }
    ) { innerPadding ->
        Column(modifier = modifier.padding(innerPadding).fillMaxSize()) {
            LazyVerticalGrid(columns = androidx.compose.foundation.lazy.grid.GridCells.Fixed(2), modifier = Modifier.fillMaxSize().padding(8.dp)) {
                items(results) { item ->
                    MediaCard(
                        posterUrl = item.posterUrl,
                        title = item.title,
                        rating = item.rating,
                        onClick = { onResultClick(item) }
                    )
                }
                // Infinite scroll trigger
                item {
                    LaunchedEffect(results.size) {
                        onLoadMore()
                    }
                }
            }
        }
    }
}

@Composable
fun SegmentedButton(options: List<String>, selectedIndex: Int, onOptionSelected: (Int) -> Unit) {
    Row {
        options.forEachIndexed { index, option ->
            Button(
                onClick = { onOptionSelected(index) },
                colors = ButtonDefaults.buttonColors(
                    containerColor = if (selectedIndex == index) MaterialTheme.colorScheme.primary else MaterialTheme.colorScheme.surface
                ),
                modifier = Modifier.padding(end = 4.dp)
            ) {
                Text(option)
            }
        }
    }
}

@Composable
fun DropdownMenuButton(options: List<String>, selectedOption: String, onOptionSelected: (String) -> Unit) {
    var expanded by remember { mutableStateOf(false) }
    Box {
        Button(onClick = { expanded = true }) {
            Text(selectedOption)
        }
        DropdownMenu(expanded = expanded, onDismissRequest = { expanded = false }) {
            options.forEach { option ->
                DropdownMenuItem(text = { Text(option) }, onClick = {
                    onOptionSelected(option)
                    expanded = false
                })
            }
        }
    }
}
