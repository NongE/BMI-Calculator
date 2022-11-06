package com.project.domain.repository

import com.project.domain.model.BmiModel

interface BmiRepository {
    suspend fun getBmiData(): List<BmiModel>
    suspend fun getLatestBmiData(): BmiModel
    suspend fun saveBmiData(bmiModel: BmiModel)
}