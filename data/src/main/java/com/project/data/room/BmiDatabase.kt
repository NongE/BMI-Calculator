package com.project.data.room

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase

@Database(entities = [BmiEntity::class], version = 1)
abstract class BmiDatabase: RoomDatabase() {
    abstract fun bmiDao(): BmiDao
}