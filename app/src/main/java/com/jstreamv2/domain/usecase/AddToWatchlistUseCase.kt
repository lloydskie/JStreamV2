package com.jstreamv2.domain.usecase

import com.jstreamv2.domain.repository.WatchlistRepository
import com.jstreamv2.data.local.WatchlistItem

class AddToWatchlistUseCase(private val repository: WatchlistRepository) {
    suspend operator fun invoke(item: WatchlistItem) = repository.addWatchlist(item)
}
