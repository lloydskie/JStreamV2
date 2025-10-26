package com.jstreamv2.data.model

data class CreditsResponse(
    val id: Int?,
    val cast: List<CastDto>?,
    val crew: List<CrewDto>?
)

data class CastDto(
    val id: Int?,
    val name: String?,
    val character: String?,
    val profile_path: String?
)

data class CrewDto(
    val id: Int?,
    val name: String?,
    val job: String?,
    val profile_path: String?
)
