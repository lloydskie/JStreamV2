package com.jstreamv2.domain.usecase

import com.jstreamv2.domain.repository.MovieRepository

class GetPopularMoviesUseCase(private val repository: MovieRepository) {
    operator fun invoke(page: Int = 1) = repository.getPopularMovies(page)
}
