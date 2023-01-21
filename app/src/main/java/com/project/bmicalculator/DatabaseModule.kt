package com.project.bmicalculator

import android.content.Context
import androidx.room.Room
import com.project.data.room.BmiDao
import com.project.data.room.BmiDatabase
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.qualifiers.ApplicationContext
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton


@Module
@InstallIn(SingletonComponent::class)
object DatabaseModule {

    @Singleton
    @Provides
    fun provideDatabase(@ApplicationContext context: Context): BmiDatabase {
        return Room.databaseBuilder(
            context,
            BmiDatabase::class.java,
            "bmi_database"
        ).build()
    }

    @Singleton
    @Provides
    fun provideInterestingDao(bmiDatabase: BmiDatabase): BmiDao {
        return bmiDatabase.bmiDao()
    }
}