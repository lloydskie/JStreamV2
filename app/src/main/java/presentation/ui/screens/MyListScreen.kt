package com.jstreamv2.presentation.ui.screens

import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.foundation.background
import androidx.compose.foundation.gestures.detectSwipe
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.foundation.lazy.grid.items
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.input.pointer.pointerInput
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.graphics.Color
import com.jstreamv2.presentation.ui.MediaCard
import kotlinx.coroutines.launch

// Data models (replace with actual Room entities)
data class MyListItem(
    val id: Int,
    val title: String,
    val posterPath: String?,
    val rating: Float,
    val addedAt: Long
)

@OptIn(ExperimentalFoundationApi::class)
@Composable
fun MyListScreen(
    favorites: List<MyListItem>,
    watchlist: List<MyListItem>,
    isOnline: Boolean,
    onDelete: (itemId: Int, isFavorite: Boolean) -> Unit,
    onItemClick: (itemId: Int) -> Unit,
    modifier: Modifier = Modifier
) {
    var selectedTab by remember { mutableStateOf(0) }
    val tabTitles = listOf("Favorites", "Watchlist")
    var sortOption by remember { mutableStateOf(SortOption.RECENT) }
    val scope = rememberCoroutineScope()

    Column(modifier = modifier.fillMaxSize()) {
        // Sync indicator
        if (isOnline) {
            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .background(Color(0xFF388E3C))
                    .padding(4.dp),
                verticalAlignment = Alignment.CenterVertically
            ) {
                Icon(Icons.Default.Sync, contentDescription = "Sync", tint = Color.White)
                Text("Synced", color = Color.White, modifier = Modifier.padding(start = 8.dp))
            }
        }
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
        // Sort options
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(8.dp),
            verticalAlignment = Alignment.CenterVertically
        ) {
            Text("Sort by:", fontWeight = FontWeight.Bold)
            Spacer(Modifier.width(8.dp))
            SortDropdown(sortOption) { sortOption = it }
        }
        // List content
        val items = when (selectedTab) {
            0 -> sortItems(favorites, sortOption)
            1 -> sortItems(watchlist, sortOption)
            else -> emptyList()
        }
        if (items.isEmpty()) {
            EmptyState(tabTitles[selectedTab])
        } else {
            LazyVerticalGrid(
                columns = GridCells.Fixed(3),
                modifier = Modifier.fillMaxSize(),
                contentPadding = PaddingValues(8.dp)
            ) {
                items(items) { item ->
                    var dismissed by remember { mutableStateOf(false) }
                    if (!dismissed) {
                        Box(
                            modifier = Modifier
                                .padding(4.dp)
                                // swipe-to-delete removed; use long-press or action UI to delete
                                
                        ) {
                            MediaCard(
                                title = item.title,
                                posterPath = item.posterPath,
                                modifier = Modifier.clickable { onItemClick(item.id) }
                            )
                        }
                    }
                }
            }
        }
    }
}

enum class SortOption { RECENT, TITLE, RATING }

@Composable
fun SortDropdown(selected: SortOption, onSelect: (SortOption) -> Unit) {
    var expanded by remember { mutableStateOf(false) }
    Box {
        Button(onClick = { expanded = true }) {
            Text(
                when (selected) {
                    SortOption.RECENT -> "Recently Added"
                    SortOption.TITLE -> "Title A-Z"
                    SortOption.RATING -> "Rating"
                }
            )
        }
        DropdownMenu(expanded = expanded, onDismissRequest = { expanded = false }) {
            DropdownMenuItem(text = { Text("Recently Added") }, onClick = { onSelect(SortOption.RECENT); expanded = false })
            DropdownMenuItem(text = { Text("Title A-Z") }, onClick = { onSelect(SortOption.TITLE); expanded = false })
            DropdownMenuItem(text = { Text("Rating") }, onClick = { onSelect(SortOption.RATING); expanded = false })
        }
    }
}

fun sortItems(items: List<MyListItem>, option: SortOption): List<MyListItem> = when (option) {
    SortOption.RECENT -> items.sortedByDescending { it.addedAt }
    SortOption.TITLE -> items.sortedBy { it.title }
    SortOption.RATING -> items.sortedByDescending { it.rating }
}

@Composable
fun EmptyState(tab: String) {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(32.dp),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text("No $tab yet!", style = MaterialTheme.typography.headlineSmall)
        Spacer(Modifier.height(16.dp))
        Button(onClick = { /* TODO: Add call-to-action */ }) {
            Text("Browse and add $tab")
        }
    }
}

// swipe helper removed to simplify compilation; implement with Compose SwipeToDismiss if needed
