package com.jstreamv2.data.local;

import android.database.Cursor;
import android.os.CancellationSignal;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.room.CoroutinesRoom;
import androidx.room.EntityDeletionOrUpdateAdapter;
import androidx.room.EntityInsertionAdapter;
import androidx.room.RoomDatabase;
import androidx.room.RoomSQLiteQuery;
import androidx.room.SharedSQLiteStatement;
import androidx.room.util.CursorUtil;
import androidx.room.util.DBUtil;
import androidx.sqlite.db.SupportSQLiteStatement;
import java.lang.Class;
import java.lang.Double;
import java.lang.Exception;
import java.lang.Integer;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.Callable;
import javax.annotation.processing.Generated;
import kotlin.Unit;
import kotlin.coroutines.Continuation;

@Generated("androidx.room.RoomProcessor")
@SuppressWarnings({"unchecked", "deprecation"})
public final class AppDao_Impl implements AppDao {
  private final RoomDatabase __db;

  private final EntityInsertionAdapter<FavoriteItem> __insertionAdapterOfFavoriteItem;

  private final EntityInsertionAdapter<WatchlistItem> __insertionAdapterOfWatchlistItem;

  private final EntityInsertionAdapter<CachedMovie> __insertionAdapterOfCachedMovie;

  private final EntityInsertionAdapter<CachedTVShow> __insertionAdapterOfCachedTVShow;

  private final EntityInsertionAdapter<SearchHistory> __insertionAdapterOfSearchHistory;

  private final EntityDeletionOrUpdateAdapter<FavoriteItem> __deletionAdapterOfFavoriteItem;

  private final EntityDeletionOrUpdateAdapter<WatchlistItem> __deletionAdapterOfWatchlistItem;

  private final SharedSQLiteStatement __preparedStmtOfClearOldCachedMovies;

  private final SharedSQLiteStatement __preparedStmtOfClearOldCachedTVShows;

  private final SharedSQLiteStatement __preparedStmtOfDeleteSearchHistory;

  private final SharedSQLiteStatement __preparedStmtOfClearSearchHistory;

