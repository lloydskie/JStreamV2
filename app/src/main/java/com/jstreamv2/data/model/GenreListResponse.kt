package com.jstreamv2.data.model

data class GenreListResponse(
    val genres: List<GenreDto>
)

data class GenreDto(
    val id: Int,
    val name: String
)
