package com.jstreamv2.domain.repository

import com.jstreamv2.data.local.WatchlistItem
import kotlinx.coroutines.flow.Flow

interface WatchlistRepository {
    suspend fun addWatchlist(item: WatchlistItem)
    suspend fun removeWatchlist(item: WatchlistItem)
    fun getAllWatchlist(): Flow<List<WatchlistItem>>
}
