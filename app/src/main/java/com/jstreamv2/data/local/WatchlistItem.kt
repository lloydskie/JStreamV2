package com.jstreamv2.data.local

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "watchlist_items")
data class WatchlistItem(
    @PrimaryKey val id: Int,
    val mediaType: String,
    val title: String?,
    val posterPath: String?,
    val overview: String?,
    val rating: Double?,
    val addedDate: Long
)
