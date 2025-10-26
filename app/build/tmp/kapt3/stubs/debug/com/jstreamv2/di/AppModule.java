package com.jstreamv2.di;

@dagger.Module
@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c7\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0007J\u0012\u0010\u0007\u001a\u00020\u00062\b\b\u0001\u0010\b\u001a\u00020\tH\u0007J\u0012\u0010\n\u001a\u00020\u000b2\b\b\u0001\u0010\b\u001a\u00020\tH\u0007J\u0010\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000fH\u0007J\u0018\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0011\u001a\u00020\u00042\u0006\u0010\u0012\u001a\u00020\u0013H\u0007J\u0010\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0005\u001a\u00020\u000bH\u0007J\u0010\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u0013H\u0007\u00a8\u0006\u0018"}, d2 = {"Lcom/jstreamv2/di/AppModule;", "", "()V", "provideAppDao", "Lcom/jstreamv2/data/local/AppDao;", "db", "Lcom/jstreamv2/data/local/AppDatabase;", "provideAppDatabase", "context", "Landroid/content/Context;", "provideCachedContentDatabase", "Ldata/local/CachedContentDatabase;", "provideGetRecommendationsUseCase", "Ldomain/usecase/GetRecommendationsUseCase;", "repo", "Ldata/repository/RecommendationsRepository;", "provideRecommendationsRepository", "appDao", "progressDao", "Ldata/local/VideoProgressDao;", "provideVideoProgressDao", "provideVideoProgressRepository", "Ldata/repository/VideoProgressRepository;", "dao", "app_debug"})
@dagger.hilt.InstallIn(value = {dagger.hilt.components.SingletonComponent.class})
public final class AppModule {
    @org.jetbrains.annotations.NotNull
    public static final com.jstreamv2.di.AppModule INSTANCE = null;
    
    private AppModule() {
        super();
    }
    
    @dagger.Provides
    @javax.inject.Singleton
    @org.jetbrains.annotations.NotNull
    public final data.local.CachedContentDatabase provideCachedContentDatabase(@dagger.hilt.android.qualifiers.ApplicationContext
    @org.jetbrains.annotations.NotNull
    android.content.Context context) {
        return null;
    }
    
    @dagger.Provides
    @javax.inject.Singleton
    @org.jetbrains.annotations.NotNull
    public final com.jstreamv2.data.local.AppDatabase provideAppDatabase(@dagger.hilt.android.qualifiers.ApplicationContext
    @org.jetbrains.annotations.NotNull
    android.content.Context context) {
        return null;
    }
    
    @dagger.Provides
    @org.jetbrains.annotations.NotNull
    public final com.jstreamv2.data.local.AppDao provideAppDao(@org.jetbrains.annotations.NotNull
    com.jstreamv2.data.local.AppDatabase db) {
        return null;
    }
    
    @dagger.Provides
    @org.jetbrains.annotations.NotNull
    public final data.local.VideoProgressDao provideVideoProgressDao(@org.jetbrains.annotations.NotNull
    data.local.CachedContentDatabase db) {
        return null;
    }
    
    @dagger.Provides
    @javax.inject.Singleton
    @org.jetbrains.annotations.NotNull
    public final data.repository.VideoProgressRepository provideVideoProgressRepository(@org.jetbrains.annotations.NotNull
    data.local.VideoProgressDao dao) {
        return null;
    }
    
    @dagger.Provides
    @javax.inject.Singleton
    @org.jetbrains.annotations.NotNull
    public final data.repository.RecommendationsRepository provideRecommendationsRepository(@org.jetbrains.annotations.NotNull
    com.jstreamv2.data.local.AppDao appDao, @org.jetbrains.annotations.NotNull
    data.local.VideoProgressDao progressDao) {
        return null;
    }
    
    @dagger.Provides
    @javax.inject.Singleton
    @org.jetbrains.annotations.NotNull
    public final domain.usecase.GetRecommendationsUseCase provideGetRecommendationsUseCase(@org.jetbrains.annotations.NotNull
    data.repository.RecommendationsRepository repo) {
        return null;
    }
}