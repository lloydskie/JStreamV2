package com.jstreamv2.di;

import com.jstreamv2.data.remote.TmdbApiService;
import com.jstreamv2.domain.repository.PersonRepository;
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
public final class RepositoryModule_ProvidePersonRepositoryFactory implements Factory<PersonRepository> {
  private final Provider<TmdbApiService> apiProvider;

  private final Provider<String> authTokenProvider;

  public RepositoryModule_ProvidePersonRepositoryFactory(Provider<TmdbApiService> apiProvider,
      Provider<String> authTokenProvider) {
    this.apiProvider = apiProvider;
    this.authTokenProvider = authTokenProvider;
  }

  @Override
  public PersonRepository get() {
    return providePersonRepository(apiProvider.get(), authTokenProvider.get());
  }

  public static RepositoryModule_ProvidePersonRepositoryFactory create(
      Provider<TmdbApiService> apiProvider, Provider<String> authTokenProvider) {
    return new RepositoryModule_ProvidePersonRepositoryFactory(apiProvider, authTokenProvider);
  }

  public static PersonRepository providePersonRepository(TmdbApiService api, String authToken) {
    return Preconditions.checkNotNullFromProvides(RepositoryModule.INSTANCE.providePersonRepository(api, authToken));
  }
}
