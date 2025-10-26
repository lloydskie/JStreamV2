package com.jstreamv2.domain.usecase

import com.jstreamv2.data.remote.TmdbApiService
import com.jstreamv2.util.TrailerFilterUtil
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow
import java.io.IOException

class GetMovieTrailerUseCase(private val api: TmdbApiService, private val authToken: String) {
    fun invoke(movieId: Int): Flow<Result<com.jstreamv2.data.model.VideoDto?>> = flow {
        try {
            val videos = api.getMovieVideos("Bearer $authToken", movieId)
            val trailer = TrailerFilterUtil.filterMovieTrailer(videos)
            emit(Result.success(trailer))
        } catch (e: IOException) {
            emit(Result.failure(e))
        }
    }
}
