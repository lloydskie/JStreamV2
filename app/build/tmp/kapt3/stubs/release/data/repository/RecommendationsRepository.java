package data.repository;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\u0017\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\bH\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\nR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u000b"}, d2 = {"Ldata/repository/RecommendationsRepository;", "", "appDao", "Lcom/jstreamv2/data/local/AppDao;", "progressDao", "Ldata/local/VideoProgressDao;", "(Lcom/jstreamv2/data/local/AppDao;Ldata/local/VideoProgressDao;)V", "getRecommendations", "", "Ldata/repository/RecommendedItem;", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "app_release"})
public final class RecommendationsRepository {
    @org.jetbrains.annotations.NotNull
    private final com.jstreamv2.data.local.AppDao appDao = null;
    @org.jetbrains.annotations.NotNull
    private final data.local.VideoProgressDao progressDao = null;
    
    public RecommendationsRepository(@org.jetbrains.annotations.NotNull
    com.jstreamv2.data.local.AppDao appDao, @org.jetbrains.annotations.NotNull
    data.local.VideoProgressDao progressDao) {
        super();
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.Object getRecommendations(@org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super java.util.List<data.repository.RecommendedItem>> $completion) {
        return null;
    }
}