package data.local

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "video_progress")
data class VideoProgress(
    @PrimaryKey val playbackId: String, // e.g., "tv_{showId}_s{season}_e{episode}" or "movie_{id}"
    val mediaId: Int,
    val mediaType: String,
    val positionMs: Long,
    val durationMs: Long,
    val updatedAt: Long = System.currentTimeMillis()
)

// VideoProgressDao is declared in CachedContentDatabase.kt
