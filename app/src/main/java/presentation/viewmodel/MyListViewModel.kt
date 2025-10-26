package presentation.viewmodel

import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject
import data.repository.FavoritesRepository
import data.repository.WatchlistRepository

import androidx.lifecycle.ViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.update
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch

sealed class MyListUiState {
    object Loading : MyListUiState()
    data class Success(val favorites: List<Any>, val watchlist: List<Any>) : MyListUiState()
    data class Error(val message: String) : MyListUiState()
}

@HiltViewModel
class MyListViewModel @Inject constructor(
    private val favoritesRepo: FavoritesRepository,
    private val watchlistRepo: WatchlistRepository
) : ViewModel() {
    private val _uiState = MutableStateFlow<MyListUiState>(MyListUiState.Loading)
    val uiState: StateFlow<MyListUiState> = _uiState

    fun loadMyList() {
        CoroutineScope(Dispatchers.IO).launch {
            try {
                // TODO: Fetch favorites and watchlist
                _uiState.update { MyListUiState.Success(emptyList(), emptyList()) }
            } catch (e: Exception) {
                _uiState.update { MyListUiState.Error(e.message ?: "Unknown error") }
            }
        }
    }
}
