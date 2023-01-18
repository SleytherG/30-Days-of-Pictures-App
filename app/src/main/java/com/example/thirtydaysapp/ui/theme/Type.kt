package com.example.thirtydaysapp.ui.theme

import androidx.compose.material.Typography
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.sp
import com.example.thirtydaysapp.R

// Set of Material typography styles to start with

val Siracha: FontFamily = FontFamily(
 Font(R.font.sriracha_regular, FontWeight.Normal)
)

val Typography = Typography(
 body1 = TextStyle(
  fontFamily = Siracha,
  fontWeight = FontWeight.Normal,
  fontSize = 16.sp
 )
 /* Other default text styles to override
    button = TextStyle(
        fontFamily = FontFamily.Default,
        fontWeight = FontWeight.W500,
        fontSize = 14.sp
    ),
    caption = TextStyle(
        fontFamily = FontFamily.Default,
        fontWeight = FontWeight.Normal,
        fontSize = 12.sp
    )
    */
)