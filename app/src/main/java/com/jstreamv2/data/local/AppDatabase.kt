package com.jstreamv2.data.local

import androidx.room.Database
import androidx.room.RoomDatabase

@Database(
    entities = [
        FavoriteItem::class,
        WatchlistItem::class,
        CachedMovie::class,
        CachedTVShow::class,
        SearchHistory::class
    ],
    version = 1,
    exportSchema = false
)
abstract class AppDatabase : RoomDatabase() {
    abstract fun appDao(): AppDao
}