  public AppDao_Impl(@NonNull final RoomDatabase __db) {
    this.__db = __db;
    this.__insertionAdapterOfFavoriteItem = new EntityInsertionAdapter<FavoriteItem>(__db) {
      @Override
      @NonNull
      protected String createQuery() {
        return "INSERT OR REPLACE INTO `favorite_items` (`id`,`mediaType`,`title`,`posterPath`,`overview`,`rating`,`addedDate`) VALUES (?,?,?,?,?,?,?)";
      }

      @Override
      protected void bind(@NonNull final SupportSQLiteStatement statement,
          @NonNull final FavoriteItem entity) {
        statement.bindLong(1, entity.getId());
        if (entity.getMediaType() == null) {
          statement.bindNull(2);
        } else {
          statement.bindString(2, entity.getMediaType());
        }
        if (entity.getTitle() == null) {
          statement.bindNull(3);
        } else {
          statement.bindString(3, entity.getTitle());
        }
        if (entity.getPosterPath() == null) {
          statement.bindNull(4);
        } else {
          statement.bindString(4, entity.getPosterPath());
        }
        if (entity.getOverview() == null) {
          statement.bindNull(5);
        } else {
          statement.bindString(5, entity.getOverview());
        }
        if (entity.getRating() == null) {
          statement.bindNull(6);
        } else {
          statement.bindDouble(6, entity.getRating());
        }
        statement.bindLong(7, entity.getAddedDate());
      }
    };
    this.__insertionAdapterOfWatchlistItem = new EntityInsertionAdapter<WatchlistItem>(__db) {
      @Override
      @NonNull
      protected String createQuery() {
        return "INSERT OR REPLACE INTO `watchlist_items` (`id`,`mediaType`,`title`,`posterPath`,`overview`,`rating`,`addedDate`) VALUES (?,?,?,?,?,?,?)";
      }

      @Override
      protected void bind(@NonNull final SupportSQLiteStatement statement,
          @NonNull final WatchlistItem entity) {
        statement.bindLong(1, entity.getId());
        if (entity.getMediaType() == null) {
          statement.bindNull(2);
        } else {
          statement.bindString(2, entity.getMediaType());
        }
        if (entity.getTitle() == null) {
          statement.bindNull(3);
        } else {
          statement.bindString(3, entity.getTitle());
        }
        if (entity.getPosterPath() == null) {
          statement.bindNull(4);
        } else {
          statement.bindString(4, entity.getPosterPath());
        }
        if (entity.getOverview() == null) {
          statement.bindNull(5);
        } else {
          statement.bindString(5, entity.getOverview());
        }
        if (entity.getRating() == null) {
          statement.bindNull(6);
        } else {
          statement.bindDouble(6, entity.getRating());
        }
        statement.bindLong(7, entity.getAddedDate());
      }
    };
    this.__insertionAdapterOfCachedMovie = new EntityInsertionAdapter<CachedMovie>(__db) {
      @Override
      @NonNull
      protected String createQuery() {
        return "INSERT OR REPLACE INTO `cached_movies` (`id`,`title`,`overview`,`posterPath`,`backdropPath`,`releaseDate`,`voteAverage`,`genres`,`runtime`,`status`,`tagline`,`homepage`,`cachedDate`) VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?)";
      }

      @Override
      protected void bind(@NonNull final SupportSQLiteStatement statement,
          @NonNull final CachedMovie entity) {
        statement.bindLong(1, entity.getId());
        if (entity.getTitle() == null) {
          statement.bindNull(2);
        } else {
          statement.bindString(2, entity.getTitle());
        }
        if (entity.getOverview() == null) {
          statement.bindNull(3);
        } else {
          statement.bindString(3, entity.getOverview());
        }
        if (entity.getPosterPath() == null) {
          statement.bindNull(4);
        } else {
          statement.bindString(4, entity.getPosterPath());
        }
        if (entity.getBackdropPath() == null) {
          statement.bindNull(5);
        } else {
          statement.bindString(5, entity.getBackdropPath());
        }
        if (entity.getReleaseDate() == null) {
          statement.bindNull(6);
        } else {
          statement.bindString(6, entity.getReleaseDate());
        }
        if (entity.getVoteAverage() == null) {
          statement.bindNull(7);
        } else {
          statement.bindDouble(7, entity.getVoteAverage());
        }
        if (entity.getGenres() == null) {
          statement.bindNull(8);
        } else {
          statement.bindString(8, entity.getGenres());
        }
        if (entity.getRuntime() == null) {
          statement.bindNull(9);
        } else {
          statement.bindLong(9, entity.getRuntime());
        }
        if (entity.getStatus() == null) {
          statement.bindNull(10);
        } else {
          statement.bindString(10, entity.getStatus());
        }
        if (entity.getTagline() == null) {
          statement.bindNull(11);
        } else {
          statement.bindString(11, entity.getTagline());
        }
        if (entity.getHomepage() == null) {
          statement.bindNull(12);
        } else {
          statement.bindString(12, entity.getHomepage());
        }
        statement.bindLong(13, entity.getCachedDate());
      }
    };
    this.__insertionAdapterOfCachedTVShow = new EntityInsertionAdapter<CachedTVShow>(__db) {
      @Override
      @NonNull
      protected String createQuery() {
        return "INSERT OR REPLACE INTO `cached_tv_shows` (`id`,`name`,`overview`,`posterPath`,`backdropPath`,`firstAirDate`,`voteAverage`,`genres`,`numberOfSeasons`,`numberOfEpisodes`,`status`,`tagline`,`homepage`,`cachedDate`) VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
      }

      @Override
      protected void bind(@NonNull final SupportSQLiteStatement statement,
          @NonNull final CachedTVShow entity) {
        statement.bindLong(1, entity.getId());
        if (entity.getName() == null) {
          statement.bindNull(2);
        } else {
          statement.bindString(2, entity.getName());
        }
        if (entity.getOverview() == null) {
          statement.bindNull(3);
        } else {
          statement.bindString(3, entity.getOverview());
        }
        if (entity.getPosterPath() == null) {
          statement.bindNull(4);
        } else {
          statement.bindString(4, entity.getPosterPath());
        }
        if (entity.getBackdropPath() == null) {
          statement.bindNull(5);
        } else {
          statement.bindString(5, entity.getBackdropPath());
        }
        if (entity.getFirstAirDate() == null) {
          statement.bindNull(6);
        } else {
          statement.bindString(6, entity.getFirstAirDate());
        }
        if (entity.getVoteAverage() == null) {
          statement.bindNull(7);
        } else {
          statement.bindDouble(7, entity.getVoteAverage());
        }
        if (entity.getGenres() == null) {
          statement.bindNull(8);
        } else {
          statement.bindString(8, entity.getGenres());
        }
        if (entity.getNumberOfSeasons() == null) {
          statement.bindNull(9);
        } else {
          statement.bindLong(9, entity.getNumberOfSeasons());
        }
        if (entity.getNumberOfEpisodes() == null) {
          statement.bindNull(10);
        } else {
          statement.bindLong(10, entity.getNumberOfEpisodes());
        }
        if (entity.getStatus() == null) {
          statement.bindNull(11);
        } else {
          statement.bindString(11, entity.getStatus());
        }
        if (entity.getTagline() == null) {
          statement.bindNull(12);
        } else {
          statement.bindString(12, entity.getTagline());
        }
        if (entity.getHomepage() == null) {
          statement.bindNull(13);
        } else {
          statement.bindString(13, entity.getHomepage());
        }
        statement.bindLong(14, entity.getCachedDate());
      }
    };
    this.__insertionAdapterOfSearchHistory = new EntityInsertionAdapter<SearchHistory>(__db) {
      @Override
      @NonNull
      protected String createQuery() {
        return "INSERT OR REPLACE INTO `search_history` (`id`,`query`,`timestamp`) VALUES (nullif(?, 0),?,?)";
      }

      @Override
      protected void bind(@NonNull final SupportSQLiteStatement statement,
          @NonNull final SearchHistory entity) {
        statement.bindLong(1, entity.getId());
        if (entity.getQuery() == null) {
          statement.bindNull(2);
        } else {
          statement.bindString(2, entity.getQuery());
        }
        statement.bindLong(3, entity.getTimestamp());
      }
    };
    this.__deletionAdapterOfFavoriteItem = new EntityDeletionOrUpdateAdapter<FavoriteItem>(__db) {
      @Override
      @NonNull
      protected String createQuery() {
        return "DELETE FROM `favorite_items` WHERE `id` = ?";
      }

      @Override
      protected void bind(@NonNull final SupportSQLiteStatement statement,
          @NonNull final FavoriteItem entity) {
        statement.bindLong(1, entity.getId());
      }
    };
    this.__deletionAdapterOfWatchlistItem = new EntityDeletionOrUpdateAdapter<WatchlistItem>(__db) {
      @Override
      @NonNull
      protected String createQuery() {
        return "DELETE FROM `watchlist_items` WHERE `id` = ?";
      }

      @Override
      protected void bind(@NonNull final SupportSQLiteStatement statement,
          @NonNull final WatchlistItem entity) {
        statement.bindLong(1, entity.getId());
      }
    };
    this.__preparedStmtOfClearOldCachedMovies = new SharedSQLiteStatement(__db) {
      @Override
      @NonNull
      public String createQuery() {
        final String _query = "DELETE FROM cached_movies WHERE cachedDate < ?";
        return _query;
      }
    };
    this.__preparedStmtOfClearOldCachedTVShows = new SharedSQLiteStatement(__db) {
      @Override
      @NonNull
      public String createQuery() {
        final String _query = "DELETE FROM cached_tv_shows WHERE cachedDate < ?";
        return _query;
      }
    };
    this.__preparedStmtOfDeleteSearchHistory = new SharedSQLiteStatement(__db) {
      @Override
      @NonNull
      public String createQuery() {
        final String _query = "DELETE FROM search_history WHERE id = ?";
        return _query;
      }
    };
    this.__preparedStmtOfClearSearchHistory = new SharedSQLiteStatement(__db) {
      @Override
      @NonNull
      public String createQuery() {
        final String _query = "DELETE FROM search_history";
        return _query;
      }
    };
  }

