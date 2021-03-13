package com.example.androiddevchallenge.utils

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.AccountCircle
import androidx.compose.material.icons.filled.PlayArrow
import androidx.compose.material.icons.filled.Spa
import androidx.compose.ui.graphics.vector.ImageVector

enum class BottomNavIcon(val title: String, val icon: ImageVector) {
    Home("Home", Icons.Filled.Spa),
    Profile("Profile", Icons.Filled.AccountCircle),
    Play("Play", Icons.Filled.PlayArrow),
}