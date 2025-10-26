package data.local;

import android.database.Cursor;
import android.os.CancellationSignal;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.room.CoroutinesRoom;
import androidx.room.EntityInsertionAdapter;
import androidx.room.RoomDatabase;
import androidx.room.RoomSQLiteQuery;
import androidx.room.SharedSQLiteStatement;
import androidx.room.util.CursorUtil;
import androidx.room.util.DBUtil;
import androidx.sqlite.db.SupportSQLiteStatement;
import java.lang.Class;
import java.lang.Exception;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.Callable;
import javax.annotation.processing.Generated;
import kotlin.Unit;
import kotlin.coroutines.Continuation;

@Generated("androidx.room.RoomProcessor")
@SuppressWarnings({"unchecked", "deprecation"})
public final class VideoProgressDao_Impl implements VideoProgressDao {
  private final RoomDatabase __db;

  private final EntityInsertionAdapter<VideoProgress> __insertionAdapterOfVideoProgress;

  private final SharedSQLiteStatement __preparedStmtOfClearCompleted;

  private final SharedSQLiteStatement __preparedStmtOfClearOld;

  public VideoProgressDao_Impl(@NonNull final RoomDatabase __db) {
    this.__db = __db;
    this.__insertionAdapterOfVideoProgress = new EntityInsertionAdapter<VideoProgress>(__db) {
      @Override
      @NonNull
      protected String createQuery() {
        return "INSERT OR REPLACE INTO `video_progress` (`playbackId`,`mediaId`,`mediaType`,`positionMs`,`durationMs`,`updatedAt`) VALUES (?,?,?,?,?,?)";
      }

      @Override
      protected void bind(@NonNull final SupportSQLiteStatement statement,
          @NonNull final VideoProgress entity) {
        if (entity.getPlaybackId() == null) {
          statement.bindNull(1);
        } else {
          statement.bindString(1, entity.getPlaybackId());
        }
        statement.bindLong(2, entity.getMediaId());
        if (entity.getMediaType() == null) {
          statement.bindNull(3);
        } else {
          statement.bindString(3, entity.getMediaType());
        }
        statement.bindLong(4, entity.getPositionMs());
        statement.bindLong(5, entity.getDurationMs());
        statement.bindLong(6, entity.getUpdatedAt());
      }
    };
    this.__preparedStmtOfClearCompleted = new SharedSQLiteStatement(__db) {
      @Override
      @NonNull
      public String createQuery() {
        final String _query = "DELETE FROM video_progress WHERE positionMs >= durationMs";
        return _query;
      }
    };
    this.__preparedStmtOfClearOld = new SharedSQLiteStatement(__db) {
      @Override
      @NonNull
      public String createQuery() {
        final String _query = "DELETE FROM video_progress WHERE updatedAt < ?";
        return _query;
      }
    };
  }

  @Override
  public Object upsert(final VideoProgress progress, final Continuation<? super Unit> $completion) {
    return CoroutinesRoom.execute(__db, true, new Callable<Unit>() {
      @Override
      @NonNull
      public Unit call() throws Exception {
        __db.beginTransaction();
        try {
          __insertionAdapterOfVideoProgress.insert(progress);
          __db.setTransactionSuccessful();
          return Unit.INSTANCE;
        } finally {
          __db.endTransaction();
        }
      }
    }, $completion);
  }

  @Override
  public Object clearCompleted(final Continuation<? super Unit> $completion) {
    return CoroutinesRoom.execute(__db, true, new Callable<Unit>() {
      @Override
      @NonNull
      public Unit call() throws Exception {
        final SupportSQLiteStatement _stmt = __preparedStmtOfClearCompleted.acquire();
        try {
          __db.beginTransaction();
          try {
            _stmt.executeUpdateDelete();
            __db.setTransactionSuccessful();
            return Unit.INSTANCE;
          } finally {
            __db.endTransaction();
          }
        } finally {
          __preparedStmtOfClearCompleted.release(_stmt);
        }
      }
    }, $completion);
  }