  @Override
  public Object addFavorite(final FavoriteItem item, final Continuation<? super Unit> $completion) {
    return CoroutinesRoom.execute(__db, true, new Callable<Unit>() {
      @Override
      @NonNull
      public Unit call() throws Exception {
        __db.beginTransaction();
        try {
          __insertionAdapterOfFavoriteItem.insert(item);
          __db.setTransactionSuccessful();
          return Unit.INSTANCE;
        } finally {
          __db.endTransaction();
        }
      }
    }, $completion);
  }

  @Override
  public Object addWatchlist(final WatchlistItem item,
      final Continuation<? super Unit> $completion) {
    return CoroutinesRoom.execute(__db, true, new Callable<Unit>() {
      @Override
      @NonNull
      public Unit call() throws Exception {
        __db.beginTransaction();
        try {
          __insertionAdapterOfWatchlistItem.insert(item);
          __db.setTransactionSuccessful();
          return Unit.INSTANCE;
        } finally {
          __db.endTransaction();
        }
      }
    }, $completion);
  }

  @Override
  public Object cacheMovie(final CachedMovie movie, final Continuation<? super Unit> $completion) {
    return CoroutinesRoom.execute(__db, true, new Callable<Unit>() {
      @Override
      @NonNull
      public Unit call() throws Exception {
        __db.beginTransaction();
        try {
          __insertionAdapterOfCachedMovie.insert(movie);
          __db.setTransactionSuccessful();
          return Unit.INSTANCE;
        } finally {
          __db.endTransaction();
        }
      }
    }, $completion);
  }

