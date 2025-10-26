package com.jstreamv2.domain.repository;

import com.jstreamv2.data.model.PersonMovieCreditsResponse;
import com.jstreamv2.data.model.PersonTvCreditsResponse;
import kotlinx.coroutines.flow.Flow;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u001f\u0010\u0002\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u00032\u0006\u0010\u0006\u001a\u00020\u0007H&\u00f8\u0001\u0000J\u001f\u0010\b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\u00040\u00032\u0006\u0010\u0006\u001a\u00020\u0007H&\u00f8\u0001\u0000\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\n"}, d2 = {"Lcom/jstreamv2/domain/repository/PersonRepository;", "", "getPersonMovieCredits", "Lkotlinx/coroutines/flow/Flow;", "Lkotlin/Result;", "Lcom/jstreamv2/data/model/PersonMovieCreditsResponse;", "personId", "", "getPersonTvCredits", "Lcom/jstreamv2/data/model/PersonTvCreditsResponse;", "app_release"})
public abstract interface PersonRepository {
    
    @org.jetbrains.annotations.NotNull
    public abstract kotlinx.coroutines.flow.Flow<kotlin.Result<com.jstreamv2.data.model.PersonMovieCreditsResponse>> getPersonMovieCredits(int personId);
    
    @org.jetbrains.annotations.NotNull
    public abstract kotlinx.coroutines.flow.Flow<kotlin.Result<com.jstreamv2.data.model.PersonTvCreditsResponse>> getPersonTvCredits(int personId);
}