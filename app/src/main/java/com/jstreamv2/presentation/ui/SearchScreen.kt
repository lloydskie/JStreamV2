package com.jstreamv2.presentation.ui

import androidx.compose.animation.Crossfade
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.foundation.lazy.grid.items
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Search
import androidx.compose.foundation.clickable
import kotlinx.coroutines.launch
import kotlinx.coroutines.delay
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import kotlinx.coroutines.Job
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch

@Composable
fun SearchScreen(
    query: String,
    onQueryChange: (String) -> Unit,
    onClearQuery: () -> Unit,
    searchResults: SearchResults,
    searchHistory: List<String>,
    onHistoryClick: (String) -> Unit,
    onClearHistory: () -> Unit,
    onResultClick: (SearchResultItem) -> Unit,
    onPersonClick: (SearchResultItem) -> Unit,
    modifier: Modifier = Modifier
) {
    var selectedTab by remember { mutableStateOf(0) }
    val tabs = listOf("Movies", "TV Shows", "Persons")
    val scope = androidx.compose.runtime.rememberCoroutineScope()
    var debounceJob by remember { mutableStateOf<Job?>(null) }

    Column(modifier = modifier.fillMaxSize()) {
        SearchBar(
            query = query,
            onQueryChange = {
                debounceJob?.cancel()
                debounceJob = scope.launch {
                    delay(500)
                    onQueryChange(it)
                }
            },
            onClear = onClearQuery
        )
        TabRow(selectedTabIndex = selectedTab) {
            tabs.forEachIndexed { index, title ->
                Tab(
                    selected = selectedTab == index,
                    onClick = { selectedTab = index },
                    text = { Text(title) }
                )
            }
        }
        if (searchHistory.isNotEmpty()) {
            Row(
                modifier = Modifier.fillMaxWidth().padding(8.dp),
                verticalAlignment = Alignment.CenterVertically
            ) {
                Text("Recent Searches:", style = MaterialTheme.typography.labelLarge)
                Spacer(Modifier.weight(1f))
                TextButton(onClick = onClearHistory) { Text("Clear History") }
            }
            LazyRow(modifier = Modifier.padding(bottom = 8.dp)) {
                items(searchHistory) { history ->
                    GenreChip(genre = history, onClick = { onHistoryClick(history) }, modifier = Modifier.padding(end = 8.dp))
                }
            }
        }
        Crossfade(targetState = selectedTab) { tabIndex ->
            val results = when (tabIndex) {
                0 -> searchResults.movies
                1 -> searchResults.tvShows
                2 -> searchResults.persons
                else -> emptyList()
            }
            if (results.isEmpty()) {
                EmptyState(message = "No results found.")
            } else {
                LazyVerticalGrid(columns = GridCells.Fixed(2), modifier = Modifier.fillMaxSize().padding(8.dp)) {
                    items(results) { item ->
                        when (tabIndex) {
                            2 -> CastMemberCard(photoUrl = item.imageUrl, name = item.title, onClick = { onPersonClick(item) })
                            else -> MediaCard(posterUrl = item.imageUrl, title = item.title, rating = item.rating, onClick = { onResultClick(item) })
                        }
                    }
                }
            }
        }
    }
}

// Data classes for search results

data class SearchResults(
    val movies: List<SearchResultItem> = emptyList(),
    val tvShows: List<SearchResultItem> = emptyList(),
    val persons: List<SearchResultItem> = emptyList()
)

data class SearchResultItem(
    val id: Int,
    val title: String?,
    val imageUrl: String?,
    val rating: Double? = null
)