  @Override
  public Object cacheTVShow(final CachedTVShow tvShow,
      final Continuation<? super Unit> $completion) {
    return CoroutinesRoom.execute(__db, true, new Callable<Unit>() {
      @Override
      @NonNull
      public Unit call() throws Exception {
        __db.beginTransaction();
        try {
          __insertionAdapterOfCachedTVShow.insert(tvShow);
          __db.setTransactionSuccessful();
          return Unit.INSTANCE;
        } finally {
          __db.endTransaction();
        }
      }
    }, $completion);
  }

  @Override
  public Object addSearchHistory(final SearchHistory history,
      final Continuation<? super Unit> $completion) {
    return CoroutinesRoom.execute(__db, true, new Callable<Unit>() {
      @Override
      @NonNull
      public Unit call() throws Exception {
        __db.beginTransaction();
        try {
          __insertionAdapterOfSearchHistory.insert(history);
          __db.setTransactionSuccessful();
          return Unit.INSTANCE;
        } finally {
          __db.endTransaction();
        }
      }
    }, $completion);
  }

  @Override
  public Object removeFavorite(final FavoriteItem item,
      final Continuation<? super Unit> $completion) {
    return CoroutinesRoom.execute(__db, true, new Callable<Unit>() {
      @Override
      @NonNull
      public Unit call() throws Exception {
        __db.beginTransaction();
        try {
          __deletionAdapterOfFavoriteItem.handle(item);
          __db.setTransactionSuccessful();
          return Unit.INSTANCE;
        } finally {
          __db.endTransaction();
        }
      }
    }, $completion);
  }

  @Override
  public Object removeWatchlist(final WatchlistItem item,
      final Continuation<? super Unit> $completion) {
    return CoroutinesRoom.execute(__db, true, new Callable<Unit>() {
      @Override
      @NonNull
      public Unit call() throws Exception {
        __db.beginTransaction();
        try {
          __deletionAdapterOfWatchlistItem.handle(item);
          __db.setTransactionSuccessful();
          return Unit.INSTANCE;
        } finally {
          __db.endTransaction();
        }
      }
    }, $completion);
  }

