package com.jstreamv2.data.repository

import com.jstreamv2.data.remote.TmdbApiService
import com.jstreamv2.data.model.GenreListResponse
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow
import java.io.IOException

class GenreRepositoryImpl(
    private val api: TmdbApiService,
    private val authToken: String
) {
    fun getMovieGenres(): Flow<Result<GenreListResponse>> = flow {
        try {
            val response = api.getMovieGenres("Bearer $authToken")
            emit(Result.success(response))
        } catch (e: IOException) {
            emit(Result.failure(e))
        }
    }

    fun getTvGenres(): Flow<Result<GenreListResponse>> = flow {
        try {
            val response = api.getTvGenres("Bearer $authToken")
            emit(Result.success(response))
        } catch (e: IOException) {
            emit(Result.failure(e))
        }
    }
}
