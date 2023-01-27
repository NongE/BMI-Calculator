package com.project.presentation.activity

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.ViewModelProvider
import androidx.viewpager2.widget.ViewPager2
import com.project.presentation.R
import com.project.presentation.databinding.ActivityMainBinding
import com.project.presentation.fragment.MyPageFragment
import com.project.presentation.fragment.MainFragment
import com.project.presentation.fragment.ViewPagerAdapter
import com.project.presentation.viewmodel.BmiViewModel
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    private val mainViewModel: BmiViewModel by lazy {
        ViewModelProvider(this)[BmiViewModel::class.java]
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.viewPager.adapter = ViewPagerAdapter(supportFragmentManager, lifecycle)
        binding.viewPager.isUserInputEnabled = false

        binding.viewPager.registerOnPageChangeCallback(
            object : ViewPager2.OnPageChangeCallback() {
                override fun onPageSelected(position: Int) {
                    super.onPageSelected(position)
                    binding.bottomMenu.menu.getItem(position).isChecked = true
                }
            }
        )

        binding.bottomMenu.setOnItemSelectedListener {
            when(it.itemId){
                R.id.main -> {
                    binding.viewPager.currentItem = 0
                    true
                }
                else -> {
                    binding.viewPager.currentItem = 1
                    true
                }
            }
        }
    }
}