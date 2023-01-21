package com.project.presentation.viewmodel

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.project.domain.model.BmiModel
import com.project.domain.usecase.GetLatestBmiDataUseCase
import com.project.domain.usecase.SaveBmiDataUseCase
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class BmiViewModel @Inject constructor(
    private val getLatestBmiDataUseCase: GetLatestBmiDataUseCase,
    private val saveBmiDataUseCase: SaveBmiDataUseCase
) : ViewModel() {
    private val _bmiLatestData = MutableLiveData<BmiModel>()

    val bmiLatestData: MutableLiveData<BmiModel> = _bmiLatestData

}