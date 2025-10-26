package data.repository

import com.jstreamv2.data.local.AppDao
import data.local.VideoProgressDao
import com.jstreamv2.data.local.FavoriteItem
import com.jstreamv2.data.local.SearchHistory
import com.jstreamv2.data.local.CachedMovie
import com.jstreamv2.data.local.CachedTVShow
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow
import kotlin.math.min

// Simple score-based recommender: favorites + recent search terms + continue watching progress
class RecommendationsRepository(
    private val appDao: AppDao,
    private val progressDao: VideoProgressDao
) {
    suspend fun getRecommendations(): List<RecommendedItem> {
        val favorites = appDao.getAllFavorites()
        val watchlist = appDao.getAllWatchlist()
        val searches = appDao.getAllSearchHistory()

        // Start with favorites (score 100)
        val favItems = favorites.map { RecommendedItem(it.id, it.title ?: "", score = 100) }

        // Progress-based: items with progress but not completed
        // For simplicity, we'll query progress manually by fetching all cached items and matching
        val progressCandidates = mutableListOf<RecommendedItem>()
        // This is a simple heuristic; for full implementation iterate over VideoProgress table
        // For now, promote watchlist items
        val watchItems = watchlist.map { RecommendedItem(it.id, it.title ?: "", score = 80) }

        // Search-based: promote items related to recent searches (simple frequency)
        val searchFreq = searches.groupBy { it.query }.mapValues { it.value.size }
        val searchItems = searchFreq.entries.map { RecommendedItem(0, it.key, score = min(50, it.value * 10)) }

        val combined = (favItems + watchItems + searchItems + progressCandidates).sortedByDescending { it.score }
        return combined
    }
}

data class RecommendedItem(val id: Int, val title: String, val score: Int)
