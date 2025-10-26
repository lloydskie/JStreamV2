package data.local;

import android.content.Context;
import androidx.room.*;
import kotlinx.coroutines.flow.Flow;
import java.util.*;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\bg\u0018\u00002\u00020\u0001J\u0011\u0010\u0002\u001a\u00020\u0003H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0004J\u0019\u0010\u0005\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0007H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\bJ\u001b\u0010\t\u001a\u0004\u0018\u00010\n2\u0006\u0010\u000b\u001a\u00020\fH\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\rJ\u0019\u0010\u000e\u001a\u00020\u00032\u0006\u0010\u000f\u001a\u00020\nH\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0010\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u0011"}, d2 = {"Ldata/local/VideoProgressDao;", "", "clearCompleted", "", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "clearOld", "cutoff", "", "(JLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getProgress", "Ldata/local/VideoProgress;", "playbackId", "", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "upsert", "progress", "(Ldata/local/VideoProgress;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "app_debug"})
@androidx.room.Dao
public abstract interface VideoProgressDao {
    
    @androidx.room.Query(value = "SELECT * FROM video_progress WHERE playbackId = :playbackId")
    @org.jetbrains.annotations.Nullable
    public abstract java.lang.Object getProgress(@org.jetbrains.annotations.NotNull
    java.lang.String playbackId, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super data.local.VideoProgress> $completion);
    
    @androidx.room.Insert(onConflict = 1)
    @org.jetbrains.annotations.Nullable
    public abstract java.lang.Object upsert(@org.jetbrains.annotations.NotNull
    data.local.VideoProgress progress, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super kotlin.Unit> $completion);
    
    @androidx.room.Query(value = "DELETE FROM video_progress WHERE positionMs >= durationMs")
    @org.jetbrains.annotations.Nullable
    public abstract java.lang.Object clearCompleted(@org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super kotlin.Unit> $completion);
    
    @androidx.room.Query(value = "DELETE FROM video_progress WHERE updatedAt < :cutoff")
    @org.jetbrains.annotations.Nullable
    public abstract java.lang.Object clearOld(long cutoff, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super kotlin.Unit> $completion);
}