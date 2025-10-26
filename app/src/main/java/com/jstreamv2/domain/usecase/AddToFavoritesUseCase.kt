package com.jstreamv2.domain.usecase

import com.jstreamv2.domain.repository.FavoritesRepository
import com.jstreamv2.data.local.FavoriteItem

class AddToFavoritesUseCase(private val repository: FavoritesRepository) {
    suspend operator fun invoke(item: FavoriteItem) = repository.addFavorite(item)
}
