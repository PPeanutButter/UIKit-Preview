package com.peanut.uikit.preview

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.interaction.MutableInteractionSource
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.RowScope
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonColors
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.ButtonElevation
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedButton
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Shape
import androidx.compose.ui.graphics.SolidColor
import com.wejoy.compose.theme.WePlayTheme

object WPButtonDefaults {
    /**
     * 兼容iOS
     * iOS实现时没有边距，导致同样宽度的按钮Android提前换行
     * 如果在wrapContent时需要左右padding，可以覆盖此设置，这里更多的是提供能力。
     */
    val ContentPadding = PaddingValues()

    @Composable
    fun primaryButtonColors() = ButtonDefaults.buttonColors(
        containerColor = WePlayTheme.colorScheme.colorBrandDefault,
        contentColor = Color.White,
        disabledContainerColor = WePlayTheme.colorScheme.colorBrandDisabled,
        disabledContentColor = Color.White,
    )

    @Composable
    fun grayButtonColors() = ButtonDefaults.buttonColors(
        containerColor = WePlayTheme.colorScheme.colorGrayBtn,
        contentColor = WePlayTheme.colorScheme.colorTextSecondary,
        disabledContainerColor = WePlayTheme.colorScheme.colorGrayBtn,
        disabledContentColor = WePlayTheme.colorScheme.colorTextDisabled,
    )

    @Composable
    fun primaryOutlinedButtonColors() = ButtonDefaults.outlinedButtonColors(
        containerColor = MaterialTheme.colorScheme.background,
        contentColor = WePlayTheme.colorScheme.colorBrandDefault,
        disabledContainerColor = MaterialTheme.colorScheme.background,
        disabledContentColor = WePlayTheme.colorScheme.colorBrandDisabled,
    )

    @Composable
    fun grayOutlinedButtonColors() = ButtonDefaults.outlinedButtonColors(
        containerColor = MaterialTheme.colorScheme.background,
        contentColor = WePlayTheme.colorScheme.colorTextSecondary,
        disabledContainerColor = MaterialTheme.colorScheme.background,
        disabledContentColor = WePlayTheme.colorScheme.colorTextDisabled,
    )

    @Composable
    fun outlinedButtonBorder(color: Color) = ButtonDefaults.outlinedButtonBorder.copy(
        brush = SolidColor(color)
    )
}

@Composable
fun WPButton(
    onClick: () -> Unit,
    modifier: Modifier = Modifier,
    enabled: Boolean = true,
    shape: Shape = ButtonDefaults.shape,
    colors: ButtonColors = WPButtonDefaults.primaryButtonColors(),
    elevation: ButtonElevation? = null,
    border: BorderStroke? = null,
    contentPadding: PaddingValues = WPButtonDefaults.ContentPadding,
    interactionSource: MutableInteractionSource = remember { MutableInteractionSource() },
    content: @Composable RowScope.() -> Unit
) {
    Button(
        onClick = onClick,
        modifier = modifier,
        enabled = enabled,
        shape = shape,
        colors = colors,
        elevation = elevation,
        border = border,
        contentPadding = contentPadding,
        interactionSource = interactionSource,
        content = content
    )
}

@Composable
fun WPOutlinedButton(
    onClick: () -> Unit,
    modifier: Modifier = Modifier,
    enabled: Boolean = true,
    shape: Shape = ButtonDefaults.outlinedShape,
    colors: ButtonColors = WPButtonDefaults.primaryOutlinedButtonColors(),
    elevation: ButtonElevation? = null,
    border: BorderStroke? = WPButtonDefaults.outlinedButtonBorder(WePlayTheme.colorScheme.colorBrandDefault),
    contentPadding: PaddingValues = WPButtonDefaults.ContentPadding,
    interactionSource: MutableInteractionSource = remember { MutableInteractionSource() },
    content: @Composable RowScope.() -> Unit
) {
    OutlinedButton(
        onClick = onClick,
        modifier = modifier,
        enabled = enabled,
        shape = shape,
        colors = colors,
        elevation = elevation,
        border = border,
        contentPadding = contentPadding,
        interactionSource = interactionSource,
        content = content,
    )
}