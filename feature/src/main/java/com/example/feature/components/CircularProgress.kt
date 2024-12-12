package com.example.feature.components

import androidx.compose.foundation.layout.size
import androidx.compose.material3.CircularProgressIndicator
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp

@Composable
fun CustomCircularProgress() {
    CircularProgressIndicator(
        modifier = Modifier.size(20.dp),
        color = Color.Companion.White,
        strokeWidth = 2.dp
    )
}