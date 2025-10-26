package com.jstreamv2.di

import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

import com.jstreamv2.domain.repository.*
import com.jstreamv2.data.repository.*
import com.jstreamv2.data.remote.TmdbApiService
import com.jstreamv2.data.local.AppDao

@Module
@InstallIn(SingletonComponent::class)
object RepositoryModule {
    @Provides
    @Singleton
    fun provideMovieRepository(
        api: TmdbApiService,
        dao: AppDao,
        @javax.inject.Named("tmdb_auth_token") authToken: String
    ): MovieRepository = MovieRepositoryImpl(api, dao, authToken)

    @Provides
    @Singleton
    fun providePersonRepository(
        api: TmdbApiService,
        @javax.inject.Named("tmdb_auth_token") authToken: String
    ): PersonRepository = PersonRepositoryImpl(api, authToken)

    @Provides
    @Singleton
    fun provideGenreRepository(
        api: TmdbApiService,
        @javax.inject.Named("tmdb_auth_token") authToken: String
    ): GenreRepository = GenreRepositoryImpl(api, authToken)
}
