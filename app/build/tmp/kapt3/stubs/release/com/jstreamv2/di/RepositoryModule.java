package com.jstreamv2.di;

import dagger.Module;
import dagger.Provides;
import dagger.hilt.InstallIn;
import dagger.hilt.components.SingletonComponent;
import javax.inject.Singleton;
import com.jstreamv2.domain.repository.*;
import com.jstreamv2.data.repository.*;
import com.jstreamv2.data.remote.TmdbApiService;
import com.jstreamv2.data.local.AppDao;

@dagger.Module
@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u00c7\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u001a\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\b\b\u0001\u0010\u0007\u001a\u00020\bH\u0007J\"\u0010\t\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\f2\b\b\u0001\u0010\u0007\u001a\u00020\bH\u0007J\u001a\u0010\r\u001a\u00020\u000e2\u0006\u0010\u0005\u001a\u00020\u00062\b\b\u0001\u0010\u0007\u001a\u00020\bH\u0007\u00a8\u0006\u000f"}, d2 = {"Lcom/jstreamv2/di/RepositoryModule;", "", "()V", "provideGenreRepository", "Lcom/jstreamv2/domain/repository/GenreRepository;", "api", "Lcom/jstreamv2/data/remote/TmdbApiService;", "authToken", "", "provideMovieRepository", "Lcom/jstreamv2/domain/repository/MovieRepository;", "dao", "Lcom/jstreamv2/data/local/AppDao;", "providePersonRepository", "Lcom/jstreamv2/domain/repository/PersonRepository;", "app_release"})
@dagger.hilt.InstallIn(value = {dagger.hilt.components.SingletonComponent.class})
public final class RepositoryModule {
    @org.jetbrains.annotations.NotNull
    public static final com.jstreamv2.di.RepositoryModule INSTANCE = null;
    
    private RepositoryModule() {
        super();
    }
    
    @dagger.Provides
    @javax.inject.Singleton
    @org.jetbrains.annotations.NotNull
    public final com.jstreamv2.domain.repository.MovieRepository provideMovieRepository(@org.jetbrains.annotations.NotNull
    com.jstreamv2.data.remote.TmdbApiService api, @org.jetbrains.annotations.NotNull
    com.jstreamv2.data.local.AppDao dao, @javax.inject.Named(value = "tmdb_auth_token")
    @org.jetbrains.annotations.NotNull
    java.lang.String authToken) {
        return null;
    }
    
    @dagger.Provides
    @javax.inject.Singleton
    @org.jetbrains.annotations.NotNull
    public final com.jstreamv2.domain.repository.PersonRepository providePersonRepository(@org.jetbrains.annotations.NotNull
    com.jstreamv2.data.remote.TmdbApiService api, @javax.inject.Named(value = "tmdb_auth_token")
    @org.jetbrains.annotations.NotNull
    java.lang.String authToken) {
        return null;
    }
    
    @dagger.Provides
    @javax.inject.Singleton
    @org.jetbrains.annotations.NotNull
    public final com.jstreamv2.domain.repository.GenreRepository provideGenreRepository(@org.jetbrains.annotations.NotNull
    com.jstreamv2.data.remote.TmdbApiService api, @javax.inject.Named(value = "tmdb_auth_token")
    @org.jetbrains.annotations.NotNull
    java.lang.String authToken) {
        return null;
    }
}