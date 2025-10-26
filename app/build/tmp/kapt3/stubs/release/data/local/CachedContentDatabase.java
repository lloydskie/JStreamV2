package data.local;

import android.content.Context;
import androidx.room.*;
import kotlinx.coroutines.flow.Flow;
import java.util.*;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\'\u0018\u0000 \u00072\u00020\u0001:\u0001\u0007B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H&J\b\u0010\u0005\u001a\u00020\u0006H&\u00a8\u0006\b"}, d2 = {"Ldata/local/CachedContentDatabase;", "Landroidx/room/RoomDatabase;", "()V", "cachedContentDao", "Ldata/local/CachedContentDao;", "videoProgressDao", "Ldata/local/VideoProgressDao;", "Companion", "app_release"})
@androidx.room.Database(entities = {data.local.CachedContent.class, data.local.VideoProgress.class}, version = 1)
public abstract class CachedContentDatabase extends androidx.room.RoomDatabase {
    @kotlin.jvm.Volatile
    @org.jetbrains.annotations.Nullable
    private static volatile data.local.CachedContentDatabase INSTANCE;
    @org.jetbrains.annotations.NotNull
    public static final data.local.CachedContentDatabase.Companion Companion = null;
    
    public CachedContentDatabase() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public abstract data.local.CachedContentDao cachedContentDao();
    
    @org.jetbrains.annotations.NotNull
    public abstract data.local.VideoProgressDao videoProgressDao();
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0007R\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\b"}, d2 = {"Ldata/local/CachedContentDatabase$Companion;", "", "()V", "INSTANCE", "Ldata/local/CachedContentDatabase;", "getInstance", "context", "Landroid/content/Context;", "app_release"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
        
        @org.jetbrains.annotations.NotNull
        public final data.local.CachedContentDatabase getInstance(@org.jetbrains.annotations.NotNull
        android.content.Context context) {
            return null;
        }
    }
}