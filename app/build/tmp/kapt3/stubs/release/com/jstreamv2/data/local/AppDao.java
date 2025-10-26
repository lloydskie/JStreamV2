package com.jstreamv2.data.local;

import androidx.room.*;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0007\bg\u0018\u00002\u00020\u0001J\u0019\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0006J\u0019\u0010\u0007\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\tH\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\nJ\u0019\u0010\u000b\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\fH\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\rJ\u0019\u0010\u000e\u001a\u00020\u00032\u0006\u0010\u000f\u001a\u00020\u0010H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0011J\u0019\u0010\u0012\u001a\u00020\u00032\u0006\u0010\u0013\u001a\u00020\u0014H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0015J\u0019\u0010\u0016\u001a\u00020\u00032\u0006\u0010\u0017\u001a\u00020\u0018H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0019J\u0019\u0010\u001a\u001a\u00020\u00032\u0006\u0010\u0017\u001a\u00020\u0018H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0019J\u0011\u0010\u001b\u001a\u00020\u0003H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u001cJ\u0019\u0010\u001d\u001a\u00020\u00032\u0006\u0010\u001e\u001a\u00020\u001fH\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010 J\u0017\u0010!\u001a\b\u0012\u0004\u0012\u00020\u00050\"H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u001cJ\u0017\u0010#\u001a\b\u0012\u0004\u0012\u00020\t0\"H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u001cJ\u0017\u0010$\u001a\b\u0012\u0004\u0012\u00020\f0\"H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u001cJ\u001b\u0010%\u001a\u0004\u0018\u00010\u00102\u0006\u0010\u001e\u001a\u00020\u001fH\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010 J\u001b\u0010&\u001a\u0004\u0018\u00010\u00142\u0006\u0010\u001e\u001a\u00020\u001fH\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010 J\u0019\u0010\'\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0006J\u0019\u0010(\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\fH\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\r\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006)"}, d2 = {"Lcom/jstreamv2/data/local/AppDao;", "", "addFavorite", "", "item", "Lcom/jstreamv2/data/local/FavoriteItem;", "(Lcom/jstreamv2/data/local/FavoriteItem;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "addSearchHistory", "history", "Lcom/jstreamv2/data/local/SearchHistory;", "(Lcom/jstreamv2/data/local/SearchHistory;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "addWatchlist", "Lcom/jstreamv2/data/local/WatchlistItem;", "(Lcom/jstreamv2/data/local/WatchlistItem;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "cacheMovie", "movie", "Lcom/jstreamv2/data/local/CachedMovie;", "(Lcom/jstreamv2/data/local/CachedMovie;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "cacheTVShow", "tvShow", "Lcom/jstreamv2/data/local/CachedTVShow;", "(Lcom/jstreamv2/data/local/CachedTVShow;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "clearOldCachedMovies", "threshold", "", "(JLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "clearOldCachedTVShows", "clearSearchHistory", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "deleteSearchHistory", "id", "", "(ILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getAllFavorites", "", "getAllSearchHistory", "getAllWatchlist", "getCachedMovie", "getCachedTVShow", "removeFavorite", "removeWatchlist", "app_release"})
@androidx.room.Dao
public abstract interface AppDao {
    
    @androidx.room.Insert(onConflict = 1)
    @org.jetbrains.annotations.Nullable
    public abstract java.lang.Object addFavorite(@org.jetbrains.annotations.NotNull
    com.jstreamv2.data.local.FavoriteItem item, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super kotlin.Unit> $completion);
    
    @androidx.room.Delete
    @org.jetbrains.annotations.Nullable
    public abstract java.lang.Object removeFavorite(@org.jetbrains.annotations.NotNull
    com.jstreamv2.data.local.FavoriteItem item, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super kotlin.Unit> $completion);
    
    @androidx.room.Query(value = "SELECT * FROM favorite_items")
    @org.jetbrains.annotations.Nullable
    public abstract java.lang.Object getAllFavorites(@org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super java.util.List<com.jstreamv2.data.local.FavoriteItem>> $completion);
    
    @androidx.room.Insert(onConflict = 1)
    @org.jetbrains.annotations.Nullable
    public abstract java.lang.Object addWatchlist(@org.jetbrains.annotations.NotNull
    com.jstreamv2.data.local.WatchlistItem item, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super kotlin.Unit> $completion);
    
    @androidx.room.Delete
    @org.jetbrains.annotations.Nullable
    public abstract java.lang.Object removeWatchlist(@org.jetbrains.annotations.NotNull
    com.jstreamv2.data.local.WatchlistItem item, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super kotlin.Unit> $completion);
    
    @androidx.room.Query(value = "SELECT * FROM watchlist_items")
    @org.jetbrains.annotations.Nullable
    public abstract java.lang.Object getAllWatchlist(@org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super java.util.List<com.jstreamv2.data.local.WatchlistItem>> $completion);
    
    @androidx.room.Insert(onConflict = 1)
    @org.jetbrains.annotations.Nullable
    public abstract java.lang.Object cacheMovie(@org.jetbrains.annotations.NotNull
    com.jstreamv2.data.local.CachedMovie movie, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super kotlin.Unit> $completion);
    
    @androidx.room.Query(value = "SELECT * FROM cached_movies WHERE id = :id")
    @org.jetbrains.annotations.Nullable
    public abstract java.lang.Object getCachedMovie(int id, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super com.jstreamv2.data.local.CachedMovie> $completion);
    
    @androidx.room.Query(value = "DELETE FROM cached_movies WHERE cachedDate < :threshold")
    @org.jetbrains.annotations.Nullable
    public abstract java.lang.Object clearOldCachedMovies(long threshold, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super kotlin.Unit> $completion);
    
    @androidx.room.Insert(onConflict = 1)
    @org.jetbrains.annotations.Nullable
    public abstract java.lang.Object cacheTVShow(@org.jetbrains.annotations.NotNull
    com.jstreamv2.data.local.CachedTVShow tvShow, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super kotlin.Unit> $completion);
    
    @androidx.room.Query(value = "SELECT * FROM cached_tv_shows WHERE id = :id")
    @org.jetbrains.annotations.Nullable
    public abstract java.lang.Object getCachedTVShow(int id, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super com.jstreamv2.data.local.CachedTVShow> $completion);
    
    @androidx.room.Query(value = "DELETE FROM cached_tv_shows WHERE cachedDate < :threshold")
    @org.jetbrains.annotations.Nullable
    public abstract java.lang.Object clearOldCachedTVShows(long threshold, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super kotlin.Unit> $completion);
    
    @androidx.room.Insert(onConflict = 1)
    @org.jetbrains.annotations.Nullable
    public abstract java.lang.Object addSearchHistory(@org.jetbrains.annotations.NotNull
    com.jstreamv2.data.local.SearchHistory history, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super kotlin.Unit> $completion);
    
    @androidx.room.Query(value = "SELECT * FROM search_history ORDER BY timestamp DESC")
    @org.jetbrains.annotations.Nullable
    public abstract java.lang.Object getAllSearchHistory(@org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super java.util.List<com.jstreamv2.data.local.SearchHistory>> $completion);
    
    @androidx.room.Query(value = "DELETE FROM search_history WHERE id = :id")
    @org.jetbrains.annotations.Nullable
    public abstract java.lang.Object deleteSearchHistory(int id, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super kotlin.Unit> $completion);
    
    @androidx.room.Query(value = "DELETE FROM search_history")
    @org.jetbrains.annotations.Nullable
    public abstract java.lang.Object clearSearchHistory(@org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super kotlin.Unit> $completion);
}