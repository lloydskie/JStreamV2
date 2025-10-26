package data.repository;

import com.jstreamv2.domain.model.Movie;
import com.jstreamv2.domain.model.Favorite;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u000e\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tJ\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00050\u000bJ\u000e\u0010\f\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\u000eR\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u000f"}, d2 = {"Ldata/repository/FavoritesRepository;", "", "()V", "favorites", "", "Lcom/jstreamv2/domain/model/Favorite;", "addFavorite", "", "movie", "Lcom/jstreamv2/domain/model/Movie;", "getFavorites", "", "removeFavorite", "movieId", "", "app_release"})
public final class FavoritesRepository {
    @org.jetbrains.annotations.NotNull
    private final java.util.List<com.jstreamv2.domain.model.Favorite> favorites = null;
    
    public FavoritesRepository() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.util.List<com.jstreamv2.domain.model.Favorite> getFavorites() {
        return null;
    }
    
    public final void addFavorite(@org.jetbrains.annotations.NotNull
    com.jstreamv2.domain.model.Movie movie) {
    }
    
    public final void removeFavorite(int movieId) {
    }
}