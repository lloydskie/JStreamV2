package com.jstreamv2.di

import android.content.Context
import androidx.room.Room
import com.jstreamv2.data.local.AppDao
import com.jstreamv2.data.local.AppDatabase as LocalAppDatabase
import data.local.CachedContentDatabase
import data.local.VideoProgressDao
import data.repository.RecommendationsRepository
import data.repository.VideoProgressRepository
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.qualifiers.ApplicationContext
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object AppModule {
    @Provides
    @Singleton
    fun provideCachedContentDatabase(@ApplicationContext context: Context): CachedContentDatabase {
        return CachedContentDatabase.getInstance(context)
    }

    @Provides
    @Singleton
    fun provideAppDatabase(@ApplicationContext context: Context): LocalAppDatabase {
        return Room.databaseBuilder(context, LocalAppDatabase::class.java, "app_main.db").build()
    }

    @Provides
    fun provideAppDao(db: LocalAppDatabase): AppDao = db.appDao()

    @Provides
    fun provideVideoProgressDao(db: CachedContentDatabase): VideoProgressDao = db.videoProgressDao()

    @Provides
    @Singleton
    fun provideVideoProgressRepository(dao: VideoProgressDao): VideoProgressRepository = VideoProgressRepository(dao)

    // RecommendationsRepository requires AppDao from the other DB implementation; leave wiring to be implemented
    @Provides
    @Singleton
    fun provideRecommendationsRepository(appDao: AppDao, progressDao: VideoProgressDao): RecommendationsRepository = RecommendationsRepository(appDao, progressDao)

    @Provides
    @Singleton
    fun provideGetRecommendationsUseCase(repo: RecommendationsRepository): domain.usecase.GetRecommendationsUseCase = domain.usecase.GetRecommendationsUseCase(repo)
}
