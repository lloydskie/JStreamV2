
package com.jstreamv2.data.local

import androidx.room.*
import com.jstreamv2.data.model.FavoriteEntity
import com.jstreamv2.data.model.WatchlistEntity

@Dao
interface FavoritesDao {
	@Query("SELECT * FROM favorites")
	fun getAll(): List<FavoriteEntity>

	@Insert(onConflict = OnConflictStrategy.REPLACE)
	fun insert(favorite: FavoriteEntity)

	@Delete
	fun delete(favorite: FavoriteEntity)
}

@Dao
interface WatchlistDao {
	@Query("SELECT * FROM watchlist")
	fun getAll(): List<WatchlistEntity>

	@Insert(onConflict = OnConflictStrategy.REPLACE)
	fun insert(item: WatchlistEntity)

	@Delete
	fun delete(item: WatchlistEntity)
}

// ...existing code...
