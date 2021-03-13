package com.example.androiddevchallenge.screens.components

import androidx.compose.material.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.res.painterResource
import com.example.androiddevchallenge.R

data class WelcomeRes(
    val background: Painter,
    val logo: Painter
)

@Composable
fun WelcomeResources(): WelcomeRes {
    val isLightMode = MaterialTheme.colors.isLight

    return WelcomeRes(
        background = painterResource(id = if (isLightMode) R.drawable.ic_light_welcome else R.drawable.ic_dark_welcome),
        logo = painterResource(id = if (isLightMode) R.drawable.ic_light_logo else R.drawable.ic_dark_logo)
    )
}