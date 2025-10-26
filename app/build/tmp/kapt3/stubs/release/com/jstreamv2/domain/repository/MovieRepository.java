package com.jstreamv2.domain.repository;

import com.jstreamv2.data.model.MovieListResponse;
import com.jstreamv2.data.model.MovieDetailsResponse;
import kotlinx.coroutines.flow.Flow;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u0019\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u00a6@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0006J\u0019\u0010\u0007\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\tH\u00a6@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\nJ\u001f\u0010\u000b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0\r0\f2\u0006\u0010\u000f\u001a\u00020\u0010H&\u00f8\u0001\u0000J!\u0010\u0011\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00120\r0\f2\b\b\u0002\u0010\u0013\u001a\u00020\u0010H&\u00f8\u0001\u0000\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u0014"}, d2 = {"Lcom/jstreamv2/domain/repository/MovieRepository;", "", "cacheMovie", "", "movie", "Lcom/jstreamv2/data/local/CachedMovie;", "(Lcom/jstreamv2/data/local/CachedMovie;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "clearOldCachedMovies", "threshold", "", "(JLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getMovieDetails", "Lkotlinx/coroutines/flow/Flow;", "Lkotlin/Result;", "Lcom/jstreamv2/data/model/MovieDetailsResponse;", "id", "", "getPopularMovies", "Lcom/jstreamv2/data/model/MovieListResponse;", "page", "app_release"})
public abstract interface MovieRepository {
    
    @org.jetbrains.annotations.NotNull
    public abstract kotlinx.coroutines.flow.Flow<kotlin.Result<com.jstreamv2.data.model.MovieListResponse>> getPopularMovies(int page);
    
    @org.jetbrains.annotations.NotNull
    public abstract kotlinx.coroutines.flow.Flow<kotlin.Result<com.jstreamv2.data.model.MovieDetailsResponse>> getMovieDetails(int id);
    
    @org.jetbrains.annotations.Nullable
    public abstract java.lang.Object cacheMovie(@org.jetbrains.annotations.NotNull
    com.jstreamv2.data.local.CachedMovie movie, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super kotlin.Unit> $completion);
    
    @org.jetbrains.annotations.Nullable
    public abstract java.lang.Object clearOldCachedMovies(long threshold, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super kotlin.Unit> $completion);
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 3, xi = 48)
    public static final class DefaultImpls {
    }
}