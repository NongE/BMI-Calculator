package com.project.domain.usecase

import com.project.domain.model.BmiModel
import com.project.domain.repository.BmiRepository
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.async
import kotlinx.coroutines.launch

class GetBmiDataUseCase(private val bmiRepository: BmiRepository) {

    operator fun invoke(
        scope: CoroutineScope,
        onResult: (List<BmiModel>) -> Unit = {}
    ) {
        scope.launch(Dispatchers.Main) {
            val getBmiDataJob = scope.async(Dispatchers.IO) {
                bmiRepository.getBmiData()
            }
            onResult(getBmiDataJob.await())
        }
    }
}