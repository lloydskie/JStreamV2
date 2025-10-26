package com.jstreamv2.data.model

data class PersonListResponse(
    val page: Int,
    val results: List<PersonDto>,
    val total_pages: Int,
    val total_results: Int
)

data class PersonDto(
    val id: Int,
    val name: String?,
    val profile_path: String?,
    val known_for_department: String?
)
