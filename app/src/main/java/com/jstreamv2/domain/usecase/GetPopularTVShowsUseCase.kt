package com.jstreamv2.domain.usecase

import com.jstreamv2.domain.repository.TVShowRepository

class GetPopularTVShowsUseCase(private val repository: TVShowRepository) {
    operator fun invoke(page: Int = 1) = repository.getPopularTv(page)
}
