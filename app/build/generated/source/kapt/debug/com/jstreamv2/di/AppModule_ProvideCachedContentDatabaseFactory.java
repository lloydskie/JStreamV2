package com.jstreamv2.di;

import android.content.Context;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import data.local.CachedContentDatabase;
import javax.annotation.processing.Generated;
import javax.inject.Provider;

@ScopeMetadata("javax.inject.Singleton")
@QualifierMetadata("dagger.hilt.android.qualifiers.ApplicationContext")
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
public final class AppModule_ProvideCachedContentDatabaseFactory implements Factory<CachedContentDatabase> {
  private final Provider<Context> contextProvider;

  public AppModule_ProvideCachedContentDatabaseFactory(Provider<Context> contextProvider) {
    this.contextProvider = contextProvider;
  }

  @Override
  public CachedContentDatabase get() {
    return provideCachedContentDatabase(contextProvider.get());
  }

  public static AppModule_ProvideCachedContentDatabaseFactory create(
      Provider<Context> contextProvider) {
    return new AppModule_ProvideCachedContentDatabaseFactory(contextProvider);
  }

  public static CachedContentDatabase provideCachedContentDatabase(Context context) {
    return Preconditions.checkNotNullFromProvides(AppModule.INSTANCE.provideCachedContentDatabase(context));
  }
}
