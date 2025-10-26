package presentation.viewmodel

import androidx.lifecycle.ViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.update
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import kotlinx.coroutines.withTimeout

sealed class HomeUiState {
    object Loading : HomeUiState()
    data class Success(val data: List<Any>) : HomeUiState()
    data class Error(val message: String) : HomeUiState()
}

class HomeViewModel : ViewModel() {
    private val _uiState = MutableStateFlow<HomeUiState>(HomeUiState.Loading)
    val uiState: StateFlow<HomeUiState> = _uiState

    fun loadHomeData(retryCount: Int = 3) {
        CoroutineScope(Dispatchers.IO).launch {
            var attempts = 0
            while (attempts < retryCount) {
                try {
                    withTimeout(8000) {
                        // TODO: Fetch home data
                        _uiState.update { HomeUiState.Success(emptyList()) }
                    }
                    return@launch
                } catch (e: Exception) {
                    attempts++
                    if (attempts >= retryCount) {
                        val message = when {
                            e is java.net.SocketTimeoutException -> "Request timed out. Please try again."
                            e is java.net.UnknownHostException -> "No internet connection."
                            e.message?.contains("429") == true -> "Rate limit exceeded. Please wait."
                            else -> "Something went wrong. Please try again."
                        }
                        _uiState.update { HomeUiState.Error(message) }
                    }
                }
            }
        }
    }
}
