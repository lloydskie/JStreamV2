package presentation.viewmodel

import androidx.lifecycle.ViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.update
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch

sealed class PersonUiState {
    object Loading : PersonUiState()
    data class Success(val details: Any) : PersonUiState()
    data class Error(val message: String) : PersonUiState()
}

class PersonViewModel : ViewModel() {
    private val _uiState = MutableStateFlow<PersonUiState>(PersonUiState.Loading)
    val uiState: StateFlow<PersonUiState> = _uiState

    fun loadPerson(id: Int) {
        CoroutineScope(Dispatchers.IO).launch {
            try {
                // TODO: Fetch person details
                _uiState.update { PersonUiState.Success(Any()) }
            } catch (e: Exception) {
                _uiState.update { PersonUiState.Error(e.message ?: "Unknown error") }
            }
        }
    }
}
