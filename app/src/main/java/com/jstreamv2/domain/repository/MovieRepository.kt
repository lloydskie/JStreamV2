package com.jstreamv2.domain.repository

import com.jstreamv2.data.model.MovieListResponse
import com.jstreamv2.data.model.MovieDetailsResponse
import kotlinx.coroutines.flow.Flow

interface MovieRepository {
    fun getPopularMovies(page: Int = 1): Flow<Result<MovieListResponse>>
    fun getMovieDetails(id: Int): Flow<Result<MovieDetailsResponse>>
    suspend fun cacheMovie(movie: com.jstreamv2.data.local.CachedMovie)
    suspend fun clearOldCachedMovies(threshold: Long)
}
