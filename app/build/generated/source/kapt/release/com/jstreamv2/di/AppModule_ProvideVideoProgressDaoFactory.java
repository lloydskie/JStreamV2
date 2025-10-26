package com.jstreamv2.di;

import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import data.local.CachedContentDatabase;
import data.local.VideoProgressDao;
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
public final class AppModule_ProvideVideoProgressDaoFactory implements Factory<VideoProgressDao> {
  private final Provider<CachedContentDatabase> dbProvider;

  public AppModule_ProvideVideoProgressDaoFactory(Provider<CachedContentDatabase> dbProvider) {
    this.dbProvider = dbProvider;
  }

  @Override
  public VideoProgressDao get() {
    return provideVideoProgressDao(dbProvider.get());
  }

  public static AppModule_ProvideVideoProgressDaoFactory create(
      Provider<CachedContentDatabase> dbProvider) {
    return new AppModule_ProvideVideoProgressDaoFactory(dbProvider);
  }

  public static VideoProgressDao provideVideoProgressDao(CachedContentDatabase db) {
    return Preconditions.checkNotNullFromProvides(AppModule.INSTANCE.provideVideoProgressDao(db));
  }
}
