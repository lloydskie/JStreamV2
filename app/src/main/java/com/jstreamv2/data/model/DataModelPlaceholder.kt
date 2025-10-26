
package com.jstreamv2.data.model

import androidx.room.Entity
import androidx.room.PrimaryKey

// ...existing code...

@Entity(tableName = "favorites")
data class FavoriteEntity(
	@PrimaryKey val id: Int,
	val movieId: Int
)

@Entity(tableName = "watchlist")
data class WatchlistEntity(
	@PrimaryKey val id: Int,
	val movieId: Int
)
