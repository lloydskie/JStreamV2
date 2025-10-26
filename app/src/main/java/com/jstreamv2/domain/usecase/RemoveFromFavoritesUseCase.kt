package com.jstreamv2.domain.usecase

import com.jstreamv2.domain.repository.FavoritesRepository
import com.jstreamv2.data.local.FavoriteItem

class RemoveFromFavoritesUseCase(private val repository: FavoritesRepository) {
    suspend operator fun invoke(item: FavoriteItem) = repository.removeFavorite(item)
}
