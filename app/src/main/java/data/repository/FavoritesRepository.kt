
package data.repository

import com.jstreamv2.domain.model.Movie
import com.jstreamv2.domain.model.Favorite

class FavoritesRepository {
    private val favorites = mutableListOf<Favorite>()

    fun getFavorites(): List<Favorite> = favorites

    fun addFavorite(movie: Movie) {
        favorites.add(Favorite(movie.id, movie))
    }

    fun removeFavorite(movieId: Int) {
        favorites.removeAll { it.id == movieId }
    }
}
