package com.project.data.room

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase

@Database(entities = [BmiEntity::class], version = 1)
abstract class BmiDatabase: RoomDatabase() {

    companion object {
        @Volatile
        private var instance: BmiDatabase? = null
        fun getDatabase(context: Context): BmiDatabase {
            if (instance == null) {
                synchronized(this) {
                    instance = Room.databaseBuilder(
                        context, BmiDatabase::class.java, "bmi_database").build()
                }
            }
            return instance!!
        }
    }

    abstract fun bmiDao(): BmiDao
}