package com.wejoy.compose.theme

import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Shapes
import androidx.compose.runtime.Composable
import androidx.compose.runtime.ReadOnlyComposable

@Composable
fun WePlayTheme(
    colorScheme: androidx.compose.material3.ColorScheme = MaterialTheme.colorScheme, /*需要各区服配置*/
    shapes: Shapes = MaterialTheme.shapes,
    typography: androidx.compose.material3.Typography, /*需要各区服重写MaterialTheme.typography里面的bodyLarge*/
    content: @Composable () -> Unit
) {
    MaterialTheme(colorScheme = colorScheme, shapes = shapes, typography = typography, content = content)
}

object WePlayTheme {
    /**
     * Retrieves the current [ColorScheme] at the call site's position in the hierarchy.
     * Usage: `WePlayTheme.colorScheme.colorBrandActive`
     */
    val colorScheme: ColorScheme
        @Composable
        @ReadOnlyComposable
        get() = LocalColorScheme.current

    /**
     * Retrieves the current [Typography] at the call site's position in the hierarchy.
     * Usage: `WePlayTheme.typography.h1`
     */
    val typography: Typography
        @Composable
        @ReadOnlyComposable
        get() = LocalTypography.current

}