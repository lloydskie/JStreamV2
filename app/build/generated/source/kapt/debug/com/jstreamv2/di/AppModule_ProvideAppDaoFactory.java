package com.jstreamv2.di;

import com.jstreamv2.data.local.AppDao;
import com.jstreamv2.data.local.AppDatabase;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
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
public final class AppModule_ProvideAppDaoFactory implements Factory<AppDao> {
  private final Provider<AppDatabase> dbProvider;

  public AppModule_ProvideAppDaoFactory(Provider<AppDatabase> dbProvider) {
    this.dbProvider = dbProvider;
  }

  @Override
  public AppDao get() {
    return provideAppDao(dbProvider.get());
  }

  public static AppModule_ProvideAppDaoFactory create(Provider<AppDatabase> dbProvider) {
    return new AppModule_ProvideAppDaoFactory(dbProvider);
  }

  public static AppDao provideAppDao(AppDatabase db) {
    return Preconditions.checkNotNullFromProvides(AppModule.INSTANCE.provideAppDao(db));
  }
}
