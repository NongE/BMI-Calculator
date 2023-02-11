package com.project.presentation.ui

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import android.widget.Toast
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import com.project.presentation.ui.home.HelloMessage
import com.project.presentation.ui.home.LastBmiInformation
import com.project.presentation.ui.home.RoundGrayButton
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class MainActivity : ComponentActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContent {
            val scaffoldState = rememberScaffoldState()

            HomeScreenCompose(scaffoldState) {
                Column(
                    modifier = Modifier
                        .fillMaxSize()
                        .background(Color(0xFFF4F4F4))
                ) {
                    HelloMessage()

                    Spacer(modifier = Modifier.height(100.dp))

                    LastBmiInformation()

                    Spacer(modifier = Modifier.height(150.dp))

                    RoundGrayButton(
                        buttonText = "기록 추가하기",
                        onClickCallback = {
                            Toast.makeText(this@MainActivity, "This is 기록 추가하기", Toast.LENGTH_SHORT)
                                .show()
                        }
                    )

                    RoundGrayButton(
                        buttonText = "과거 기록 보러가기",
                        onClickCallback = {
                            startActivity(Intent(this@MainActivity, HistoryActivity::class.java))
                        }
                    )
                }
            }
        }
    }

    @Composable
    @SuppressLint("UnusedMaterialScaffoldPaddingParameter")
    fun HomeScreenCompose(scaffoldState: ScaffoldState, composeContent: @Composable () -> Unit) {
        Scaffold(
            scaffoldState = scaffoldState
        ) {
            composeContent()
        }
    }
}