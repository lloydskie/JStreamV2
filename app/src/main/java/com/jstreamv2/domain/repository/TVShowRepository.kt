package com.jstreamv2.domain.repository

import com.jstreamv2.data.model.TvListResponse
import com.jstreamv2.data.model.TvDetailsResponse
import kotlinx.coroutines.flow.Flow

interface TVShowRepository {
    fun getPopularTv(page: Int = 1): Flow<Result<TvListResponse>>
    fun getTvDetails(id: Int): Flow<Result<TvDetailsResponse>>
    suspend fun cacheTVShow(tvShow: com.jstreamv2.data.local.CachedTVShow)
    suspend fun clearOldCachedTVShows(threshold: Long)
}
