package com.jstreamv2.di;

import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import data.local.VideoProgressDao;
import data.repository.VideoProgressRepository;
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
public final class AppModule_ProvideVideoProgressRepositoryFactory implements Factory<VideoProgressRepository> {
  private final Provider<VideoProgressDao> daoProvider;

  public AppModule_ProvideVideoProgressRepositoryFactory(Provider<VideoProgressDao> daoProvider) {
    this.daoProvider = daoProvider;
  }

  @Override
  public VideoProgressRepository get() {
    return provideVideoProgressRepository(daoProvider.get());
  }

  public static AppModule_ProvideVideoProgressRepositoryFactory create(
      Provider<VideoProgressDao> daoProvider) {
    return new AppModule_ProvideVideoProgressRepositoryFactory(daoProvider);
  }

  public static VideoProgressRepository provideVideoProgressRepository(VideoProgressDao dao) {
    return Preconditions.checkNotNullFromProvides(AppModule.INSTANCE.provideVideoProgressRepository(dao));
  }
}
