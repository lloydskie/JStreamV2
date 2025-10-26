package com.jstreamv2.domain.usecase;

import com.jstreamv2.data.remote.TmdbApiService;
import com.jstreamv2.util.TrailerFilterUtil;
import kotlinx.coroutines.flow.Flow;
import java.io.IOException;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\u001f\u0010\u0007\u001a\u0010\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\n0\t0\b2\u0006\u0010\u000b\u001a\u00020\f\u00f8\u0001\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\r"}, d2 = {"Lcom/jstreamv2/domain/usecase/GetMovieTrailerUseCase;", "", "api", "Lcom/jstreamv2/data/remote/TmdbApiService;", "authToken", "", "(Lcom/jstreamv2/data/remote/TmdbApiService;Ljava/lang/String;)V", "invoke", "Lkotlinx/coroutines/flow/Flow;", "Lkotlin/Result;", "Lcom/jstreamv2/data/model/VideoDto;", "movieId", "", "app_release"})
public final class GetMovieTrailerUseCase {
    @org.jetbrains.annotations.NotNull
    private final com.jstreamv2.data.remote.TmdbApiService api = null;
    @org.jetbrains.annotations.NotNull
    private final java.lang.String authToken = null;
    
    public GetMovieTrailerUseCase(@org.jetbrains.annotations.NotNull
    com.jstreamv2.data.remote.TmdbApiService api, @org.jetbrains.annotations.NotNull
    java.lang.String authToken) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public final kotlinx.coroutines.flow.Flow<kotlin.Result<com.jstreamv2.data.model.VideoDto>> invoke(int movieId) {
        return null;
    }
}