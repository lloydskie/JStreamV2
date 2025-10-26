package presentation.viewmodel;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0017\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\u0006\u0010\u000e\u001a\u00020\u000fR\u0014\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0017\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\u000b\u00a2\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0010"}, d2 = {"Lpresentation/viewmodel/MyListViewModel;", "Landroidx/lifecycle/ViewModel;", "favoritesRepo", "Ldata/repository/FavoritesRepository;", "watchlistRepo", "Ldata/repository/WatchlistRepository;", "(Ldata/repository/FavoritesRepository;Ldata/repository/WatchlistRepository;)V", "_uiState", "Lkotlinx/coroutines/flow/MutableStateFlow;", "Lpresentation/viewmodel/MyListUiState;", "uiState", "Lkotlinx/coroutines/flow/StateFlow;", "getUiState", "()Lkotlinx/coroutines/flow/StateFlow;", "loadMyList", "", "app_release"})
@dagger.hilt.android.lifecycle.HiltViewModel
public final class MyListViewModel extends androidx.lifecycle.ViewModel {
    @org.jetbrains.annotations.NotNull
    private final data.repository.FavoritesRepository favoritesRepo = null;
    @org.jetbrains.annotations.NotNull
    private final data.repository.WatchlistRepository watchlistRepo = null;
    @org.jetbrains.annotations.NotNull
    private final kotlinx.coroutines.flow.MutableStateFlow<presentation.viewmodel.MyListUiState> _uiState = null;
    @org.jetbrains.annotations.NotNull
    private final kotlinx.coroutines.flow.StateFlow<presentation.viewmodel.MyListUiState> uiState = null;
    
    @javax.inject.Inject
    public MyListViewModel(@org.jetbrains.annotations.NotNull
    data.repository.FavoritesRepository favoritesRepo, @org.jetbrains.annotations.NotNull
    data.repository.WatchlistRepository watchlistRepo) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public final kotlinx.coroutines.flow.StateFlow<presentation.viewmodel.MyListUiState> getUiState() {
        return null;
    }
    
    public final void loadMyList() {
    }
}