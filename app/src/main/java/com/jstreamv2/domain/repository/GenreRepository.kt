package com.jstreamv2.domain.repository

import com.jstreamv2.data.model.GenreListResponse
import kotlinx.coroutines.flow.Flow

interface GenreRepository {
    fun getMovieGenres(): Flow<Result<GenreListResponse>>
    fun getTvGenres(): Flow<Result<GenreListResponse>>
}
