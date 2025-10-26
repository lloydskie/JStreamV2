package com.jstreamv2.data.model

data class PersonTvCreditsResponse(
    val cast: List<TvDto>?,
    val crew: List<TvDto>?
)
