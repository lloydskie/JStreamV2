package com.jstreamv2.domain.usecase

import com.jstreamv2.domain.repository.MovieRepository

class GetTopRatedMoviesUseCase(private val repository: MovieRepository) {
    operator fun invoke(page: Int = 1) = repository.getPopularMovies(page) // Replace with getTopRatedMovies when implemented
}
