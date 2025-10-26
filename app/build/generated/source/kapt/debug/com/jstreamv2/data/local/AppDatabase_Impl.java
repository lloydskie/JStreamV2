package com.jstreamv2.data.local;

import androidx.annotation.NonNull;
import androidx.room.DatabaseConfiguration;
import androidx.room.InvalidationTracker;
import androidx.room.RoomDatabase;
import androidx.room.RoomOpenHelper;
import androidx.room.migration.AutoMigrationSpec;
import androidx.room.migration.Migration;
import androidx.room.util.DBUtil;
import androidx.room.util.TableInfo;
import androidx.sqlite.db.SupportSQLiteDatabase;
import androidx.sqlite.db.SupportSQLiteOpenHelper;
import java.lang.Class;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import javax.annotation.processing.Generated;

@Generated("androidx.room.RoomProcessor")
@SuppressWarnings({"unchecked", "deprecation"})
public final class AppDatabase_Impl extends AppDatabase {
  private volatile AppDao _appDao;

  @Override
  @NonNull
  protected SupportSQLiteOpenHelper createOpenHelper(@NonNull final DatabaseConfiguration config) {
    final SupportSQLiteOpenHelper.Callback _openCallback = new RoomOpenHelper(config, new RoomOpenHelper.Delegate(1) {
      @Override
      public void createAllTables(@NonNull final SupportSQLiteDatabase db) {
        db.execSQL("CREATE TABLE IF NOT EXISTS `favorite_items` (`id` INTEGER NOT NULL, `mediaType` TEXT NOT NULL, `title` TEXT, `posterPath` TEXT, `overview` TEXT, `rating` REAL, `addedDate` INTEGER NOT NULL, PRIMARY KEY(`id`))");
        db.execSQL("CREATE TABLE IF NOT EXISTS `watchlist_items` (`id` INTEGER NOT NULL, `mediaType` TEXT NOT NULL, `title` TEXT, `posterPath` TEXT, `overview` TEXT, `rating` REAL, `addedDate` INTEGER NOT NULL, PRIMARY KEY(`id`))");
        db.execSQL("CREATE TABLE IF NOT EXISTS `cached_movies` (`id` INTEGER NOT NULL, `title` TEXT, `overview` TEXT, `posterPath` TEXT, `backdropPath` TEXT, `releaseDate` TEXT, `voteAverage` REAL, `genres` TEXT, `runtime` INTEGER, `status` TEXT, `tagline` TEXT, `homepage` TEXT, `cachedDate` INTEGER NOT NULL, PRIMARY KEY(`id`))");
        db.execSQL("CREATE TABLE IF NOT EXISTS `cached_tv_shows` (`id` INTEGER NOT NULL, `name` TEXT, `overview` TEXT, `posterPath` TEXT, `backdropPath` TEXT, `firstAirDate` TEXT, `voteAverage` REAL, `genres` TEXT, `numberOfSeasons` INTEGER, `numberOfEpisodes` INTEGER, `status` TEXT, `tagline` TEXT, `homepage` TEXT, `cachedDate` INTEGER NOT NULL, PRIMARY KEY(`id`))");
        db.execSQL("CREATE TABLE IF NOT EXISTS `search_history` (`id` INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, `query` TEXT NOT NULL, `timestamp` INTEGER NOT NULL)");
        db.execSQL("CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
        db.execSQL("INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, '0a719ff3823a25111354bcc3dcadaeeb')");
      }

      @Override
      public void dropAllTables(@NonNull final SupportSQLiteDatabase db) {
        db.execSQL("DROP TABLE IF EXISTS `favorite_items`");
        db.execSQL("DROP TABLE IF EXISTS `watchlist_items`");
        db.execSQL("DROP TABLE IF EXISTS `cached_movies`");
        db.execSQL("DROP TABLE IF EXISTS `cached_tv_shows`");
        db.execSQL("DROP TABLE IF EXISTS `search_history`");
        final List<? extends RoomDatabase.Callback> _callbacks = mCallbacks;
        if (_callbacks != null) {
          for (RoomDatabase.Callback _callback : _callbacks) {
            _callback.onDestructiveMigration(db);
          }
        }
      }

      @Override
      public void onCreate(@NonNull final SupportSQLiteDatabase db) {
        final List<? extends RoomDatabase.Callback> _callbacks = mCallbacks;
        if (_callbacks != null) {
          for (RoomDatabase.Callback _callback : _callbacks) {
            _callback.onCreate(db);
          }
        }
      }

      @Override
      public void onOpen(@NonNull final SupportSQLiteDatabase db) {
        mDatabase = db;
        internalInitInvalidationTracker(db);
        final List<? extends RoomDatabase.Callback> _callbacks = mCallbacks;
        if (_callbacks != null) {
          for (RoomDatabase.Callback _callback : _callbacks) {
            _callback.onOpen(db);
          }
        }
      }

      @Override
      public void onPreMigrate(@NonNull final SupportSQLiteDatabase db) {
        DBUtil.dropFtsSyncTriggers(db);
      }

      @Override
      public void onPostMigrate(@NonNull final SupportSQLiteDatabase db) {
      }

      @Override
      @NonNull
      public RoomOpenHelper.ValidationResult onValidateSchema(
          @NonNull final SupportSQLiteDatabase db) {
        final HashMap<String, TableInfo.Column> _columnsFavoriteItems = new HashMap<String, TableInfo.Column>(7);
        _columnsFavoriteItems.put("id", new TableInfo.Column("id", "INTEGER", true, 1, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsFavoriteItems.put("mediaType", new TableInfo.Column("mediaType", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsFavoriteItems.put("title", new TableInfo.Column("title", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsFavoriteItems.put("posterPath", new TableInfo.Column("posterPath", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsFavoriteItems.put("overview", new TableInfo.Column("overview", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsFavoriteItems.put("rating", new TableInfo.Column("rating", "REAL", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsFavoriteItems.put("addedDate", new TableInfo.Column("addedDate", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        final HashSet<TableInfo.ForeignKey> _foreignKeysFavoriteItems = new HashSet<TableInfo.ForeignKey>(0);
        final HashSet<TableInfo.Index> _indicesFavoriteItems = new HashSet<TableInfo.Index>(0);
        final TableInfo _infoFavoriteItems = new TableInfo("favorite_items", _columnsFavoriteItems, _foreignKeysFavoriteItems, _indicesFavoriteItems);
        final TableInfo _existingFavoriteItems = TableInfo.read(db, "favorite_items");
        if (!_infoFavoriteItems.equals(_existingFavoriteItems)) {
          return new RoomOpenHelper.ValidationResult(false, "favorite_items(com.jstreamv2.data.local.FavoriteItem).\n"
                  + " Expected:\n" + _infoFavoriteItems + "\n"
                  + " Found:\n" + _existingFavoriteItems);
        }
        final HashMap<String, TableInfo.Column> _columnsWatchlistItems = new HashMap<String, TableInfo.Column>(7);
        _columnsWatchlistItems.put("id", new TableInfo.Column("id", "INTEGER", true, 1, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsWatchlistItems.put("mediaType", new TableInfo.Column("mediaType", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsWatchlistItems.put("title", new TableInfo.Column("title", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsWatchlistItems.put("posterPath", new TableInfo.Column("posterPath", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsWatchlistItems.put("overview", new TableInfo.Column("overview", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsWatchlistItems.put("rating", new TableInfo.Column("rating", "REAL", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsWatchlistItems.put("addedDate", new TableInfo.Column("addedDate", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        final HashSet<TableInfo.ForeignKey> _foreignKeysWatchlistItems = new HashSet<TableInfo.ForeignKey>(0);
        final HashSet<TableInfo.Index> _indicesWatchlistItems = new HashSet<TableInfo.Index>(0);
        final TableInfo _infoWatchlistItems = new TableInfo("watchlist_items", _columnsWatchlistItems, _foreignKeysWatchlistItems, _indicesWatchlistItems);
        final TableInfo _existingWatchlistItems = TableInfo.read(db, "watchlist_items");
        if (!_infoWatchlistItems.equals(_existingWatchlistItems)) {
          return new RoomOpenHelper.ValidationResult(false, "watchlist_items(com.jstreamv2.data.local.WatchlistItem).\n"
                  + " Expected:\n" + _infoWatchlistItems + "\n"
                  + " Found:\n" + _existingWatchlistItems);
        }
        final HashMap<String, TableInfo.Column> _columnsCachedMovies = new HashMap<String, TableInfo.Column>(13);
        _columnsCachedMovies.put("id", new TableInfo.Column("id", "INTEGER", true, 1, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsCachedMovies.put("title", new TableInfo.Column("title", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsCachedMovies.put("overview", new TableInfo.Column("overview", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsCachedMovies.put("posterPath", new TableInfo.Column("posterPath", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsCachedMovies.put("backdropPath", new TableInfo.Column("backdropPath", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsCachedMovies.put("releaseDate", new TableInfo.Column("releaseDate", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsCachedMovies.put("voteAverage", new TableInfo.Column("voteAverage", "REAL", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsCachedMovies.put("genres", new TableInfo.Column("genres", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsCachedMovies.put("runtime", new TableInfo.Column("runtime", "INTEGER", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsCachedMovies.put("status", new TableInfo.Column("status", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsCachedMovies.put("tagline", new TableInfo.Column("tagline", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsCachedMovies.put("homepage", new TableInfo.Column("homepage", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsCachedMovies.put("cachedDate", new TableInfo.Column("cachedDate", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        final HashSet<TableInfo.ForeignKey> _foreignKeysCachedMovies = new HashSet<TableInfo.ForeignKey>(0);
        final HashSet<TableInfo.Index> _indicesCachedMovies = new HashSet<TableInfo.Index>(0);
        final TableInfo _infoCachedMovies = new TableInfo("cached_movies", _columnsCachedMovies, _foreignKeysCachedMovies, _indicesCachedMovies);
        final TableInfo _existingCachedMovies = TableInfo.read(db, "cached_movies");
        if (!_infoCachedMovies.equals(_existingCachedMovies)) {
          return new RoomOpenHelper.ValidationResult(false, "cached_movies(com.jstreamv2.data.local.CachedMovie).\n"
                  + " Expected:\n" + _infoCachedMovies + "\n"
                  + " Found:\n" + _existingCachedMovies);
        }
        final HashMap<String, TableInfo.Column> _columnsCachedTvShows = new HashMap<String, TableInfo.Column>(14);
        _columnsCachedTvShows.put("id", new TableInfo.Column("id", "INTEGER", true, 1, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsCachedTvShows.put("name", new TableInfo.Column("name", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsCachedTvShows.put("overview", new TableInfo.Column("overview", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsCachedTvShows.put("posterPath", new TableInfo.Column("posterPath", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsCachedTvShows.put("backdropPath", new TableInfo.Column("backdropPath", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsCachedTvShows.put("firstAirDate", new TableInfo.Column("firstAirDate", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsCachedTvShows.put("voteAverage", new TableInfo.Column("voteAverage", "REAL", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsCachedTvShows.put("genres", new TableInfo.Column("genres", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsCachedTvShows.put("numberOfSeasons", new TableInfo.Column("numberOfSeasons", "INTEGER", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsCachedTvShows.put("numberOfEpisodes", new TableInfo.Column("numberOfEpisodes", "INTEGER", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsCachedTvShows.put("status", new TableInfo.Column("status", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsCachedTvShows.put("tagline", new TableInfo.Column("tagline", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsCachedTvShows.put("homepage", new TableInfo.Column("homepage", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsCachedTvShows.put("cachedDate", new TableInfo.Column("cachedDate", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        final HashSet<TableInfo.ForeignKey> _foreignKeysCachedTvShows = new HashSet<TableInfo.ForeignKey>(0);
        final HashSet<TableInfo.Index> _indicesCachedTvShows = new HashSet<TableInfo.Index>(0);
        final TableInfo _infoCachedTvShows = new TableInfo("cached_tv_shows", _columnsCachedTvShows, _foreignKeysCachedTvShows, _indicesCachedTvShows);
        final TableInfo _existingCachedTvShows = TableInfo.read(db, "cached_tv_shows");
        if (!_infoCachedTvShows.equals(_existingCachedTvShows)) {
          return new RoomOpenHelper.ValidationResult(false, "cached_tv_shows(com.jstreamv2.data.local.CachedTVShow).\n"
                  + " Expected:\n" + _infoCachedTvShows + "\n"
                  + " Found:\n" + _existingCachedTvShows);
        }
        final HashMap<String, TableInfo.Column> _columnsSearchHistory = new HashMap<String, TableInfo.Column>(3);
        _columnsSearchHistory.put("id", new TableInfo.Column("id", "INTEGER", true, 1, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsSearchHistory.put("query", new TableInfo.Column("query", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsSearchHistory.put("timestamp", new TableInfo.Column("timestamp", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        final HashSet<TableInfo.ForeignKey> _foreignKeysSearchHistory = new HashSet<TableInfo.ForeignKey>(0);
        final HashSet<TableInfo.Index> _indicesSearchHistory = new HashSet<TableInfo.Index>(0);
        final TableInfo _infoSearchHistory = new TableInfo("search_history", _columnsSearchHistory, _foreignKeysSearchHistory, _indicesSearchHistory);
        final TableInfo _existingSearchHistory = TableInfo.read(db, "search_history");
        if (!_infoSearchHistory.equals(_existingSearchHistory)) {
          return new RoomOpenHelper.ValidationResult(false, "search_history(com.jstreamv2.data.local.SearchHistory).\n"
                  + " Expected:\n" + _infoSearchHistory + "\n"
                  + " Found:\n" + _existingSearchHistory);
        }
        return new RoomOpenHelper.ValidationResult(true, null);
      }
    }, "0a719ff3823a25111354bcc3dcadaeeb", "f34ea82d4f6ff75932a93c6ed3765d70");
    final SupportSQLiteOpenHelper.Configuration _sqliteConfig = SupportSQLiteOpenHelper.Configuration.builder(config.context).name(config.name).callback(_openCallback).build();
    final SupportSQLiteOpenHelper _helper = config.sqliteOpenHelperFactory.create(_sqliteConfig);
    return _helper;
  }

  @Override
  @NonNull
  protected InvalidationTracker createInvalidationTracker() {
    final HashMap<String, String> _shadowTablesMap = new HashMap<String, String>(0);
    final HashMap<String, Set<String>> _viewTables = new HashMap<String, Set<String>>(0);
    return new InvalidationTracker(this, _shadowTablesMap, _viewTables, "favorite_items","watchlist_items","cached_movies","cached_tv_shows","search_history");
  }

  @Override
  public void clearAllTables() {
    super.assertNotMainThread();
    final SupportSQLiteDatabase _db = super.getOpenHelper().getWritableDatabase();
    try {
      super.beginTransaction();
      _db.execSQL("DELETE FROM `favorite_items`");
      _db.execSQL("DELETE FROM `watchlist_items`");
      _db.execSQL("DELETE FROM `cached_movies`");
      _db.execSQL("DELETE FROM `cached_tv_shows`");
      _db.execSQL("DELETE FROM `search_history`");
      super.setTransactionSuccessful();
    } finally {
      super.endTransaction();
      _db.query("PRAGMA wal_checkpoint(FULL)").close();
      if (!_db.inTransaction()) {
        _db.execSQL("VACUUM");
      }
    }
  }

  @Override
  @NonNull
  protected Map<Class<?>, List<Class<?>>> getRequiredTypeConverters() {
    final HashMap<Class<?>, List<Class<?>>> _typeConvertersMap = new HashMap<Class<?>, List<Class<?>>>();
    _typeConvertersMap.put(AppDao.class, AppDao_Impl.getRequiredConverters());
    return _typeConvertersMap;
  }

  @Override
  @NonNull
  public Set<Class<? extends AutoMigrationSpec>> getRequiredAutoMigrationSpecs() {
    final HashSet<Class<? extends AutoMigrationSpec>> _autoMigrationSpecsSet = new HashSet<Class<? extends AutoMigrationSpec>>();
    return _autoMigrationSpecsSet;
  }

  @Override
  @NonNull
  public List<Migration> getAutoMigrations(
      @NonNull final Map<Class<? extends AutoMigrationSpec>, AutoMigrationSpec> autoMigrationSpecs) {
    final List<Migration> _autoMigrations = new ArrayList<Migration>();
    return _autoMigrations;
  }

  @Override
  public AppDao appDao() {
    if (_appDao != null) {
      return _appDao;
    } else {
      synchronized(this) {
        if(_appDao == null) {
          _appDao = new AppDao_Impl(this);
        }
        return _appDao;
      }
    }
  }
}
