package com.jstreamv2.di;

import com.jstreamv2.data.local.AppDao;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import data.local.VideoProgressDao;
import data.repository.RecommendationsRepository;
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
public final class AppModule_ProvideRecommendationsRepositoryFactory implements Factory<RecommendationsRepository> {
  private final Provider<AppDao> appDaoProvider;

  private final Provider<VideoProgressDao> progressDaoProvider;

  public AppModule_ProvideRecommendationsRepositoryFactory(Provider<AppDao> appDaoProvider,
      Provider<VideoProgressDao> progressDaoProvider) {
    this.appDaoProvider = appDaoProvider;
    this.progressDaoProvider = progressDaoProvider;
  }

  @Override
  public RecommendationsRepository get() {
    return provideRecommendationsRepository(appDaoProvider.get(), progressDaoProvider.get());
  }

  public static AppModule_ProvideRecommendationsRepositoryFactory create(
      Provider<AppDao> appDaoProvider, Provider<VideoProgressDao> progressDaoProvider) {
    return new AppModule_ProvideRecommendationsRepositoryFactory(appDaoProvider, progressDaoProvider);
  }

  public static RecommendationsRepository provideRecommendationsRepository(AppDao appDao,
      VideoProgressDao progressDao) {
    return Preconditions.checkNotNullFromProvides(AppModule.INSTANCE.provideRecommendationsRepository(appDao, progressDao));
  }
}
