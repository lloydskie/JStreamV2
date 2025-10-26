package com.jstreamv2.data.repository;

import com.jstreamv2.data.local.AppDao;
import com.jstreamv2.data.local.CachedMovie;
import com.jstreamv2.data.remote.TmdbApiService;
import com.jstreamv2.data.model.MovieListResponse;
import com.jstreamv2.data.model.MovieDetailsResponse;
import kotlinx.coroutines.flow.Flow;
import java.io.IOException;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0002\u0010\bJ\u0019\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fH\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\rJ\u0019\u0010\u000e\u001a\u00020\n2\u0006\u0010\u000f\u001a\u00020\u0010H\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0011J\u001d\u0010\u0012\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00150\u00140\u00132\u0006\u0010\u0016\u001a\u00020\u0017\u00f8\u0001\u0000J\u001f\u0010\u0018\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00190\u00140\u00132\b\b\u0002\u0010\u001a\u001a\u00020\u0017\u00f8\u0001\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u001b"}, d2 = {"Lcom/jstreamv2/data/repository/MovieRepositoryImpl;", "", "api", "Lcom/jstreamv2/data/remote/TmdbApiService;", "dao", "Lcom/jstreamv2/data/local/AppDao;", "authToken", "", "(Lcom/jstreamv2/data/remote/TmdbApiService;Lcom/jstreamv2/data/local/AppDao;Ljava/lang/String;)V", "cacheMovie", "", "movie", "Lcom/jstreamv2/data/local/CachedMovie;", "(Lcom/jstreamv2/data/local/CachedMovie;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "clearOldCachedMovies", "threshold", "", "(JLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getMovieDetails", "Lkotlinx/coroutines/flow/Flow;", "Lkotlin/Result;", "Lcom/jstreamv2/data/model/MovieDetailsResponse;", "id", "", "getPopularMovies", "Lcom/jstreamv2/data/model/MovieListResponse;", "page", "app_debug"})
public final class MovieRepositoryImpl {
    @org.jetbrains.annotations.NotNull
    private final com.jstreamv2.data.remote.TmdbApiService api = null;
    @org.jetbrains.annotations.NotNull
    private final com.jstreamv2.data.local.AppDao dao = null;
    @org.jetbrains.annotations.NotNull
    private final java.lang.String authToken = null;
    
    public MovieRepositoryImpl(@org.jetbrains.annotations.NotNull
    com.jstreamv2.data.remote.TmdbApiService api, @org.jetbrains.annotations.NotNull
    com.jstreamv2.data.local.AppDao dao, @org.jetbrains.annotations.NotNull
    java.lang.String authToken) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public final kotlinx.coroutines.flow.Flow<kotlin.Result<com.jstreamv2.data.model.MovieListResponse>> getPopularMovies(int page) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final kotlinx.coroutines.flow.Flow<kotlin.Result<com.jstreamv2.data.model.MovieDetailsResponse>> getMovieDetails(int id) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.Object cacheMovie(@org.jetbrains.annotations.NotNull
    com.jstreamv2.data.local.CachedMovie movie, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super kotlin.Unit> $completion) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.Object clearOldCachedMovies(long threshold, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super kotlin.Unit> $completion) {
        return null;
    }
}