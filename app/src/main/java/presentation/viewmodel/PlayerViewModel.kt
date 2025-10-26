package presentation.viewmodel

import androidx.lifecycle.ViewModel
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.update
import kotlinx.coroutines.launch
import androidx.lifecycle.viewModelScope
import data.repository.VideoProgressRepository
import data.local.VideoProgress

sealed class PlayerUiState {
    object Idle : PlayerUiState()
    object Playing : PlayerUiState()
    object Paused : PlayerUiState()
    data class Error(val message: String) : PlayerUiState()
}

@HiltViewModel
class PlayerViewModel @Inject constructor(private val progressRepo: data.repository.VideoProgressRepository?) : ViewModel() {
    private val _uiState = MutableStateFlow<PlayerUiState>(PlayerUiState.Idle)
    val uiState: StateFlow<PlayerUiState> = _uiState
    private val _progressMs = MutableStateFlow<Long>(0L)
    val progressMs: StateFlow<Long> = _progressMs

    // repository injected via Hilt

    fun loadProgress(playbackId: String) {
        val repo = progressRepo ?: return
        viewModelScope.launch {
            val p = repo.getProgress(playbackId)
            _progressMs.value = p?.positionMs ?: 0L
        }
    }

    fun saveProgress(playbackId: String, mediaId: Int, mediaType: String, positionMs: Long, durationMs: Long) {
        val repo = progressRepo ?: return
        viewModelScope.launch {
            repo.upsert(VideoProgress(playbackId, mediaId, mediaType, positionMs, durationMs))
            _progressMs.value = positionMs
        }
    }

    fun play() { _uiState.value = PlayerUiState.Playing }
    fun pause() { _uiState.value = PlayerUiState.Paused }
    fun error(msg: String) { _uiState.value = PlayerUiState.Error(msg) }
}
