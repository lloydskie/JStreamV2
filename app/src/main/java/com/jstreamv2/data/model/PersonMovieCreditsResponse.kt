package com.jstreamv2.data.model

data class PersonMovieCreditsResponse(
    val cast: List<MovieDto>?,
    val crew: List<MovieDto>?
)
