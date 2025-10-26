package presentation.viewmodel

import androidx.lifecycle.ViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.update
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch

sealed class GenreUiState {
    object Loading : GenreUiState()
    data class Success(val genres: List<Any>) : GenreUiState()
    data class Error(val message: String) : GenreUiState()
}

class GenreViewModel : ViewModel() {
    private val _uiState = MutableStateFlow<GenreUiState>(GenreUiState.Loading)
    val uiState: StateFlow<GenreUiState> = _uiState

    fun loadGenres() {
        CoroutineScope(Dispatchers.IO).launch {
            try {
                // TODO: Fetch genres
                _uiState.update { GenreUiState.Success(emptyList()) }
            } catch (e: Exception) {
                _uiState.update { GenreUiState.Error(e.message ?: "Unknown error") }
            }
        }
    }
}
