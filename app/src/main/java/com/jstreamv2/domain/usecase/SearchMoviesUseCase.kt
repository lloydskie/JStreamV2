package com.jstreamv2.domain.usecase

import com.jstreamv2.domain.repository.SearchRepository

class SearchMoviesUseCase(private val repository: SearchRepository) {
    operator fun invoke(query: String, page: Int = 1) = repository.searchMovies(query, page)
}
