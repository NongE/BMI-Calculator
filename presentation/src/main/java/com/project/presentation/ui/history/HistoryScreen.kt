package com.project.presentation.ui.history

import android.widget.Toast
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.interaction.MutableInteractionSource
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Card
import androidx.compose.material.Text
import androidx.compose.material.ripple.rememberRipple
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.project.presentation.ui.Font

@Composable
fun HistoryLazyColumn() {
    val localContext = LocalContext.current

    LazyColumn(
        modifier = Modifier
            .fillMaxWidth()
            .background(Color(0xFFF4F4F4)),
        contentPadding = PaddingValues(16.dp),
        verticalArrangement = Arrangement.spacedBy(8.dp)
    ) {
        item {
            Text(
                modifier = Modifier.padding(4.dp),
                fontSize = 12.sp,
                color = Color.Gray,
                fontFamily = Font.spoqaHanSansNeo,
                fontWeight = FontWeight.Bold,
                text = "기록"
            )
        }

        items(30) { index ->
            HistoryItem(index) {
                Toast.makeText(
                    localContext,
                    "Hello Lazy $index",
                    Toast.LENGTH_SHORT
                ).show()
            }
        }
    }
}

@Composable
fun HistoryItem(
    index: Int,
    onClickCallback: (Int) -> Unit
) {
    val interactionSource = remember { MutableInteractionSource() }

    Card(
        modifier = Modifier
            .fillMaxWidth(),
        shape = RoundedCornerShape(8.dp),
        elevation = 0.dp,
    ) {
        Box(
            modifier = Modifier
                .clickable(
                    indication = rememberRipple(bounded = true),
                    interactionSource = interactionSource
                ) { onClickCallback(index) }
        ) {
            Column(
                modifier = Modifier
                    .padding(16.dp),
                verticalArrangement = Arrangement.Center,
            ) {
                Text(
                    fontSize = 10.sp,
                    color = Color.Gray,
                    fontFamily = Font.spoqaHanSansNeo,
                    text = "2023.$index.$index. (화)"
                )

                Spacer(modifier = Modifier.height(5.dp))

                Text(
                    fontSize = 18.sp,
                    fontFamily = Font.spoqaHanSansNeo,
                    text = "${10 + index} BMI"
                )

                Spacer(modifier = Modifier.height(5.dp))

                Text(
                    fontSize = 10.sp,
                    color = Color.Gray,
                    fontFamily = Font.spoqaHanSansNeo,
                    text = "180cm • 70kg • 24세 • 남"
                )
            }
        }
    }
}