  @Override
  public Object clearOld(final long cutoff, final Continuation<? super Unit> $completion) {
    return CoroutinesRoom.execute(__db, true, new Callable<Unit>() {
      @Override
      @NonNull
      public Unit call() throws Exception {
        final SupportSQLiteStatement _stmt = __preparedStmtOfClearOld.acquire();
        int _argIndex = 1;
        _stmt.bindLong(_argIndex, cutoff);
        try {
          __db.beginTransaction();
          try {
            _stmt.executeUpdateDelete();
            __db.setTransactionSuccessful();
            return Unit.INSTANCE;
          } finally {
            __db.endTransaction();
          }
        } finally {
          __preparedStmtOfClearOld.release(_stmt);
        }
      }
    }, $completion);
  }

  @Override
  public Object getProgress(final String playbackId,
      final Continuation<? super VideoProgress> $completion) {
    final String _sql = "SELECT * FROM video_progress WHERE playbackId = ?";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 1);
    int _argIndex = 1;
    if (playbackId == null) {
      _statement.bindNull(_argIndex);
    } else {
      _statement.bindString(_argIndex, playbackId);
    }
    final CancellationSignal _cancellationSignal = DBUtil.createCancellationSignal();
    return CoroutinesRoom.execute(__db, false, _cancellationSignal, new Callable<VideoProgress>() {
      @Override
      @Nullable
      public VideoProgress call() throws Exception {
        final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
        try {
          final int _cursorIndexOfPlaybackId = CursorUtil.getColumnIndexOrThrow(_cursor, "playbackId");
          final int _cursorIndexOfMediaId = CursorUtil.getColumnIndexOrThrow(_cursor, "mediaId");
          final int _cursorIndexOfMediaType = CursorUtil.getColumnIndexOrThrow(_cursor, "mediaType");
          final int _cursorIndexOfPositionMs = CursorUtil.getColumnIndexOrThrow(_cursor, "positionMs");
          final int _cursorIndexOfDurationMs = CursorUtil.getColumnIndexOrThrow(_cursor, "durationMs");
          final int _cursorIndexOfUpdatedAt = CursorUtil.getColumnIndexOrThrow(_cursor, "updatedAt");
          final VideoProgress _result;
          if (_cursor.moveToFirst()) {
            final String _tmpPlaybackId;
            if (_cursor.isNull(_cursorIndexOfPlaybackId)) {
              _tmpPlaybackId = null;
            } else {
              _tmpPlaybackId = _cursor.getString(_cursorIndexOfPlaybackId);
            }
            final int _tmpMediaId;
            _tmpMediaId = _cursor.getInt(_cursorIndexOfMediaId);
            final String _tmpMediaType;
            if (_cursor.isNull(_cursorIndexOfMediaType)) {
              _tmpMediaType = null;
            } else {
              _tmpMediaType = _cursor.getString(_cursorIndexOfMediaType);
            }
            final long _tmpPositionMs;
            _tmpPositionMs = _cursor.getLong(_cursorIndexOfPositionMs);
            final long _tmpDurationMs;
            _tmpDurationMs = _cursor.getLong(_cursorIndexOfDurationMs);
            final long _tmpUpdatedAt;
            _tmpUpdatedAt = _cursor.getLong(_cursorIndexOfUpdatedAt);
            _result = new VideoProgress(_tmpPlaybackId,_tmpMediaId,_tmpMediaType,_tmpPositionMs,_tmpDurationMs,_tmpUpdatedAt);
          } else {
            _result = null;
          }
          return _result;
        } finally {
          _cursor.close();
          _statement.release();
        }
      }
    }, $completion);
  }

  @NonNull
  public static List<Class<?>> getRequiredConverters() {
    return Collections.emptyList();
  }
}
