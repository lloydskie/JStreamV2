package com.jstreamv2.data.local

import androidx.room.*

@Dao
interface AppDao {
    // Favorites
    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun addFavorite(item: FavoriteItem)

    @Delete
    suspend fun removeFavorite(item: FavoriteItem)

    @Query("SELECT * FROM favorite_items")
    suspend fun getAllFavorites(): List<FavoriteItem>

    // Watchlist
    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun addWatchlist(item: WatchlistItem)

    @Delete
    suspend fun removeWatchlist(item: WatchlistItem)

    @Query("SELECT * FROM watchlist_items")
    suspend fun getAllWatchlist(): List<WatchlistItem>

    // Cached Movies
    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun cacheMovie(movie: CachedMovie)

    @Query("SELECT * FROM cached_movies WHERE id = :id")
    suspend fun getCachedMovie(id: Int): CachedMovie?

    @Query("DELETE FROM cached_movies WHERE cachedDate < :threshold")
    suspend fun clearOldCachedMovies(threshold: Long)

    // Cached TV Shows
    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun cacheTVShow(tvShow: CachedTVShow)

    @Query("SELECT * FROM cached_tv_shows WHERE id = :id")
    suspend fun getCachedTVShow(id: Int): CachedTVShow?

    @Query("DELETE FROM cached_tv_shows WHERE cachedDate < :threshold")
    suspend fun clearOldCachedTVShows(threshold: Long)

    // Search History
    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun addSearchHistory(history: SearchHistory)

    @Query("SELECT * FROM search_history ORDER BY timestamp DESC")
    suspend fun getAllSearchHistory(): List<SearchHistory>

    @Query("DELETE FROM search_history WHERE id = :id")
    suspend fun deleteSearchHistory(id: Int)

    @Query("DELETE FROM search_history")
    suspend fun clearSearchHistory()
}
