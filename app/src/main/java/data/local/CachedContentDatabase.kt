package data.local

import android.content.Context
import androidx.room.*
import kotlinx.coroutines.flow.Flow
import java.util.*

@Entity(tableName = "cached_content", indices = [Index(value = ["cachedAt"]), Index(value = ["type"]), Index(value = ["id"], unique = true)])
data class CachedContent(
    @PrimaryKey val id: Int,
    val type: String, // "movie" or "tv"
    val title: String,
    val detailsJson: String,
    val posterPath: String?,
    val backdropPath: String?,
    val cachedAt: Long = System.currentTimeMillis()
)

@Dao
interface CachedContentDao {
    @Query("SELECT * FROM cached_content WHERE id = :id AND type = :type")
    suspend fun getCachedContent(id: Int, type: String): CachedContent?

    @Query("SELECT * FROM cached_content WHERE cachedAt > :minTime")
    fun getRecentCachedContent(minTime: Long): Flow<List<CachedContent>>

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun cacheContent(content: CachedContent)

    @Query("DELETE FROM cached_content WHERE cachedAt < :maxTime")
    suspend fun clearOldCache(maxTime: Long)

    @Query("DELETE FROM cached_content")
    suspend fun clearAllCache()

    @Query("SELECT SUM(LENGTH(detailsJson)) FROM cached_content")
    suspend fun getCacheSize(): Long?
}

@Dao
interface VideoProgressDao {
    @Query("SELECT * FROM video_progress WHERE playbackId = :playbackId")
    suspend fun getProgress(playbackId: String): VideoProgress?

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun upsert(progress: VideoProgress)

    @Query("DELETE FROM video_progress WHERE positionMs >= durationMs")
    suspend fun clearCompleted()

    @Query("DELETE FROM video_progress WHERE updatedAt < :cutoff")
    suspend fun clearOld(cutoff: Long)
}

@Database(entities = [CachedContent::class, VideoProgress::class], version = 1)
abstract class CachedContentDatabase : RoomDatabase() {
    abstract fun cachedContentDao(): CachedContentDao
    abstract fun videoProgressDao(): VideoProgressDao

    companion object {
        @Volatile private var INSTANCE: CachedContentDatabase? = null
        fun getInstance(context: Context): CachedContentDatabase =
            INSTANCE ?: synchronized(this) {
                INSTANCE ?: Room.databaseBuilder(
                    context.applicationContext,
                    CachedContentDatabase::class.java,
                    "cached_content.db"
                ).build().also { INSTANCE = it }
            }
    }
}
