package com.jstreamv2.data.model

data class TvDetailsResponse(
    val id: Int,
    val name: String?,
    val overview: String?,
    val poster_path: String?,
    val backdrop_path: String?,
    val first_air_date: String?,
    val vote_average: Double?,
    val genres: List<GenreDto>?,
    val number_of_seasons: Int?,
    val number_of_episodes: Int?,
    val status: String?,
    val tagline: String?,
    val homepage: String?
)
