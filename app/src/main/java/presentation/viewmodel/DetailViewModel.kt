package presentation.viewmodel

import androidx.lifecycle.ViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.update
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch

sealed class DetailUiState {
    object Loading : DetailUiState()
    data class Success(val details: Any) : DetailUiState()
    data class Error(val message: String) : DetailUiState()
}

class DetailViewModel : ViewModel() {
    private val _uiState = MutableStateFlow<DetailUiState>(DetailUiState.Loading)
    val uiState: StateFlow<DetailUiState> = _uiState

    fun loadDetails(id: Int, type: String) {
        CoroutineScope(Dispatchers.IO).launch {
            try {
                // TODO: Fetch details
                _uiState.update { DetailUiState.Success(Any()) }
            } catch (e: Exception) {
                _uiState.update { DetailUiState.Error(e.message ?: "Unknown error") }
            }
        }
    }
}
