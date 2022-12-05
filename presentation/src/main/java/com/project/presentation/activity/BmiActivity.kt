package com.project.presentation.activity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.lifecycle.ViewModelProvider
import com.project.presentation.databinding.ActivityBmiBinding
import com.project.presentation.viewmodel.BmiViewModel
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class BmiActivity : AppCompatActivity() {

    private lateinit var binding: ActivityBmiBinding

    private val bmiViewModel: BmiViewModel by lazy {
        ViewModelProvider(this)[BmiViewModel::class.java]
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityBmiBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }
}