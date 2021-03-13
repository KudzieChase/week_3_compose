package com.example.androiddevchallenge.screens.components

import androidx.compose.material.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.res.painterResource
import com.example.androiddevchallenge.R

data class LoginRes(
    val background: Painter
)

@Composable
fun LoginResources(): LoginRes {
    val isLightMode = MaterialTheme.colors.isLight

    return LoginRes(
        background = painterResource(id = if (isLightMode) R.drawable.ic_light_login else R.drawable.ic_dark_login)
    )
}