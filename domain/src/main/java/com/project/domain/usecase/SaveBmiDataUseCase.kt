package com.project.domain.usecase

import com.project.domain.model.BmiModel
import com.project.domain.repository.BmiRepository
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch

class SaveBmiDataUseCase(private val bmiRepository: BmiRepository) {

    operator fun invoke(
        newBmiData: BmiModel,
        scope: CoroutineScope
    ) {
        scope.launch(Dispatchers.Main) {
            scope.launch(Dispatchers.IO) {
                bmiRepository.saveBmiData(newBmiData)
            }
        }
    }
}