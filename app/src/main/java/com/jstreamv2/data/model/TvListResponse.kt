package com.jstreamv2.data.model

data class TvListResponse(
    val page: Int,
    val results: List<TvDto>,
    val total_pages: Int,
    val total_results: Int
)

data class TvDto(
    val id: Int,
    val name: String?,
    val overview: String?,
    val poster_path: String?,
    val backdrop_path: String?,
    val first_air_date: String?,
    val vote_average: Double?,
    val genre_ids: List<Int>?
)
