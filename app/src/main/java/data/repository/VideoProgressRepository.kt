package data.repository

import data.local.VideoProgress
import data.local.VideoProgressDao

class VideoProgressRepository(private val dao: VideoProgressDao) {
    suspend fun getProgress(playbackId: String): VideoProgress? = dao.getProgress(playbackId)
    suspend fun upsert(progress: VideoProgress) = dao.upsert(progress)
    suspend fun clearCompleted() = dao.clearCompleted()
    suspend fun clearOld(cutoff: Long) = dao.clearOld(cutoff)
}
