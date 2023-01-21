package com.project.data.source

import android.content.Context
import com.project.data.room.BmiDao
import com.project.data.room.BmiDatabase
import com.project.data.room.BmiEntity
import dagger.hilt.android.qualifiers.ApplicationContext
import javax.inject.Inject

interface BmiDataSource {
    suspend fun getBmi(): List<BmiEntity>
    suspend fun getLatestBmi(): BmiEntity
    suspend fun saveBmi(bmiEntity: BmiEntity)
}

class BmiDataSourceImpl @Inject constructor(
    private val bmiDao: BmiDao
) : BmiDataSource {

    override suspend fun getBmi(): List<BmiEntity> = bmiDao.getBmiData()

    override suspend fun getLatestBmi(): BmiEntity = bmiDao.getBmiData()[0]

    override suspend fun saveBmi(bmiEntity: BmiEntity) = bmiDao.saveBmiData(bmiEntity)
}