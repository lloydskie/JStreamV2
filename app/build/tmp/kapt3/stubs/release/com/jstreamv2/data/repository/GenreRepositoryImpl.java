package com.jstreamv2.data.repository;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\u0015\u0010\u0007\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t0\b\u00f8\u0001\u0000J\u0015\u0010\u000b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t0\b\u00f8\u0001\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\f"}, d2 = {"Lcom/jstreamv2/data/repository/GenreRepositoryImpl;", "", "api", "Lcom/jstreamv2/data/remote/TmdbApiService;", "authToken", "", "(Lcom/jstreamv2/data/remote/TmdbApiService;Ljava/lang/String;)V", "getMovieGenres", "Lkotlinx/coroutines/flow/Flow;", "Lkotlin/Result;", "Lcom/jstreamv2/data/model/GenreListResponse;", "getTvGenres", "app_release"})
public final class GenreRepositoryImpl {
    @org.jetbrains.annotations.NotNull
    private final com.jstreamv2.data.remote.TmdbApiService api = null;
    @org.jetbrains.annotations.NotNull
    private final java.lang.String authToken = null;
    
    public GenreRepositoryImpl(@org.jetbrains.annotations.NotNull
    com.jstreamv2.data.remote.TmdbApiService api, @org.jetbrains.annotations.NotNull
    java.lang.String authToken) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public final kotlinx.coroutines.flow.Flow<kotlin.Result<com.jstreamv2.data.model.GenreListResponse>> getMovieGenres() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final kotlinx.coroutines.flow.Flow<kotlin.Result<com.jstreamv2.data.model.GenreListResponse>> getTvGenres() {
        return null;
    }
}