package com.project.data.room

import androidx.room.Entity
import androidx.room.PrimaryKey
import com.project.domain.model.BmiModel

@Entity(tableName = "bmi_table")
data class BmiEntity(
    @PrimaryKey(autoGenerate = true)
    val id: Int,
    val name: String,
    val year: Int,
    val month: Int,
    val date: Int,
    val weight: Double,
    val height: Double,
    val bmi: Double
)

fun entityToDomain(data: List<BmiEntity>): List<BmiModel> {
    return data.map {
        BmiModel(
            it.name,
            it.year,
            it.month,
            it.date,
            it.weight,
            it.height,
            it.bmi
        )
    }
}

fun entityToDomain(bmiEntity: BmiEntity): BmiModel {
    return BmiModel(
        bmiEntity.name,
        bmiEntity.year,
        bmiEntity.month,
        bmiEntity.date,
        bmiEntity.weight,
        bmiEntity.height,
        bmiEntity.bmi
    )
}

fun domainToEntity(bmiModel: BmiModel): BmiEntity {
    return BmiEntity(
        0,
        bmiModel.name,
        bmiModel.year,
        bmiModel.month,
        bmiModel.date,
        bmiModel.weight,
        bmiModel.height,
        bmiModel.bmi
    )
}