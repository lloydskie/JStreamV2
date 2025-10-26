package com.jstreamv2.domain.repository;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u0019\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u00a6@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0006J\u0019\u0010\u0007\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\tH\u00a6@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\nJ!\u0010\u000b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0\r0\f2\b\b\u0002\u0010\u000f\u001a\u00020\u0010H&\u00f8\u0001\u0000J\u001f\u0010\u0011\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00120\r0\f2\u0006\u0010\u0013\u001a\u00020\u0010H&\u00f8\u0001\u0000\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u0014"}, d2 = {"Lcom/jstreamv2/domain/repository/TVShowRepository;", "", "cacheTVShow", "", "tvShow", "Lcom/jstreamv2/data/local/CachedTVShow;", "(Lcom/jstreamv2/data/local/CachedTVShow;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "clearOldCachedTVShows", "threshold", "", "(JLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getPopularTv", "Lkotlinx/coroutines/flow/Flow;", "Lkotlin/Result;", "Lcom/jstreamv2/data/model/TvListResponse;", "page", "", "getTvDetails", "Lcom/jstreamv2/data/model/TvDetailsResponse;", "id", "app_release"})
public abstract interface TVShowRepository {
    
    @org.jetbrains.annotations.NotNull
    public abstract kotlinx.coroutines.flow.Flow<kotlin.Result<com.jstreamv2.data.model.TvListResponse>> getPopularTv(int page);
    
    @org.jetbrains.annotations.NotNull
    public abstract kotlinx.coroutines.flow.Flow<kotlin.Result<com.jstreamv2.data.model.TvDetailsResponse>> getTvDetails(int id);
    
    @org.jetbrains.annotations.Nullable
    public abstract java.lang.Object cacheTVShow(@org.jetbrains.annotations.NotNull
    com.jstreamv2.data.local.CachedTVShow tvShow, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super kotlin.Unit> $completion);
    
    @org.jetbrains.annotations.Nullable
    public abstract java.lang.Object clearOldCachedTVShows(long threshold, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super kotlin.Unit> $completion);
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 3, xi = 48)
    public static final class DefaultImpls {
    }
}