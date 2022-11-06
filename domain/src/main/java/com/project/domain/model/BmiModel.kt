package com.project.domain.model

data class BmiModel(
    val name: String,
    val year: Int,
    val month: Int,
    val date: Int,
    val weight: Double,
    val height: Double,
    val bmi: Double
)