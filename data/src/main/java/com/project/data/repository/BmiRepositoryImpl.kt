package com.project.data.repository

import com.project.data.room.domainToEntity
import com.project.data.room.entityToDomain
import com.project.data.source.BmiDataSource
import com.project.domain.model.BmiModel
import com.project.domain.repository.BmiRepository
import javax.inject.Inject

class BmiRepositoryImpl @Inject constructor(
    private val bmiDataSource: BmiDataSource
) : BmiRepository {

    override suspend fun getBmiData(): List<BmiModel> = entityToDomain(bmiDataSource.getBmi())

    override suspend fun getLatestBmiData(): BmiModel = entityToDomain(bmiDataSource.getBmi()[0])

    override suspend fun saveBmiData(bmiModel: BmiModel) = bmiDataSource.saveBmi(domainToEntity(bmiModel))
}