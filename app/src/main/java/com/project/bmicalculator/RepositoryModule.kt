package com.project.bmicalculator

import com.project.data.repository.BmiRepositoryImpl
import com.project.domain.repository.BmiRepository
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object RepositoryModule {

    @Singleton
    @Provides
    fun providesRepository(bmiRepositoryImpl: BmiRepositoryImpl): BmiRepository {
        println("RepositoryModule Inject")
        return bmiRepositoryImpl
    }
}