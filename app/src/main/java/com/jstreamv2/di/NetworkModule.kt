package com.jstreamv2.di

import com.jstreamv2.data.remote.TmdbApiService
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import javax.inject.Singleton
import javax.inject.Named

@Module
@InstallIn(SingletonComponent::class)
object NetworkModule {
    @Provides
    @Singleton
    fun provideRetrofit(): Retrofit =
        Retrofit.Builder()
            .baseUrl("https://api.themoviedb.org/3/")
            .addConverterFactory(GsonConverterFactory.create())
            .build()

    @Provides
    @Singleton
    fun provideTmdbApiService(retrofit: Retrofit): TmdbApiService =
        retrofit.create(TmdbApiService::class.java)

    @Provides
    @Singleton
    @Named("tmdb_auth_token")
    fun provideTmdbAuthToken(): String = "Bearer eyJhbGciOiJIUzI1NiJ9.eyJhdWQiOiI0OTc4NzEyOGRhOTRiMzU4NWIyMWRhYzVjNGE5MmZjYyIsIm5iZiI6MTc1NjQ0MjAwNi4zMjksInN1YiI6IjY4YjEyZDk2NmZkMmM0MTFiNjM5NmQ3MCIsInNjb3BlcyI6WyJhcGlfcmVhZCJdLCJ2ZXJzaW9uIjoxfQ.MEjHIvjbtHuzHUTpnwyCK6gbNKB0xY4IpSL21OEVJSI"
}
