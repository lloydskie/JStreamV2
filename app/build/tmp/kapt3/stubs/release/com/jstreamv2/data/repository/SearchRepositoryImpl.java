package com.jstreamv2.data.repository;

import com.jstreamv2.data.local.AppDao;
import com.jstreamv2.data.local.SearchHistory;
import com.jstreamv2.data.remote.TmdbApiService;
import com.jstreamv2.data.model.MovieListResponse;
import com.jstreamv2.data.model.TvListResponse;
import com.jstreamv2.data.model.PersonListResponse;
import kotlinx.coroutines.flow.Flow;
import java.io.IOException;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0002\u0010\bJ\u0019\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fH\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\rJ\u0011\u0010\u000e\u001a\u00020\nH\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u000fJ\u0019\u0010\u0010\u001a\u00020\n2\u0006\u0010\u0011\u001a\u00020\u0012H\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0013J\u0012\u0010\u0014\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u00160\u0015J\'\u0010\u0017\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00190\u00180\u00152\u0006\u0010\u001a\u001a\u00020\u00072\b\b\u0002\u0010\u001b\u001a\u00020\u0012\u00f8\u0001\u0000J\'\u0010\u001c\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001d0\u00180\u00152\u0006\u0010\u001a\u001a\u00020\u00072\b\b\u0002\u0010\u001b\u001a\u00020\u0012\u00f8\u0001\u0000J\'\u0010\u001e\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001f0\u00180\u00152\u0006\u0010\u001a\u001a\u00020\u00072\b\b\u0002\u0010\u001b\u001a\u00020\u0012\u00f8\u0001\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006 "}, d2 = {"Lcom/jstreamv2/data/repository/SearchRepositoryImpl;", "", "api", "Lcom/jstreamv2/data/remote/TmdbApiService;", "dao", "Lcom/jstreamv2/data/local/AppDao;", "authToken", "", "(Lcom/jstreamv2/data/remote/TmdbApiService;Lcom/jstreamv2/data/local/AppDao;Ljava/lang/String;)V", "addSearchHistory", "", "history", "Lcom/jstreamv2/data/local/SearchHistory;", "(Lcom/jstreamv2/data/local/SearchHistory;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "clearSearchHistory", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "deleteSearchHistory", "id", "", "(ILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getAllSearchHistory", "Lkotlinx/coroutines/flow/Flow;", "", "searchMovies", "Lkotlin/Result;", "Lcom/jstreamv2/data/model/MovieListResponse;", "query", "page", "searchPerson", "Lcom/jstreamv2/data/model/PersonListResponse;", "searchTv", "Lcom/jstreamv2/data/model/TvListResponse;", "app_release"})
public final class SearchRepositoryImpl {
    @org.jetbrains.annotations.NotNull
    private final com.jstreamv2.data.remote.TmdbApiService api = null;
    @org.jetbrains.annotations.NotNull
    private final com.jstreamv2.data.local.AppDao dao = null;
    @org.jetbrains.annotations.NotNull
    private final java.lang.String authToken = null;
    
    public SearchRepositoryImpl(@org.jetbrains.annotations.NotNull
    com.jstreamv2.data.remote.TmdbApiService api, @org.jetbrains.annotations.NotNull
    com.jstreamv2.data.local.AppDao dao, @org.jetbrains.annotations.NotNull
    java.lang.String authToken) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public final kotlinx.coroutines.flow.Flow<kotlin.Result<com.jstreamv2.data.model.MovieListResponse>> searchMovies(@org.jetbrains.annotations.NotNull
    java.lang.String query, int page) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final kotlinx.coroutines.flow.Flow<kotlin.Result<com.jstreamv2.data.model.TvListResponse>> searchTv(@org.jetbrains.annotations.NotNull
    java.lang.String query, int page) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final kotlinx.coroutines.flow.Flow<kotlin.Result<com.jstreamv2.data.model.PersonListResponse>> searchPerson(@org.jetbrains.annotations.NotNull
    java.lang.String query, int page) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.Object addSearchHistory(@org.jetbrains.annotations.NotNull
    com.jstreamv2.data.local.SearchHistory history, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super kotlin.Unit> $completion) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final kotlinx.coroutines.flow.Flow<java.util.List<com.jstreamv2.data.local.SearchHistory>> getAllSearchHistory() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.Object deleteSearchHistory(int id, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super kotlin.Unit> $completion) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.Object clearSearchHistory(@org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super kotlin.Unit> $completion) {
        return null;
    }
}