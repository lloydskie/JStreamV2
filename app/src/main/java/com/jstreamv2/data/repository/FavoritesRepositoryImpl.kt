package com.jstreamv2.data.repository

import com.jstreamv2.data.local.AppDao
import com.jstreamv2.data.local.FavoriteItem
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow

class FavoritesRepositoryImpl(private val dao: AppDao) {
    suspend fun addFavorite(item: FavoriteItem) = dao.addFavorite(item)
    suspend fun removeFavorite(item: FavoriteItem) = dao.removeFavorite(item)
    fun getAllFavorites(): Flow<List<FavoriteItem>> = flow { emit(dao.getAllFavorites()) }
}
