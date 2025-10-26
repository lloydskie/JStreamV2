package com.jstreamv2.domain.usecase

import com.jstreamv2.domain.repository.TVShowRepository

class GetTVShowDetailsUseCase(private val repository: TVShowRepository) {
    operator fun invoke(id: Int) = repository.getTvDetails(id)
}
