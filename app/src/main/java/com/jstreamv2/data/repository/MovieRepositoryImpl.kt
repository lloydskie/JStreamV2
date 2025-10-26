package com.jstreamv2.data.repository

import com.jstreamv2.data.local.AppDao
import com.jstreamv2.data.local.CachedMovie
import com.jstreamv2.data.remote.TmdbApiService
import com.jstreamv2.data.model.MovieListResponse
import com.jstreamv2.data.model.MovieDetailsResponse
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow
import java.io.IOException

class MovieRepositoryImpl(
    private val api: TmdbApiService,
    private val dao: AppDao,
    private val authToken: String
) {
    fun getPopularMovies(page: Int = 1): Flow<Result<MovieListResponse>> = flow {
        try {
            val response = api.getPopularMovies("Bearer $authToken", page)
            emit(Result.success(response))
        } catch (e: IOException) {
            emit(Result.failure(e))
        }
    }

    fun getMovieDetails(id: Int): Flow<Result<MovieDetailsResponse>> = flow {
        try {
            val response = api.getMovieDetails("Bearer $authToken", id)
            emit(Result.success(response))
        } catch (e: IOException) {
            val cached = dao.getCachedMovie(id)
            if (cached != null) {
                // Map CachedMovie to MovieDetailsResponse as needed
                emit(Result.success(MovieDetailsResponse(
                    id = cached.id,
                    title = cached.title,
                    overview = cached.overview,
                    poster_path = cached.posterPath,
                    backdrop_path = cached.backdropPath,
                    release_date = cached.releaseDate,
                    vote_average = cached.voteAverage,
                    genres = null, // Parse genres string if needed
                    runtime = cached.runtime,
                    status = cached.status,
                    tagline = cached.tagline,
                    homepage = cached.homepage
                )))
            } else {
                emit(Result.failure(e))
            }
        }
    }

    suspend fun cacheMovie(movie: CachedMovie) = dao.cacheMovie(movie)
    suspend fun clearOldCachedMovies(threshold: Long) = dao.clearOldCachedMovies(threshold)
}
