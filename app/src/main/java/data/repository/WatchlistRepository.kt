
package data.repository

import com.jstreamv2.domain.model.Movie
import com.jstreamv2.domain.model.WatchlistItem

class WatchlistRepository {
    private val watchlist = mutableListOf<WatchlistItem>()

    fun getWatchlist(): List<WatchlistItem> = watchlist

    fun addToWatchlist(movie: Movie) {
        watchlist.add(WatchlistItem(movie.id, movie))
    }

    fun removeFromWatchlist(movieId: Int) {
        watchlist.removeAll { it.id == movieId }
    }
}
