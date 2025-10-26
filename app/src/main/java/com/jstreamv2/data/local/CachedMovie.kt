package com.jstreamv2.data.local

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "cached_movies")
data class CachedMovie(
    @PrimaryKey val id: Int,
    val title: String?,
    val overview: String?,
    val posterPath: String?,
    val backdropPath: String?,
    val releaseDate: String?,
    val voteAverage: Double?,
    val genres: String?, // Comma-separated genre names
    val runtime: Int?,
    val status: String?,
    val tagline: String?,
    val homepage: String?,
    val cachedDate: Long
)
