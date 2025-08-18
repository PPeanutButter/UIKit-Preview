package com.peanut.uikit.preview

import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import kotlinx.browser.window

@Composable
fun App() {
    MaterialTheme {
        Surface(modifier = Modifier.fillMaxSize(), color = Color(0xfffefefe)) {
            when (window.location.hash) {
                "#ShimmeringText" -> ShimmeringTextPreview()
                "#WPButtons" -> ButtonsPreview()
                else -> {
                    Text("404 Pages Not Found")
                }
            }
        }
    }
}