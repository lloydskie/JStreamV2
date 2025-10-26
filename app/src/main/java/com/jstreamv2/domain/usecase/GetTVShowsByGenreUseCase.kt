package com.jstreamv2.domain.usecase

import com.jstreamv2.data.remote.TmdbApiService
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow
import java.io.IOException

class GetTVShowsByGenreUseCase(private val api: TmdbApiService, private val authToken: String) {
    fun invoke(genreId: Int, page: Int = 1): Flow<Result<com.jstreamv2.data.model.TvListResponse>> = flow {
        try {
            val response = api.discoverTv("Bearer $authToken", genreId, page)
            emit(Result.success(response))
        } catch (e: IOException) {
            emit(Result.failure(e))
        }
    }
}
