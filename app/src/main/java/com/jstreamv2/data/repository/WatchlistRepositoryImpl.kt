package com.jstreamv2.data.repository

import com.jstreamv2.data.local.AppDao
import com.jstreamv2.data.local.WatchlistItem
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow

class WatchlistRepositoryImpl(private val dao: AppDao) {
    suspend fun addWatchlist(item: WatchlistItem) = dao.addWatchlist(item)
    suspend fun removeWatchlist(item: WatchlistItem) = dao.removeWatchlist(item)
    fun getAllWatchlist(): Flow<List<WatchlistItem>> = flow { emit(dao.getAllWatchlist()) }
}
