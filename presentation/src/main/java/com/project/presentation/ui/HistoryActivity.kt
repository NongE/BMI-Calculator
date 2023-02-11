package com.project.presentation.ui

import android.annotation.SuppressLint
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.*
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import com.project.presentation.ui.history.HistoryLazyColumn
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class HistoryActivity : ComponentActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContent {
            val scaffoldState = rememberScaffoldState()

            HistoryScreenCompose(scaffoldState) {
                HistoryLazyColumn()
            }
        }
    }

    @Composable
    @SuppressLint("UnusedMaterialScaffoldPaddingParameter")
    fun HistoryScreenCompose(scaffoldState: ScaffoldState, composeContent: @Composable () -> Unit) {
        Scaffold(
            scaffoldState = scaffoldState,
            topBar = {
                TopAppBar(
                    title = { },
                    navigationIcon = {
                        IconButton(onClick = { finish() }) {
                            Icon(
                                imageVector = Icons.Default.ArrowBack,
                                contentDescription = "back",
                            )
                        }
                    },
                    backgroundColor = Color(0xFFF4F4F4),
                    elevation = 0.dp
                )
            },
        ) {
            composeContent()
        }
    }
}