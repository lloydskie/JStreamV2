package com.jstreamv2.domain.usecase

import com.jstreamv2.domain.repository.WatchlistRepository

class GetWatchlistUseCase(private val repository: WatchlistRepository) {
    operator fun invoke() = repository.getAllWatchlist()
}
