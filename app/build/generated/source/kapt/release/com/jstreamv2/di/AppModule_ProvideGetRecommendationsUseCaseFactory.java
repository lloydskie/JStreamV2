package com.jstreamv2.di;

import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import data.repository.RecommendationsRepository;
import domain.usecase.GetRecommendationsUseCase;
import javax.annotation.processing.Generated;
import javax.inject.Provider;

@ScopeMetadata("javax.inject.Singleton")
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
public final class AppModule_ProvideGetRecommendationsUseCaseFactory implements Factory<GetRecommendationsUseCase> {
  private final Provider<RecommendationsRepository> repoProvider;

  public AppModule_ProvideGetRecommendationsUseCaseFactory(
      Provider<RecommendationsRepository> repoProvider) {
    this.repoProvider = repoProvider;
  }

  @Override
  public GetRecommendationsUseCase get() {
    return provideGetRecommendationsUseCase(repoProvider.get());
  }

  public static AppModule_ProvideGetRecommendationsUseCaseFactory create(
      Provider<RecommendationsRepository> repoProvider) {
    return new AppModule_ProvideGetRecommendationsUseCaseFactory(repoProvider);
  }

  public static GetRecommendationsUseCase provideGetRecommendationsUseCase(
      RecommendationsRepository repo) {
    return Preconditions.checkNotNullFromProvides(AppModule.INSTANCE.provideGetRecommendationsUseCase(repo));
  }
}
