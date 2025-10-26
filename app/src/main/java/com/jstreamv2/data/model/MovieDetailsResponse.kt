package com.jstreamv2.data.model

data class MovieDetailsResponse(
    val id: Int,
    val title: String?,
    val overview: String?,
    val poster_path: String?,
    val backdrop_path: String?,
    val release_date: String?,
    val vote_average: Double?,
    val genres: List<GenreDto>?,
    val runtime: Int?,
    val status: String?,
    val tagline: String?,
    val homepage: String?
)
