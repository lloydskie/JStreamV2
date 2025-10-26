package com.jstreamv2.presentation.ui

import presentation.ui.animation.FadeInImage
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Favorite
import androidx.compose.material.icons.filled.PlayArrow
import androidx.compose.material.icons.filled.Add
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.unit.dp
// Coil usage replaced with FadeInImage

@Composable
fun DetailScreen(
    backdropUrl: String?,
    posterUrl: String?,
    title: String?,
    rating: Double?,
    releaseYear: String?,
    runtimeOrSeasons: String?,
    isFavorite: Boolean,
    isWatchlist: Boolean,
    onPlayClick: () -> Unit,
    onFavoriteClick: () -> Unit,
    onWatchlistClick: () -> Unit,
    trailerKey: String?,
    overview: String?,
    cast: List<CastCardData>,
    similar: List<MediaCardData>,
    isTvShow: Boolean = false,
    seasons: List<SeasonData> = emptyList(),
    selectedSeason: SeasonData? = null,
    onSeasonSelect: (SeasonData) -> Unit = {},
    episodes: List<EpisodeData> = emptyList(),
    modifier: Modifier = Modifier,
    onBack: () -> Unit = {}
) {
    Scaffold(
        topBar = {
            TopAppBar(
                title = { Text(title ?: "") },
                navigationIcon = {
                    IconButton(onClick = onBack) {
                        Icon(Icons.Default.ArrowBack, contentDescription = "Back")
                    }
                }
            )
        }
    ) { innerPadding ->
        Column(modifier = modifier.padding(innerPadding).fillMaxSize()) {
            Box(modifier = Modifier.height(240.dp).fillMaxWidth()) {
                if (backdropUrl.isNullOrEmpty()) {
                    presentation.ui.animation.LoadingSkeleton(modifier = Modifier.fillMaxSize())
                } else {
                    FadeInImage(url = backdropUrl, contentDescription = title, modifier = Modifier.fillMaxSize())
                }
                Box(
                    modifier = Modifier.fillMaxSize().background(
                        Brush.verticalGradient(
                            colors = listOf(Color.Transparent, Color.Black),
                            startY = 0f, endY = 600f
                        )
                    )
                )
                Row(
                    modifier = Modifier.align(Alignment.BottomStart).padding(16.dp),
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    IconButton(onClick = onPlayClick) {
                        Icon(Icons.Default.PlayArrow, contentDescription = "Play")
                    }
                    IconButton(onClick = onFavoriteClick) {
                        Icon(Icons.Default.Favorite, contentDescription = "Favorite", tint = if (isFavorite) Color.Red else Color.White)
                    }
                    IconButton(onClick = onWatchlistClick) {
                        Icon(Icons.Default.Add, contentDescription = "Watchlist", tint = if (isWatchlist) Color.Yellow else Color.White)
                    }
                }
            }
            // Title, rating, year, runtime/seasons
            Row(modifier = Modifier.padding(16.dp), verticalAlignment = Alignment.CenterVertically) {
                FadeInImage(url = posterUrl, contentDescription = title, modifier = Modifier.size(100.dp))
                Spacer(Modifier.width(16.dp))
                Column {
                    Text(title ?: "", style = MaterialTheme.typography.headlineMedium)
                    Text("★ ${rating ?: "-"}", style = MaterialTheme.typography.labelLarge)
                    Text(releaseYear ?: "", style = MaterialTheme.typography.bodyLarge)
                    Text(runtimeOrSeasons ?: "", style = MaterialTheme.typography.bodyLarge)
                }
            }
            // Trailer
            if (trailerKey != null) {
                TrailerPlayer(videoUrl = "https://www.youtube.com/embed/$trailerKey", thumbnailUrl = null, autoPlay = true, modifier = Modifier.height(200.dp).fillMaxWidth())
            }
            // Overview
            overview?.let {
                Text(it, style = MaterialTheme.typography.bodyLarge, modifier = Modifier.padding(16.dp))
            }
            // Cast
            if (cast.isNotEmpty()) {
                Text("Cast", style = MaterialTheme.typography.headlineMedium, modifier = Modifier.padding(start = 16.dp, top = 8.dp))
                LazyRow(modifier = Modifier.padding(vertical = 8.dp)) {
                    items(cast) { member ->
                        CastMemberCard(photoUrl = member.photoUrl, name = member.name, modifier = Modifier.padding(end = 8.dp))
                    }
                }
            }
            // Similar content
            if (similar.isNotEmpty()) {
                Text("Similar", style = MaterialTheme.typography.headlineMedium, modifier = Modifier.padding(start = 16.dp, top = 8.dp))
                HorizontalMediaList(sectionTitle = "", items = similar)
            }
            // TV Show: Season selector and episode list
            if (isTvShow && seasons.isNotEmpty()) {
                Text("Seasons", style = MaterialTheme.typography.headlineMedium, modifier = Modifier.padding(start = 16.dp, top = 8.dp))
                LazyRow(modifier = Modifier.padding(vertical = 8.dp)) {
                    items(seasons) { season ->
                        GenreChip(
                            genre = season.name,
                            selected = season == selectedSeason,
                            onClick = { onSeasonSelect(season) },
                            modifier = Modifier.padding(end = 8.dp)
                        )
                    }
                }
                if (episodes.isNotEmpty()) {
                    Text("Episodes", style = MaterialTheme.typography.headlineMedium, modifier = Modifier.padding(start = 16.dp, top = 8.dp))
                    Column(modifier = Modifier.padding(horizontal = 16.dp)) {
                        episodes.forEach { episode ->
                            Text("${episode.episodeNumber}. ${episode.name}", style = MaterialTheme.typography.bodyLarge)
                        }
                    }
                }
            }
        }
    }
}

// Data classes for cast, seasons, episodes

data class CastCardData(val photoUrl: String?, val name: String?)
data class SeasonData(val name: String)
data class EpisodeData(val episodeNumber: Int, val name: String)
