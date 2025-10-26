package com.jstreamv2.domain.repository

import com.jstreamv2.data.model.MovieListResponse
import com.jstreamv2.data.model.TvListResponse
import com.jstreamv2.data.model.PersonListResponse
import com.jstreamv2.data.local.SearchHistory
import kotlinx.coroutines.flow.Flow

interface SearchRepository {
    fun searchMovies(query: String, page: Int = 1): Flow<Result<MovieListResponse>>
    fun searchTv(query: String, page: Int = 1): Flow<Result<TvListResponse>>
    fun searchPerson(query: String, page: Int = 1): Flow<Result<PersonListResponse>>
    suspend fun addSearchHistory(history: SearchHistory)
    fun getAllSearchHistory(): Flow<List<SearchHistory>>
    suspend fun deleteSearchHistory(id: Int)
    suspend fun clearSearchHistory()
}
