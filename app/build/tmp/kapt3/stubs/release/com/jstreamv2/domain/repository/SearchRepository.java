package com.jstreamv2.domain.repository;

import com.jstreamv2.data.model.MovieListResponse;
import com.jstreamv2.data.model.TvListResponse;
import com.jstreamv2.data.model.PersonListResponse;
import com.jstreamv2.data.local.SearchHistory;
import kotlinx.coroutines.flow.Flow;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0019\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u00a6@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0006J\u0011\u0010\u0007\u001a\u00020\u0003H\u00a6@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\bJ\u0019\u0010\t\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\u000bH\u00a6@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\fJ\u0014\u0010\r\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u000f0\u000eH&J)\u0010\u0010\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00120\u00110\u000e2\u0006\u0010\u0013\u001a\u00020\u00142\b\b\u0002\u0010\u0015\u001a\u00020\u000bH&\u00f8\u0001\u0000J)\u0010\u0016\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00170\u00110\u000e2\u0006\u0010\u0013\u001a\u00020\u00142\b\b\u0002\u0010\u0015\u001a\u00020\u000bH&\u00f8\u0001\u0000J)\u0010\u0018\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00190\u00110\u000e2\u0006\u0010\u0013\u001a\u00020\u00142\b\b\u0002\u0010\u0015\u001a\u00020\u000bH&\u00f8\u0001\u0000\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u001a"}, d2 = {"Lcom/jstreamv2/domain/repository/SearchRepository;", "", "addSearchHistory", "", "history", "Lcom/jstreamv2/data/local/SearchHistory;", "(Lcom/jstreamv2/data/local/SearchHistory;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "clearSearchHistory", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "deleteSearchHistory", "id", "", "(ILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getAllSearchHistory", "Lkotlinx/coroutines/flow/Flow;", "", "searchMovies", "Lkotlin/Result;", "Lcom/jstreamv2/data/model/MovieListResponse;", "query", "", "page", "searchPerson", "Lcom/jstreamv2/data/model/PersonListResponse;", "searchTv", "Lcom/jstreamv2/data/model/TvListResponse;", "app_release"})
public abstract interface SearchRepository {
    
    @org.jetbrains.annotations.NotNull
    public abstract kotlinx.coroutines.flow.Flow<kotlin.Result<com.jstreamv2.data.model.MovieListResponse>> searchMovies(@org.jetbrains.annotations.NotNull
    java.lang.String query, int page);
    
    @org.jetbrains.annotations.NotNull
    public abstract kotlinx.coroutines.flow.Flow<kotlin.Result<com.jstreamv2.data.model.TvListResponse>> searchTv(@org.jetbrains.annotations.NotNull
    java.lang.String query, int page);
    
    @org.jetbrains.annotations.NotNull
    public abstract kotlinx.coroutines.flow.Flow<kotlin.Result<com.jstreamv2.data.model.PersonListResponse>> searchPerson(@org.jetbrains.annotations.NotNull
    java.lang.String query, int page);
    
    @org.jetbrains.annotations.Nullable
    public abstract java.lang.Object addSearchHistory(@org.jetbrains.annotations.NotNull
    com.jstreamv2.data.local.SearchHistory history, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super kotlin.Unit> $completion);
    
    @org.jetbrains.annotations.NotNull
    public abstract kotlinx.coroutines.flow.Flow<java.util.List<com.jstreamv2.data.local.SearchHistory>> getAllSearchHistory();
    
    @org.jetbrains.annotations.Nullable
    public abstract java.lang.Object deleteSearchHistory(int id, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super kotlin.Unit> $completion);
    
    @org.jetbrains.annotations.Nullable
    public abstract java.lang.Object clearSearchHistory(@org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super kotlin.Unit> $completion);
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 3, xi = 48)
    public static final class DefaultImpls {
    }
}