package com.jstreamv2.domain.usecase

import com.jstreamv2.domain.repository.FavoritesRepository

class GetFavoritesUseCase(private val repository: FavoritesRepository) {
    operator fun invoke() = repository.getAllFavorites()
}