  @Override
  public Object clearOldCachedMovies(final long threshold,
      final Continuation<? super Unit> $completion) {
    return CoroutinesRoom.execute(__db, true, new Callable<Unit>() {
      @Override
      @NonNull
      public Unit call() throws Exception {
        final SupportSQLiteStatement _stmt = __preparedStmtOfClearOldCachedMovies.acquire();
        int _argIndex = 1;
        _stmt.bindLong(_argIndex, threshold);
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
          __preparedStmtOfClearOldCachedMovies.release(_stmt);
        }
      }
    }, $completion);
  }

  @Override
  public Object clearOldCachedTVShows(final long threshold,
      final Continuation<? super Unit> $completion) {
    return CoroutinesRoom.execute(__db, true, new Callable<Unit>() {
      @Override
      @NonNull
      public Unit call() throws Exception {
        final SupportSQLiteStatement _stmt = __preparedStmtOfClearOldCachedTVShows.acquire();
        int _argIndex = 1;
        _stmt.bindLong(_argIndex, threshold);
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
          __preparedStmtOfClearOldCachedTVShows.release(_stmt);
        }
      }
    }, $completion);
  }

  @Override
  public Object deleteSearchHistory(final int id, final Continuation<? super Unit> $completion) {
    return CoroutinesRoom.execute(__db, true, new Callable<Unit>() {
      @Override
      @NonNull
      public Unit call() throws Exception {
        final SupportSQLiteStatement _stmt = __preparedStmtOfDeleteSearchHistory.acquire();
        int _argIndex = 1;
        _stmt.bindLong(_argIndex, id);
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
          __preparedStmtOfDeleteSearchHistory.release(_stmt);
        }
      }
    }, $completion);
  }

  @Override
  public Object clearSearchHistory(final Continuation<? super Unit> $completion) {
    return CoroutinesRoom.execute(__db, true, new Callable<Unit>() {
      @Override
      @NonNull
      public Unit call() throws Exception {
        final SupportSQLiteStatement _stmt = __preparedStmtOfClearSearchHistory.acquire();
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
          __preparedStmtOfClearSearchHistory.release(_stmt);
        }
      }
    }, $completion);
  }

  @Override
  public Object getAllFavorites(final Continuation<? super List<FavoriteItem>> $completion) {
    final String _sql = "SELECT * FROM favorite_items";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 0);
    final CancellationSignal _cancellationSignal = DBUtil.createCancellationSignal();
    return CoroutinesRoom.execute(__db, false, _cancellationSignal, new Callable<List<FavoriteItem>>() {
      @Override
      @NonNull
      public List<FavoriteItem> call() throws Exception {
        final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
        try {
          final int _cursorIndexOfId = CursorUtil.getColumnIndexOrThrow(_cursor, "id");
          final int _cursorIndexOfMediaType = CursorUtil.getColumnIndexOrThrow(_cursor, "mediaType");
          final int _cursorIndexOfTitle = CursorUtil.getColumnIndexOrThrow(_cursor, "title");
          final int _cursorIndexOfPosterPath = CursorUtil.getColumnIndexOrThrow(_cursor, "posterPath");
          final int _cursorIndexOfOverview = CursorUtil.getColumnIndexOrThrow(_cursor, "overview");
          final int _cursorIndexOfRating = CursorUtil.getColumnIndexOrThrow(_cursor, "rating");
          final int _cursorIndexOfAddedDate = CursorUtil.getColumnIndexOrThrow(_cursor, "addedDate");
          final List<FavoriteItem> _result = new ArrayList<FavoriteItem>(_cursor.getCount());
          while (_cursor.moveToNext()) {
            final FavoriteItem _item;
            final int _tmpId;
            _tmpId = _cursor.getInt(_cursorIndexOfId);
            final String _tmpMediaType;
            if (_cursor.isNull(_cursorIndexOfMediaType)) {
              _tmpMediaType = null;
            } else {
              _tmpMediaType = _cursor.getString(_cursorIndexOfMediaType);
            }
            final String _tmpTitle;
            if (_cursor.isNull(_cursorIndexOfTitle)) {
              _tmpTitle = null;
            } else {
              _tmpTitle = _cursor.getString(_cursorIndexOfTitle);
            }
            final String _tmpPosterPath;
            if (_cursor.isNull(_cursorIndexOfPosterPath)) {
              _tmpPosterPath = null;
            } else {
              _tmpPosterPath = _cursor.getString(_cursorIndexOfPosterPath);
            }
            final String _tmpOverview;
            if (_cursor.isNull(_cursorIndexOfOverview)) {
              _tmpOverview = null;
            } else {
              _tmpOverview = _cursor.getString(_cursorIndexOfOverview);
            }
            final Double _tmpRating;
            if (_cursor.isNull(_cursorIndexOfRating)) {
              _tmpRating = null;
            } else {
              _tmpRating = _cursor.getDouble(_cursorIndexOfRating);
            }
            final long _tmpAddedDate;
            _tmpAddedDate = _cursor.getLong(_cursorIndexOfAddedDate);
            _item = new FavoriteItem(_tmpId,_tmpMediaType,_tmpTitle,_tmpPosterPath,_tmpOverview,_tmpRating,_tmpAddedDate);
            _result.add(_item);
          }
          return _result;
        } finally {
          _cursor.close();
          _statement.release();
        }
      }
    }, $completion);
  }

  @Override
  public Object getAllWatchlist(final Continuation<? super List<WatchlistItem>> $completion) {
    final String _sql = "SELECT * FROM watchlist_items";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 0);
    final CancellationSignal _cancellationSignal = DBUtil.createCancellationSignal();
    return CoroutinesRoom.execute(__db, false, _cancellationSignal, new Callable<List<WatchlistItem>>() {
      @Override
      @NonNull
      public List<WatchlistItem> call() throws Exception {
        final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
        try {
          final int _cursorIndexOfId = CursorUtil.getColumnIndexOrThrow(_cursor, "id");
          final int _cursorIndexOfMediaType = CursorUtil.getColumnIndexOrThrow(_cursor, "mediaType");
          final int _cursorIndexOfTitle = CursorUtil.getColumnIndexOrThrow(_cursor, "title");
          final int _cursorIndexOfPosterPath = CursorUtil.getColumnIndexOrThrow(_cursor, "posterPath");
          final int _cursorIndexOfOverview = CursorUtil.getColumnIndexOrThrow(_cursor, "overview");
          final int _cursorIndexOfRating = CursorUtil.getColumnIndexOrThrow(_cursor, "rating");
          final int _cursorIndexOfAddedDate = CursorUtil.getColumnIndexOrThrow(_cursor, "addedDate");
          final List<WatchlistItem> _result = new ArrayList<WatchlistItem>(_cursor.getCount());
          while (_cursor.moveToNext()) {
            final WatchlistItem _item;
            final int _tmpId;
            _tmpId = _cursor.getInt(_cursorIndexOfId);
            final String _tmpMediaType;
            if (_cursor.isNull(_cursorIndexOfMediaType)) {
              _tmpMediaType = null;
            } else {
              _tmpMediaType = _cursor.getString(_cursorIndexOfMediaType);
            }
            final String _tmpTitle;
            if (_cursor.isNull(_cursorIndexOfTitle)) {
              _tmpTitle = null;
            } else {
              _tmpTitle = _cursor.getString(_cursorIndexOfTitle);
            }
            final String _tmpPosterPath;
            if (_cursor.isNull(_cursorIndexOfPosterPath)) {
              _tmpPosterPath = null;
            } else {
              _tmpPosterPath = _cursor.getString(_cursorIndexOfPosterPath);
            }
            final String _tmpOverview;
            if (_cursor.isNull(_cursorIndexOfOverview)) {
              _tmpOverview = null;
            } else {
              _tmpOverview = _cursor.getString(_cursorIndexOfOverview);
            }
            final Double _tmpRating;
            if (_cursor.isNull(_cursorIndexOfRating)) {
              _tmpRating = null;
            } else {
              _tmpRating = _cursor.getDouble(_cursorIndexOfRating);
            }
            final long _tmpAddedDate;
            _tmpAddedDate = _cursor.getLong(_cursorIndexOfAddedDate);
            _item = new WatchlistItem(_tmpId,_tmpMediaType,_tmpTitle,_tmpPosterPath,_tmpOverview,_tmpRating,_tmpAddedDate);
            _result.add(_item);
          }
          return _result;
        } finally {
          _cursor.close();
          _statement.release();
        }
      }
    }, $completion);
  }

  @Override
  public Object getCachedMovie(final int id, final Continuation<? super CachedMovie> $completion) {
    final String _sql = "SELECT * FROM cached_movies WHERE id = ?";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 1);
    int _argIndex = 1;
    _statement.bindLong(_argIndex, id);
    final CancellationSignal _cancellationSignal = DBUtil.createCancellationSignal();
    return CoroutinesRoom.execute(__db, false, _cancellationSignal, new Callable<CachedMovie>() {
      @Override
      @Nullable
      public CachedMovie call() throws Exception {
        final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
        try {
          final int _cursorIndexOfId = CursorUtil.getColumnIndexOrThrow(_cursor, "id");
          final int _cursorIndexOfTitle = CursorUtil.getColumnIndexOrThrow(_cursor, "title");
          final int _cursorIndexOfOverview = CursorUtil.getColumnIndexOrThrow(_cursor, "overview");
          final int _cursorIndexOfPosterPath = CursorUtil.getColumnIndexOrThrow(_cursor, "posterPath");
          final int _cursorIndexOfBackdropPath = CursorUtil.getColumnIndexOrThrow(_cursor, "backdropPath");
          final int _cursorIndexOfReleaseDate = CursorUtil.getColumnIndexOrThrow(_cursor, "releaseDate");
          final int _cursorIndexOfVoteAverage = CursorUtil.getColumnIndexOrThrow(_cursor, "voteAverage");
          final int _cursorIndexOfGenres = CursorUtil.getColumnIndexOrThrow(_cursor, "genres");
          final int _cursorIndexOfRuntime = CursorUtil.getColumnIndexOrThrow(_cursor, "runtime");
          final int _cursorIndexOfStatus = CursorUtil.getColumnIndexOrThrow(_cursor, "status");
          final int _cursorIndexOfTagline = CursorUtil.getColumnIndexOrThrow(_cursor, "tagline");
          final int _cursorIndexOfHomepage = CursorUtil.getColumnIndexOrThrow(_cursor, "homepage");
          final int _cursorIndexOfCachedDate = CursorUtil.getColumnIndexOrThrow(_cursor, "cachedDate");
          final CachedMovie _result;
          if (_cursor.moveToFirst()) {
            final int _tmpId;
            _tmpId = _cursor.getInt(_cursorIndexOfId);
            final String _tmpTitle;
            if (_cursor.isNull(_cursorIndexOfTitle)) {
              _tmpTitle = null;
            } else {
              _tmpTitle = _cursor.getString(_cursorIndexOfTitle);
            }
            final String _tmpOverview;
            if (_cursor.isNull(_cursorIndexOfOverview)) {
              _tmpOverview = null;
            } else {
              _tmpOverview = _cursor.getString(_cursorIndexOfOverview);
            }
            final String _tmpPosterPath;
            if (_cursor.isNull(_cursorIndexOfPosterPath)) {
              _tmpPosterPath = null;
            } else {
              _tmpPosterPath = _cursor.getString(_cursorIndexOfPosterPath);
            }
            final String _tmpBackdropPath;
            if (_cursor.isNull(_cursorIndexOfBackdropPath)) {
              _tmpBackdropPath = null;
            } else {
              _tmpBackdropPath = _cursor.getString(_cursorIndexOfBackdropPath);
            }
            final String _tmpReleaseDate;
            if (_cursor.isNull(_cursorIndexOfReleaseDate)) {
              _tmpReleaseDate = null;
            } else {
              _tmpReleaseDate = _cursor.getString(_cursorIndexOfReleaseDate);
            }
            final Double _tmpVoteAverage;
            if (_cursor.isNull(_cursorIndexOfVoteAverage)) {
              _tmpVoteAverage = null;
            } else {
              _tmpVoteAverage = _cursor.getDouble(_cursorIndexOfVoteAverage);
            }
            final String _tmpGenres;
            if (_cursor.isNull(_cursorIndexOfGenres)) {
              _tmpGenres = null;
            } else {
              _tmpGenres = _cursor.getString(_cursorIndexOfGenres);
            }
            final Integer _tmpRuntime;
            if (_cursor.isNull(_cursorIndexOfRuntime)) {
              _tmpRuntime = null;
            } else {
              _tmpRuntime = _cursor.getInt(_cursorIndexOfRuntime);
            }
            final String _tmpStatus;
            if (_cursor.isNull(_cursorIndexOfStatus)) {
              _tmpStatus = null;
            } else {
              _tmpStatus = _cursor.getString(_cursorIndexOfStatus);
            }
            final String _tmpTagline;
            if (_cursor.isNull(_cursorIndexOfTagline)) {
              _tmpTagline = null;
            } else {
              _tmpTagline = _cursor.getString(_cursorIndexOfTagline);
            }
            final String _tmpHomepage;
            if (_cursor.isNull(_cursorIndexOfHomepage)) {
              _tmpHomepage = null;
            } else {
              _tmpHomepage = _cursor.getString(_cursorIndexOfHomepage);
            }
            final long _tmpCachedDate;
            _tmpCachedDate = _cursor.getLong(_cursorIndexOfCachedDate);
            _result = new CachedMovie(_tmpId,_tmpTitle,_tmpOverview,_tmpPosterPath,_tmpBackdropPath,_tmpReleaseDate,_tmpVoteAverage,_tmpGenres,_tmpRuntime,_tmpStatus,_tmpTagline,_tmpHomepage,_tmpCachedDate);
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

  @Override
  public Object getCachedTVShow(final int id,
      final Continuation<? super CachedTVShow> $completion) {
    final String _sql = "SELECT * FROM cached_tv_shows WHERE id = ?";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 1);
    int _argIndex = 1;
    _statement.bindLong(_argIndex, id);
    final CancellationSignal _cancellationSignal = DBUtil.createCancellationSignal();
    return CoroutinesRoom.execute(__db, false, _cancellationSignal, new Callable<CachedTVShow>() {
      @Override
      @Nullable
      public CachedTVShow call() throws Exception {
        final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
        try {
          final int _cursorIndexOfId = CursorUtil.getColumnIndexOrThrow(_cursor, "id");
          final int _cursorIndexOfName = CursorUtil.getColumnIndexOrThrow(_cursor, "name");
          final int _cursorIndexOfOverview = CursorUtil.getColumnIndexOrThrow(_cursor, "overview");
          final int _cursorIndexOfPosterPath = CursorUtil.getColumnIndexOrThrow(_cursor, "posterPath");
          final int _cursorIndexOfBackdropPath = CursorUtil.getColumnIndexOrThrow(_cursor, "backdropPath");
          final int _cursorIndexOfFirstAirDate = CursorUtil.getColumnIndexOrThrow(_cursor, "firstAirDate");
          final int _cursorIndexOfVoteAverage = CursorUtil.getColumnIndexOrThrow(_cursor, "voteAverage");
          final int _cursorIndexOfGenres = CursorUtil.getColumnIndexOrThrow(_cursor, "genres");
          final int _cursorIndexOfNumberOfSeasons = CursorUtil.getColumnIndexOrThrow(_cursor, "numberOfSeasons");
          final int _cursorIndexOfNumberOfEpisodes = CursorUtil.getColumnIndexOrThrow(_cursor, "numberOfEpisodes");
          final int _cursorIndexOfStatus = CursorUtil.getColumnIndexOrThrow(_cursor, "status");
          final int _cursorIndexOfTagline = CursorUtil.getColumnIndexOrThrow(_cursor, "tagline");
          final int _cursorIndexOfHomepage = CursorUtil.getColumnIndexOrThrow(_cursor, "homepage");
          final int _cursorIndexOfCachedDate = CursorUtil.getColumnIndexOrThrow(_cursor, "cachedDate");
          final CachedTVShow _result;
          if (_cursor.moveToFirst()) {
            final int _tmpId;
            _tmpId = _cursor.getInt(_cursorIndexOfId);
            final String _tmpName;
            if (_cursor.isNull(_cursorIndexOfName)) {
              _tmpName = null;
            } else {
              _tmpName = _cursor.getString(_cursorIndexOfName);
            }
            final String _tmpOverview;
            if (_cursor.isNull(_cursorIndexOfOverview)) {
              _tmpOverview = null;
            } else {
              _tmpOverview = _cursor.getString(_cursorIndexOfOverview);
            }
            final String _tmpPosterPath;
            if (_cursor.isNull(_cursorIndexOfPosterPath)) {
              _tmpPosterPath = null;
            } else {
              _tmpPosterPath = _cursor.getString(_cursorIndexOfPosterPath);
            }
            final String _tmpBackdropPath;
            if (_cursor.isNull(_cursorIndexOfBackdropPath)) {
              _tmpBackdropPath = null;
            } else {
              _tmpBackdropPath = _cursor.getString(_cursorIndexOfBackdropPath);
            }
            final String _tmpFirstAirDate;
            if (_cursor.isNull(_cursorIndexOfFirstAirDate)) {
              _tmpFirstAirDate = null;
            } else {
              _tmpFirstAirDate = _cursor.getString(_cursorIndexOfFirstAirDate);
            }
            final Double _tmpVoteAverage;
            if (_cursor.isNull(_cursorIndexOfVoteAverage)) {
              _tmpVoteAverage = null;
            } else {
              _tmpVoteAverage = _cursor.getDouble(_cursorIndexOfVoteAverage);
            }
            final String _tmpGenres;
            if (_cursor.isNull(_cursorIndexOfGenres)) {
              _tmpGenres = null;
            } else {
              _tmpGenres = _cursor.getString(_cursorIndexOfGenres);
            }
            final Integer _tmpNumberOfSeasons;
            if (_cursor.isNull(_cursorIndexOfNumberOfSeasons)) {
              _tmpNumberOfSeasons = null;
            } else {
              _tmpNumberOfSeasons = _cursor.getInt(_cursorIndexOfNumberOfSeasons);
            }
            final Integer _tmpNumberOfEpisodes;
            if (_cursor.isNull(_cursorIndexOfNumberOfEpisodes)) {
              _tmpNumberOfEpisodes = null;
            } else {
              _tmpNumberOfEpisodes = _cursor.getInt(_cursorIndexOfNumberOfEpisodes);
            }
            final String _tmpStatus;
            if (_cursor.isNull(_cursorIndexOfStatus)) {
              _tmpStatus = null;
            } else {
              _tmpStatus = _cursor.getString(_cursorIndexOfStatus);
            }
            final String _tmpTagline;
            if (_cursor.isNull(_cursorIndexOfTagline)) {
              _tmpTagline = null;
            } else {
              _tmpTagline = _cursor.getString(_cursorIndexOfTagline);
            }
            final String _tmpHomepage;
            if (_cursor.isNull(_cursorIndexOfHomepage)) {
              _tmpHomepage = null;
            } else {
              _tmpHomepage = _cursor.getString(_cursorIndexOfHomepage);
            }
            final long _tmpCachedDate;
            _tmpCachedDate = _cursor.getLong(_cursorIndexOfCachedDate);
            _result = new CachedTVShow(_tmpId,_tmpName,_tmpOverview,_tmpPosterPath,_tmpBackdropPath,_tmpFirstAirDate,_tmpVoteAverage,_tmpGenres,_tmpNumberOfSeasons,_tmpNumberOfEpisodes,_tmpStatus,_tmpTagline,_tmpHomepage,_tmpCachedDate);
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

  @Override
  public Object getAllSearchHistory(final Continuation<? super List<SearchHistory>> $completion) {
    final String _sql = "SELECT * FROM search_history ORDER BY timestamp DESC";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 0);
    final CancellationSignal _cancellationSignal = DBUtil.createCancellationSignal();
    return CoroutinesRoom.execute(__db, false, _cancellationSignal, new Callable<List<SearchHistory>>() {
      @Override
      @NonNull
      public List<SearchHistory> call() throws Exception {
        final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
        try {
          final int _cursorIndexOfId = CursorUtil.getColumnIndexOrThrow(_cursor, "id");
          final int _cursorIndexOfQuery = CursorUtil.getColumnIndexOrThrow(_cursor, "query");
          final int _cursorIndexOfTimestamp = CursorUtil.getColumnIndexOrThrow(_cursor, "timestamp");
          final List<SearchHistory> _result = new ArrayList<SearchHistory>(_cursor.getCount());
          while (_cursor.moveToNext()) {
            final SearchHistory _item;
            final int _tmpId;
            _tmpId = _cursor.getInt(_cursorIndexOfId);
            final String _tmpQuery;
            if (_cursor.isNull(_cursorIndexOfQuery)) {
              _tmpQuery = null;
            } else {
              _tmpQuery = _cursor.getString(_cursorIndexOfQuery);
            }
            final long _tmpTimestamp;
            _tmpTimestamp = _cursor.getLong(_cursorIndexOfTimestamp);
            _item = new SearchHistory(_tmpId,_tmpQuery,_tmpTimestamp);
            _result.add(_item);
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
