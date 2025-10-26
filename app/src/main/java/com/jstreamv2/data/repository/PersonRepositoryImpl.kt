package com.jstreamv2.data.repository

import com.jstreamv2.data.remote.TmdbApiService
import com.jstreamv2.data.model.PersonMovieCreditsResponse
import com.jstreamv2.data.model.PersonTvCreditsResponse
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow
import java.io.IOException

class PersonRepositoryImpl(
    private val api: TmdbApiService,
    private val authToken: String
) {
    fun getPersonMovieCredits(personId: Int): Flow<Result<PersonMovieCreditsResponse>> = flow {
        try {
            val response = api.getPersonMovieCredits("Bearer $authToken", personId)
            emit(Result.success(response))
        } catch (e: IOException) {
            emit(Result.failure(e))
        }
    }

    fun getPersonTvCredits(personId: Int): Flow<Result<PersonTvCreditsResponse>> = flow {
        try {
            val response = api.getPersonTvCredits("Bearer $authToken", personId)
            emit(Result.success(response))
        } catch (e: IOException) {
            emit(Result.failure(e))
        }
    }
}
