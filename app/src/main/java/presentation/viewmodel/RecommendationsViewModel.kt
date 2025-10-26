package presentation.viewmodel

import androidx.lifecycle.ViewModel
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import domain.usecase.GetRecommendationsUseCase

sealed class RecommendationsUiState {
    object Loading : RecommendationsUiState()
    data class Success(val items: List<Any>) : RecommendationsUiState()
    data class Error(val message: String) : RecommendationsUiState()
}

@HiltViewModel
class RecommendationsViewModel @Inject constructor(private val useCase: GetRecommendationsUseCase) : ViewModel() {
    private val _uiState = MutableStateFlow<RecommendationsUiState>(RecommendationsUiState.Loading)
    val uiState: StateFlow<RecommendationsUiState> = _uiState

    fun load() {
        CoroutineScope(Dispatchers.IO).launch {
            try {
                val items = useCase()
                _uiState.value = RecommendationsUiState.Success(items)
            } catch (e: Exception) {
                _uiState.value = RecommendationsUiState.Error(e.message ?: "Error")
            }
        }
    }
}
