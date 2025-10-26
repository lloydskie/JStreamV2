package com.jstreamv2.domain.usecase;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u001d\u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u00062\u0006\u0010\t\u001a\u00020\n\u00f8\u0001\u0000J\u001d\u0010\u000b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u00070\u00062\u0006\u0010\t\u001a\u00020\n\u00f8\u0001\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\r"}, d2 = {"Lcom/jstreamv2/domain/usecase/GetPersonCreditsUseCase;", "", "repository", "Lcom/jstreamv2/domain/repository/PersonRepository;", "(Lcom/jstreamv2/domain/repository/PersonRepository;)V", "getMovieCredits", "Lkotlinx/coroutines/flow/Flow;", "Lkotlin/Result;", "Lcom/jstreamv2/data/model/PersonMovieCreditsResponse;", "personId", "", "getTvCredits", "Lcom/jstreamv2/data/model/PersonTvCreditsResponse;", "app_debug"})
public final class GetPersonCreditsUseCase {
    @org.jetbrains.annotations.NotNull
    private final com.jstreamv2.domain.repository.PersonRepository repository = null;
    
    public GetPersonCreditsUseCase(@org.jetbrains.annotations.NotNull
    com.jstreamv2.domain.repository.PersonRepository repository) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public final kotlinx.coroutines.flow.Flow<kotlin.Result<com.jstreamv2.data.model.PersonMovieCreditsResponse>> getMovieCredits(int personId) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final kotlinx.coroutines.flow.Flow<kotlin.Result<com.jstreamv2.data.model.PersonTvCreditsResponse>> getTvCredits(int personId) {
        return null;
    }
}