package com.jstreamv2.domain.usecase

import com.jstreamv2.data.remote.TmdbApiService
import com.jstreamv2.util.TrailerFilterUtil
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow
import java.io.IOException

class GetTVShowTrailerUseCase(private val api: TmdbApiService, private val authToken: String) {
    fun invoke(seriesId: Int): Flow<Result<com.jstreamv2.data.model.VideoDto?>> = flow {
        try {
            val videos = api.getTvVideos("Bearer $authToken", seriesId)
            val teaser = TrailerFilterUtil.filterTvTeaser(videos)
            emit(Result.success(teaser))
        } catch (e: IOException) {
            emit(Result.failure(e))
        }
    }
}
