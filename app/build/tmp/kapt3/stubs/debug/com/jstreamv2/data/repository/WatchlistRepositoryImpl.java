package com.jstreamv2.data.repository;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\b\u0002\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0019\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\tJ\u0012\u0010\n\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\f0\u000bJ\u0019\u0010\r\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\tR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u000e"}, d2 = {"Lcom/jstreamv2/data/repository/WatchlistRepositoryImpl;", "", "dao", "Lcom/jstreamv2/data/local/AppDao;", "(Lcom/jstreamv2/data/local/AppDao;)V", "addWatchlist", "", "item", "Lcom/jstreamv2/data/local/WatchlistItem;", "(Lcom/jstreamv2/data/local/WatchlistItem;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getAllWatchlist", "Lkotlinx/coroutines/flow/Flow;", "", "removeWatchlist", "app_debug"})
public final class WatchlistRepositoryImpl {
    @org.jetbrains.annotations.NotNull
    private final com.jstreamv2.data.local.AppDao dao = null;
    
    public WatchlistRepositoryImpl(@org.jetbrains.annotations.NotNull
    com.jstreamv2.data.local.AppDao dao) {
        super();
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.Object addWatchlist(@org.jetbrains.annotations.NotNull
    com.jstreamv2.data.local.WatchlistItem item, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super kotlin.Unit> $completion) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.Object removeWatchlist(@org.jetbrains.annotations.NotNull
    com.jstreamv2.data.local.WatchlistItem item, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super kotlin.Unit> $completion) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final kotlinx.coroutines.flow.Flow<java.util.List<com.jstreamv2.data.local.WatchlistItem>> getAllWatchlist() {
        return null;
    }
}