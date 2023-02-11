package com.project.presentation.ui.home

import android.annotation.SuppressLint
import android.widget.Toast
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Button
import androidx.compose.material.ButtonDefaults
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.ExperimentalComposeUiApi
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.constraintlayout.compose.ConstraintLayout
import com.project.presentation.ui.Font.spoqaHanSansNeo

@Composable
fun HelloMessage() {
    Box(
        modifier = Modifier
            .fillMaxWidth()
            .fillMaxHeight(0.3f),
        contentAlignment = Alignment.BottomStart
    ) {
        Column(
            modifier = Modifier
                .padding(35.dp, 0.dp, 0.dp, 0.dp)
        ) {
            Text(
                fontSize = 24.sp,
                fontFamily = spoqaHanSansNeo,
                fontWeight = FontWeight.Bold,
                text = "홍길동님,"
            )

            Spacer(modifier = Modifier.height(10.dp))

            Text(
                fontSize = 24.sp,
                fontFamily = spoqaHanSansNeo,
                fontWeight = FontWeight.Bold,
                text = "좋은 아침이에요!"
            )
        }
    }
}

@Composable
fun LastBmiInformation() {
    Column(
        modifier = Modifier
            .fillMaxWidth(),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        Text(
            textAlign = TextAlign.Center,
            fontSize = 42.sp,
            fontFamily = spoqaHanSansNeo,
            fontWeight = FontWeight.Bold,
            text = "23.4"
        )

        Text(
            textAlign = TextAlign.Center,
            fontSize = 14.sp,
            color = Color.Gray,
            fontFamily = spoqaHanSansNeo,
            text = "180cm • 70kg • 26세"
        )

        Spacer(modifier = Modifier.height(10.dp))

        Text(
            textAlign = TextAlign.Center,
            fontSize = 14.sp,
            fontWeight = FontWeight.Bold,
            fontFamily = spoqaHanSansNeo,
            color = Color(0xFF17B450),
            text = "정상"
        )
    }
}

@Composable
fun RoundGrayButton(
    buttonText: String,
    onClickCallback: () -> Unit
) {
    Column(
        modifier = Modifier
            .fillMaxWidth(),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        Button(
            modifier = Modifier
                .fillMaxWidth(0.5f),
            colors = ButtonDefaults.buttonColors(backgroundColor = Color(0xFFD9D9D9)),
            shape = RoundedCornerShape(18.dp),
            onClick = {
                onClickCallback()
            },
        ) {
            Text(
                fontSize = 14.sp,
                fontFamily = spoqaHanSansNeo,
                fontWeight = FontWeight.Normal,
                text = buttonText
            )
        }
    }
}