package com.jstreamv2.domain.usecase

import com.jstreamv2.domain.repository.MovieRepository

class GetMovieDetailsUseCase(private val repository: MovieRepository) {
    operator fun invoke(id: Int) = repository.getMovieDetails(id)
}
