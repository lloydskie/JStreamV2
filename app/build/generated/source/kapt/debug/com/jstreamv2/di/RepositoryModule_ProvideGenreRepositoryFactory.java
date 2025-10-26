package com.jstreamv2.di;

import com.jstreamv2.data.remote.TmdbApiService;
import com.jstreamv2.domain.repository.GenreRepository;
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
public final class RepositoryModule_ProvideGenreRepositoryFactory implements Factory<GenreRepository> {
  private final Provider<TmdbApiService> apiProvider;

  private final Provider<String> authTokenProvider;

  public RepositoryModule_ProvideGenreRepositoryFactory(Provider<TmdbApiService> apiProvider,
      Provider<String> authTokenProvider) {
    this.apiProvider = apiProvider;
    this.authTokenProvider = authTokenProvider;
  }

  @Override
  public GenreRepository get() {
    return provideGenreRepository(apiProvider.get(), authTokenProvider.get());
  }

  public static RepositoryModule_ProvideGenreRepositoryFactory create(
      Provider<TmdbApiService> apiProvider, Provider<String> authTokenProvider) {
    return new RepositoryModule_ProvideGenreRepositoryFactory(apiProvider, authTokenProvider);
  }

  public static GenreRepository provideGenreRepository(TmdbApiService api, String authToken) {
    return Preconditions.checkNotNullFromProvides(RepositoryModule.INSTANCE.provideGenreRepository(api, authToken));
  }
}
