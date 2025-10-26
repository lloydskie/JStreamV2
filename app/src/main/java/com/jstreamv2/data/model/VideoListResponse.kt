package com.jstreamv2.data.model

data class VideoListResponse(
    val id: Int?,
    val results: List<VideoDto>
)

data class VideoDto(
    val id: String?,
    val key: String?,
    val name: String?,
    val site: String?,
    val type: String?,
    val official: Boolean?
)
