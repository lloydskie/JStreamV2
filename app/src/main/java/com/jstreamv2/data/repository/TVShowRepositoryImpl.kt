package com.jstreamv2.data.repository

import com.jstreamv2.data.local.AppDao
import com.jstreamv2.data.local.CachedTVShow
import com.jstreamv2.data.remote.TmdbApiService
import com.jstreamv2.data.model.TvListResponse
import com.jstreamv2.data.model.TvDetailsResponse
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow
import java.io.IOException

class TVShowRepositoryImpl(
    private val api: TmdbApiService,
    private val dao: AppDao,
    private val authToken: String
) {
    fun getPopularTv(page: Int = 1): Flow<Result<TvListResponse>> = flow {
        try {
            val response = api.getPopularTv("Bearer $authToken", page)
            emit(Result.success(response))
        } catch (e: IOException) {
            emit(Result.failure(e))
        }
    }

    fun getTvDetails(id: Int): Flow<Result<TvDetailsResponse>> = flow {
        try {
            val response = api.getTvDetails("Bearer $authToken", id)
            emit(Result.success(response))
        } catch (e: IOException) {
            val cached = dao.getCachedTVShow(id)
            if (cached != null) {
                emit(Result.success(TvDetailsResponse(
                    id = cached.id,
                    name = cached.name,
                    overview = cached.overview,
                    poster_path = cached.posterPath,
                    backdrop_path = cached.backdropPath,
                    first_air_date = cached.firstAirDate,
                    vote_average = cached.voteAverage,
                    genres = null, // Parse genres string if needed
                    number_of_seasons = cached.numberOfSeasons,
                    number_of_episodes = cached.numberOfEpisodes,
                    status = cached.status,
                    tagline = cached.tagline,
                    homepage = cached.homepage
                )))
            } else {
                emit(Result.failure(e))
            }
        }
    }

    suspend fun cacheTVShow(tvShow: CachedTVShow) = dao.cacheTVShow(tvShow)
    suspend fun clearOldCachedTVShows(threshold: Long) = dao.clearOldCachedTVShows(threshold)
}
