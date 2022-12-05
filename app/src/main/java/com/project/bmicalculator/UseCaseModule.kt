package com.project.bmicalculator

import com.project.domain.repository.BmiRepository
import com.project.domain.usecase.GetBmiDataUseCase
import com.project.domain.usecase.GetLatestBmiDataUseCase
import com.project.domain.usecase.SaveBmiDataUseCase
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ViewModelComponent

@Module
@InstallIn(ViewModelComponent::class)
object UseCaseModule {

    @Provides
    fun providesGetBmiDataUseCase(bmiRepository: BmiRepository): GetBmiDataUseCase{
        println("GetBmiDataUseCase Inject")
        return GetBmiDataUseCase(bmiRepository)
    }

    @Provides
    fun providesGetLatestBmiDataUseCase(bmiRepository: BmiRepository): GetLatestBmiDataUseCase{
        println("GetLatestBmiDataUseCase Inject")
        return GetLatestBmiDataUseCase(bmiRepository)
    }

    @Provides
    fun providesSaveBmiDataUseCase(bmiRepository: BmiRepository): SaveBmiDataUseCase{
        println("SaveBmiDataUseCase Inject")
        return SaveBmiDataUseCase(bmiRepository)
    }
}