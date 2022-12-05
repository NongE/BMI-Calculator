package com.project.bmicalculator

import com.project.data.source.BmiDataSource
import com.project.data.source.BmiDataSourceImpl
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object DataSourceModule {

    @Singleton
    @Provides
    fun providesBmiDataSource(bmiDataSourceImpl: BmiDataSourceImpl): BmiDataSource {
        println("DataSourceModule Inject")
        return bmiDataSourceImpl
    }
}