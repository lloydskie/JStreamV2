package com.jstreamv2.di;

import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.annotation.processing.Generated;

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
public final class NetworkModule_ProvideTmdbAuthTokenFactory implements Factory<String> {
  @Override
  public String get() {
    return provideTmdbAuthToken();
  }

  public static NetworkModule_ProvideTmdbAuthTokenFactory create() {
    return InstanceHolder.INSTANCE;
  }

  public static String provideTmdbAuthToken() {
    return Preconditions.checkNotNullFromProvides(NetworkModule.INSTANCE.provideTmdbAuthToken());
  }

  private static final class InstanceHolder {
    private static final NetworkModule_ProvideTmdbAuthTokenFactory INSTANCE = new NetworkModule_ProvideTmdbAuthTokenFactory();
  }
}
