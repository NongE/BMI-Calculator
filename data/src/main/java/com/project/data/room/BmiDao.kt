package com.project.data.room

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.Query

@Dao
interface BmiDao {

    @Query("SELECT * FROM bmi_table ORDER BY id DESC")
    fun getBmiData(): List<BmiEntity>

    @Insert
    fun saveBmiData(bmiEntity: BmiEntity)
}