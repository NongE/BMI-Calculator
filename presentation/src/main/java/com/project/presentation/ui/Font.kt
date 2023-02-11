package com.project.presentation.ui

import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import com.project.presentation.R

object Font {
    val spoqaHanSansNeo = FontFamily(
        Font(R.font.spoqahansansneo_light, FontWeight.Light, FontStyle.Normal),
        Font(R.font.spoqahansansneo_bold, FontWeight.Bold, FontStyle.Normal),
        Font(R.font.spoqahansansneo_medium, FontWeight.Medium, FontStyle.Normal),
        Font(R.font.spoqahansansneo_regular, FontWeight.Normal, FontStyle.Normal),
        Font(R.font.spoqahansansneo_thin, FontWeight.Thin, FontStyle.Normal),
    )
}