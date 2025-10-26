package presentation.viewmodel;

import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import data.repository.FavoritesRepository;
import data.repository.WatchlistRepository;
import javax.annotation.processing.Generated;
import javax.inject.Provider;

@ScopeMetadata
@QualifierMetadata
@DaggerGenerated
@Generated(
    value = "dagger.internal.codegen.ComponentProcessor",
    comments = "https://dagger.dev"
)
@SuppressWarnings({
    "unchecked",
    "rawtypes",
    "KotlinInternal",
    "KotlinInternalInJava"
})
public final class MyListViewModel_Factory implements Factory<MyListViewModel> {
  private final Provider<FavoritesRepository> favoritesRepoProvider;

  private final Provider<WatchlistRepository> watchlistRepoProvider;

  public MyListViewModel_Factory(Provider<FavoritesRepository> favoritesRepoProvider,
      Provider<WatchlistRepository> watchlistRepoProvider) {
    this.favoritesRepoProvider = favoritesRepoProvider;
    this.watchlistRepoProvider = watchlistRepoProvider;
  }

  @Override
  public MyListViewModel get() {
    return newInstance(favoritesRepoProvider.get(), watchlistRepoProvider.get());
  }

  public static MyListViewModel_Factory create(Provider<FavoritesRepository> favoritesRepoProvider,
      Provider<WatchlistRepository> watchlistRepoProvider) {
    return new MyListViewModel_Factory(favoritesRepoProvider, watchlistRepoProvider);
  }

  public static MyListViewModel newInstance(FavoritesRepository favoritesRepo,
      WatchlistRepository watchlistRepo) {
    return new MyListViewModel(favoritesRepo, watchlistRepo);
  }
}
