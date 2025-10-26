package com.jstreamv2.data.local

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "cached_tv_shows")
data class CachedTVShow(
    @PrimaryKey val id: Int,
    val name: String?,
    val overview: String?,
    val posterPath: String?,
    val backdropPath: String?,
    val firstAirDate: String?,
    val voteAverage: Double?,
    val genres: String?, // Comma-separated genre names
    val numberOfSeasons: Int?,
    val numberOfEpisodes: Int?,
    val status: String?,
    val tagline: String?,
    val homepage: String?,
    val cachedDate: Long
)
