package data.local;

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
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import javax.annotation.processing.Generated;

@Generated("androidx.room.RoomProcessor")
@SuppressWarnings({"unchecked", "deprecation"})
public final class CachedContentDatabase_Impl extends CachedContentDatabase {
  private volatile CachedContentDao _cachedContentDao;

  private volatile VideoProgressDao _videoProgressDao;

  @Override
  @NonNull
  protected SupportSQLiteOpenHelper createOpenHelper(@NonNull final DatabaseConfiguration config) {
    final SupportSQLiteOpenHelper.Callback _openCallback = new RoomOpenHelper(config, new RoomOpenHelper.Delegate(1) {
      @Override
      public void createAllTables(@NonNull final SupportSQLiteDatabase db) {
        db.execSQL("CREATE TABLE IF NOT EXISTS `cached_content` (`id` INTEGER NOT NULL, `type` TEXT NOT NULL, `title` TEXT NOT NULL, `detailsJson` TEXT NOT NULL, `posterPath` TEXT, `backdropPath` TEXT, `cachedAt` INTEGER NOT NULL, PRIMARY KEY(`id`))");
        db.execSQL("CREATE INDEX IF NOT EXISTS `index_cached_content_cachedAt` ON `cached_content` (`cachedAt`)");
        db.execSQL("CREATE INDEX IF NOT EXISTS `index_cached_content_type` ON `cached_content` (`type`)");
        db.execSQL("CREATE UNIQUE INDEX IF NOT EXISTS `index_cached_content_id` ON `cached_content` (`id`)");
        db.execSQL("CREATE TABLE IF NOT EXISTS `video_progress` (`playbackId` TEXT NOT NULL, `mediaId` INTEGER NOT NULL, `mediaType` TEXT NOT NULL, `positionMs` INTEGER NOT NULL, `durationMs` INTEGER NOT NULL, `updatedAt` INTEGER NOT NULL, PRIMARY KEY(`playbackId`))");
        db.execSQL("CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
        db.execSQL("INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, 'c5066cd552a1e5ab930329db08ebc0c7')");
      }

      @Override
      public void dropAllTables(@NonNull final SupportSQLiteDatabase db) {
        db.execSQL("DROP TABLE IF EXISTS `cached_content`");
        db.execSQL("DROP TABLE IF EXISTS `video_progress`");
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
        final HashMap<String, TableInfo.Column> _columnsCachedContent = new HashMap<String, TableInfo.Column>(7);
        _columnsCachedContent.put("id", new TableInfo.Column("id", "INTEGER", true, 1, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsCachedContent.put("type", new TableInfo.Column("type", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsCachedContent.put("title", new TableInfo.Column("title", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsCachedContent.put("detailsJson", new TableInfo.Column("detailsJson", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsCachedContent.put("posterPath", new TableInfo.Column("posterPath", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsCachedContent.put("backdropPath", new TableInfo.Column("backdropPath", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsCachedContent.put("cachedAt", new TableInfo.Column("cachedAt", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        final HashSet<TableInfo.ForeignKey> _foreignKeysCachedContent = new HashSet<TableInfo.ForeignKey>(0);
        final HashSet<TableInfo.Index> _indicesCachedContent = new HashSet<TableInfo.Index>(3);
        _indicesCachedContent.add(new TableInfo.Index("index_cached_content_cachedAt", false, Arrays.asList("cachedAt"), Arrays.asList("ASC")));
        _indicesCachedContent.add(new TableInfo.Index("index_cached_content_type", false, Arrays.asList("type"), Arrays.asList("ASC")));
        _indicesCachedContent.add(new TableInfo.Index("index_cached_content_id", true, Arrays.asList("id"), Arrays.asList("ASC")));
        final TableInfo _infoCachedContent = new TableInfo("cached_content", _columnsCachedContent, _foreignKeysCachedContent, _indicesCachedContent);
        final TableInfo _existingCachedContent = TableInfo.read(db, "cached_content");
        if (!_infoCachedContent.equals(_existingCachedContent)) {
          return new RoomOpenHelper.ValidationResult(false, "cached_content(data.local.CachedContent).\n"
                  + " Expected:\n" + _infoCachedContent + "\n"
                  + " Found:\n" + _existingCachedContent);
        }
        final HashMap<String, TableInfo.Column> _columnsVideoProgress = new HashMap<String, TableInfo.Column>(6);
        _columnsVideoProgress.put("playbackId", new TableInfo.Column("playbackId", "TEXT", true, 1, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsVideoProgress.put("mediaId", new TableInfo.Column("mediaId", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsVideoProgress.put("mediaType", new TableInfo.Column("mediaType", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsVideoProgress.put("positionMs", new TableInfo.Column("positionMs", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsVideoProgress.put("durationMs", new TableInfo.Column("durationMs", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsVideoProgress.put("updatedAt", new TableInfo.Column("updatedAt", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        final HashSet<TableInfo.ForeignKey> _foreignKeysVideoProgress = new HashSet<TableInfo.ForeignKey>(0);
        final HashSet<TableInfo.Index> _indicesVideoProgress = new HashSet<TableInfo.Index>(0);
        final TableInfo _infoVideoProgress = new TableInfo("video_progress", _columnsVideoProgress, _foreignKeysVideoProgress, _indicesVideoProgress);
        final TableInfo _existingVideoProgress = TableInfo.read(db, "video_progress");
        if (!_infoVideoProgress.equals(_existingVideoProgress)) {
          return new RoomOpenHelper.ValidationResult(false, "video_progress(data.local.VideoProgress).\n"
                  + " Expected:\n" + _infoVideoProgress + "\n"
                  + " Found:\n" + _existingVideoProgress);
        }
        return new RoomOpenHelper.ValidationResult(true, null);
      }
    }, "c5066cd552a1e5ab930329db08ebc0c7", "f2870e38d41a94aee3a6e8498ec4b44b");
    final SupportSQLiteOpenHelper.Configuration _sqliteConfig = SupportSQLiteOpenHelper.Configuration.builder(config.context).name(config.name).callback(_openCallback).build();
    final SupportSQLiteOpenHelper _helper = config.sqliteOpenHelperFactory.create(_sqliteConfig);
    return _helper;
  }

  @Override
  @NonNull
  protected InvalidationTracker createInvalidationTracker() {
    final HashMap<String, String> _shadowTablesMap = new HashMap<String, String>(0);
    final HashMap<String, Set<String>> _viewTables = new HashMap<String, Set<String>>(0);
    return new InvalidationTracker(this, _shadowTablesMap, _viewTables, "cached_content","video_progress");
  }

  @Override
  public void clearAllTables() {
    super.assertNotMainThread();
    final SupportSQLiteDatabase _db = super.getOpenHelper().getWritableDatabase();
    try {
      super.beginTransaction();
      _db.execSQL("DELETE FROM `cached_content`");
      _db.execSQL("DELETE FROM `video_progress`");
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
    _typeConvertersMap.put(CachedContentDao.class, CachedContentDao_Impl.getRequiredConverters());
    _typeConvertersMap.put(VideoProgressDao.class, VideoProgressDao_Impl.getRequiredConverters());
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
  public CachedContentDao cachedContentDao() {
    if (_cachedContentDao != null) {
      return _cachedContentDao;
    } else {
      synchronized(this) {
        if(_cachedContentDao == null) {
          _cachedContentDao = new CachedContentDao_Impl(this);
        }
        return _cachedContentDao;
      }
    }
  }

  @Override
  public VideoProgressDao videoProgressDao() {
    if (_videoProgressDao != null) {
      return _videoProgressDao;
    } else {
      synchronized(this) {
        if(_videoProgressDao == null) {
          _videoProgressDao = new VideoProgressDao_Impl(this);
        }
        return _videoProgressDao;
      }
    }
  }
}
