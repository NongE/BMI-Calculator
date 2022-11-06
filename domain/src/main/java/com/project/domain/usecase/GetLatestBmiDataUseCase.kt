package com.project.domain.usecase

import com.project.domain.model.BmiModel
import com.project.domain.repository.BmiRepository
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.async
import kotlinx.coroutines.launch

class GetLatestBmiDataUseCase(private val bmiRepository: BmiRepository) {

    operator fun invoke(
        scope: CoroutineScope,
        onResult: (BmiModel) -> Unit = {}
    ) {
        scope.launch(Dispatchers.Main) {
            val getLatestBmiDataJob = scope.async(Dispatchers.IO) {
                bmiRepository.getLatestBmiData()
            }
            onResult(getLatestBmiDataJob.await())
        }
    }
}