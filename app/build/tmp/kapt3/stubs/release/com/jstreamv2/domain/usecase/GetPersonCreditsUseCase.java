package com.jstreamv2.domain.usecase;

import com.jstreamv2.domain.repository.PersonRepository;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0013\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b\u00a2\u0006\u0002\u0010\tJ\u0013\u0010\n\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b\u00a2\u0006\u0002\u0010\tR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u000b"}, d2 = {"Lcom/jstreamv2/domain/usecase/GetPersonCreditsUseCase;", "", "repository", "Lcom/jstreamv2/domain/repository/PersonRepository;", "(Lcom/jstreamv2/domain/repository/PersonRepository;)V", "getMovieCredits", "error/NonExistentClass", "personId", "", "(I)Lerror/NonExistentClass;", "getTvCredits", "app_release"})
public final class GetPersonCreditsUseCase {
    @org.jetbrains.annotations.NotNull
    private final com.jstreamv2.domain.repository.PersonRepository repository = null;
    
    public GetPersonCreditsUseCase(@org.jetbrains.annotations.NotNull
    com.jstreamv2.domain.repository.PersonRepository repository) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.Object getMovieCredits(int personId) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.Object getTvCredits(int personId) {
        return null;
    }
}