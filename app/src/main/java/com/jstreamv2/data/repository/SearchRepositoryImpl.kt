package com.jstreamv2.data.repository

import com.jstreamv2.data.local.AppDao
import com.jstreamv2.data.local.SearchHistory
import com.jstreamv2.data.remote.TmdbApiService
import com.jstreamv2.data.model.MovieListResponse
import com.jstreamv2.data.model.TvListResponse
import com.jstreamv2.data.model.PersonListResponse
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow
import java.io.IOException

class SearchRepositoryImpl(
    private val api: TmdbApiService,
    private val dao: AppDao,
    private val authToken: String
) {
    fun searchMovies(query: String, page: Int = 1): Flow<Result<MovieListResponse>> = flow {
        try {
            val response = api.searchMovies("Bearer $authToken", query, page)
            emit(Result.success(response))
        } catch (e: IOException) {
            emit(Result.failure(e))
        }
    }

    fun searchTv(query: String, page: Int = 1): Flow<Result<TvListResponse>> = flow {
        try {
            val response = api.searchTv("Bearer $authToken", query, page)
            emit(Result.success(response))
        } catch (e: IOException) {
            emit(Result.failure(e))
        }
    }

    fun searchPerson(query: String, page: Int = 1): Flow<Result<PersonListResponse>> = flow {
        try {
            val response = api.searchPerson("Bearer $authToken", query, page)
            emit(Result.success(response))
        } catch (e: IOException) {
            emit(Result.failure(e))
        }
    }

    suspend fun addSearchHistory(history: SearchHistory) = dao.addSearchHistory(history)
    fun getAllSearchHistory(): Flow<List<SearchHistory>> = flow { emit(dao.getAllSearchHistory()) }
    suspend fun deleteSearchHistory(id: Int) = dao.deleteSearchHistory(id)
    suspend fun clearSearchHistory() = dao.clearSearchHistory()
}
