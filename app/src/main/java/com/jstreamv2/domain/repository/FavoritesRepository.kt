package com.jstreamv2.domain.repository

import com.jstreamv2.data.local.FavoriteItem
import kotlinx.coroutines.flow.Flow

interface FavoritesRepository {
    suspend fun addFavorite(item: FavoriteItem)
    suspend fun removeFavorite(item: FavoriteItem)
    fun getAllFavorites(): Flow<List<FavoriteItem>>
}
