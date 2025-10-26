package presentation.viewmodel;

import androidx.lifecycle.ViewModel;
import dagger.hilt.android.lifecycle.HiltViewModel;
import javax.inject.Inject;
import kotlinx.coroutines.flow.StateFlow;
import data.repository.VideoProgressRepository;
import data.local.VideoProgress;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\u0002\u0010\u0004J\u000e\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0013J\u000e\u0010\u0014\u001a\u00020\u00112\u0006\u0010\u0015\u001a\u00020\u0013J\u0006\u0010\u0016\u001a\u00020\u0011J\u0006\u0010\u0017\u001a\u00020\u0011J.\u0010\u0018\u001a\u00020\u00112\u0006\u0010\u0015\u001a\u00020\u00132\u0006\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u00132\u0006\u0010\u001c\u001a\u00020\u00072\u0006\u0010\u001d\u001a\u00020\u0007R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0017\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00070\u000b\u00a2\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0010\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0017\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\t0\u000b\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\r\u00a8\u0006\u001e"}, d2 = {"Lpresentation/viewmodel/PlayerViewModel;", "Landroidx/lifecycle/ViewModel;", "progressRepo", "Ldata/repository/VideoProgressRepository;", "(Ldata/repository/VideoProgressRepository;)V", "_progressMs", "Lkotlinx/coroutines/flow/MutableStateFlow;", "", "_uiState", "Lpresentation/viewmodel/PlayerUiState;", "progressMs", "Lkotlinx/coroutines/flow/StateFlow;", "getProgressMs", "()Lkotlinx/coroutines/flow/StateFlow;", "uiState", "getUiState", "error", "", "msg", "", "loadProgress", "playbackId", "pause", "play", "saveProgress", "mediaId", "", "mediaType", "positionMs", "durationMs", "app_debug"})
@dagger.hilt.android.lifecycle.HiltViewModel
public final class PlayerViewModel extends androidx.lifecycle.ViewModel {
    @org.jetbrains.annotations.Nullable
    private final data.repository.VideoProgressRepository progressRepo = null;
    @org.jetbrains.annotations.NotNull
    private final kotlinx.coroutines.flow.MutableStateFlow<presentation.viewmodel.PlayerUiState> _uiState = null;
    @org.jetbrains.annotations.NotNull
    private final kotlinx.coroutines.flow.StateFlow<presentation.viewmodel.PlayerUiState> uiState = null;
    @org.jetbrains.annotations.NotNull
    private final kotlinx.coroutines.flow.MutableStateFlow<java.lang.Long> _progressMs = null;
    @org.jetbrains.annotations.NotNull
    private final kotlinx.coroutines.flow.StateFlow<java.lang.Long> progressMs = null;
    
    @javax.inject.Inject
    public PlayerViewModel(@org.jetbrains.annotations.Nullable
    data.repository.VideoProgressRepository progressRepo) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public final kotlinx.coroutines.flow.StateFlow<presentation.viewmodel.PlayerUiState> getUiState() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final kotlinx.coroutines.flow.StateFlow<java.lang.Long> getProgressMs() {
        return null;
    }
    
    public final void loadProgress(@org.jetbrains.annotations.NotNull
    java.lang.String playbackId) {
    }
    
    public final void saveProgress(@org.jetbrains.annotations.NotNull
    java.lang.String playbackId, int mediaId, @org.jetbrains.annotations.NotNull
    java.lang.String mediaType, long positionMs, long durationMs) {
    }
    
    public final void play() {
    }
    
    public final void pause() {
    }
    
    public final void error(@org.jetbrains.annotations.NotNull
    java.lang.String msg) {
    }
}