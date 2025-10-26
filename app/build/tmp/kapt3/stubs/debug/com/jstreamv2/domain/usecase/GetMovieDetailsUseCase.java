package com.jstreamv2.domain.usecase;

import com.jstreamv2.domain.repository.MovieRepository;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J \u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u00062\u0006\u0010\t\u001a\u00020\nH\u0086\u0002\u00f8\u0001\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u000b"}, d2 = {"Lcom/jstreamv2/domain/usecase/GetMovieDetailsUseCase;", "", "repository", "Lcom/jstreamv2/domain/repository/MovieRepository;", "(Lcom/jstreamv2/domain/repository/MovieRepository;)V", "invoke", "Lkotlinx/coroutines/flow/Flow;", "Lkotlin/Result;", "Lcom/jstreamv2/data/model/MovieDetailsResponse;", "id", "", "app_debug"})
public final class GetMovieDetailsUseCase {
    @org.jetbrains.annotations.NotNull
    private final com.jstreamv2.domain.repository.MovieRepository repository = null;
    
    public GetMovieDetailsUseCase(@org.jetbrains.annotations.NotNull
    com.jstreamv2.domain.repository.MovieRepository repository) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public final kotlinx.coroutines.flow.Flow<kotlin.Result<com.jstreamv2.data.model.MovieDetailsResponse>> invoke(int id) {
        return null;
    }
}