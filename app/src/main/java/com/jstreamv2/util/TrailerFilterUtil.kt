package com.jstreamv2.util

import com.jstreamv2.data.model.VideoDto
import com.jstreamv2.data.model.VideoListResponse

object TrailerFilterUtil {
    fun filterMovieTrailer(videos: VideoListResponse?): VideoDto? {
        return videos?.results?.firstOrNull {
            it.name?.contains("Official Trailer", ignoreCase = true) == true &&
            it.site?.equals("YouTube", ignoreCase = true) == true &&
            it.type?.equals("Trailer", ignoreCase = true) == true &&
            it.official == true
        }
    }

    fun filterTvTeaser(videos: VideoListResponse?): VideoDto? {
        return videos?.results?.firstOrNull {
            it.name?.contains("Official Teaser", ignoreCase = true) == true &&
            it.site?.equals("YouTube", ignoreCase = true) == true &&
            it.type?.equals("Teaser", ignoreCase = true) == true &&
            it.official == true
        }
    }
}
