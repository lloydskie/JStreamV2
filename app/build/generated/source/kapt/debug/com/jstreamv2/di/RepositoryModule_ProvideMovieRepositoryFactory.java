package com.jstreamv2.di;

import com.jstreamv2.data.local.AppDao;
import com.jstreamv2.data.remote.TmdbApiService;
import com.jstreamv2.domain.repository.MovieRepository;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.annotation.processing.Generated;
import javax.inject.Provider;

@ScopeMetadata("javax.inject.Singleton")
@QualifierMetadata("javax.inject.Named")
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
public final class RepositoryModule_ProvideMovieRepositoryFactory implements Factory<MovieRepository> {
  private final Provider<TmdbApiService> apiProvider;

  private final Provider<AppDao> daoProvider;

  private final Provider<String> authTokenProvider;

  public RepositoryModule_ProvideMovieRepositoryFactory(Provider<TmdbApiService> apiProvider,
      Provider<AppDao> daoProvider, Provider<String> authTokenProvider) {
    this.apiProvider = apiProvider;
    this.daoProvider = daoProvider;
    this.authTokenProvider = authTokenProvider;
  }

  @Override
  public MovieRepository get() {
    return provideMovieRepository(apiProvider.get(), daoProvider.get(), authTokenProvider.get());
  }

  public static RepositoryModule_ProvideMovieRepositoryFactory create(
      Provider<TmdbApiService> apiProvider, Provider<AppDao> daoProvider,
      Provider<String> authTokenProvider) {
    return new RepositoryModule_ProvideMovieRepositoryFactory(apiProvider, daoProvider, authTokenProvider);
  }

  public static MovieRepository provideMovieRepository(TmdbApiService api, AppDao dao,
      String authToken) {
    return Preconditions.checkNotNullFromProvides(RepositoryModule.INSTANCE.provideMovieRepository(api, dao, authToken));
  }
}
