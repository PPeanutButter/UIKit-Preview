package com.wejoy.compose.theme

import androidx.compose.runtime.staticCompositionLocalOf
import androidx.compose.ui.text.PlatformTextStyle
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.unit.sp

data class Typography(
    val h1: TextStyle = TypographyTokens.H1,
    val h2: TextStyle = TypographyTokens.H2,
    val h3: TextStyle = TypographyTokens.H3,
    val h4: TextStyle = TypographyTokens.H4,
    val body1: TextStyle = TypographyTokens.Body1,
    val body2: TextStyle = TypographyTokens.Body2,
    val body3: TextStyle = TypographyTokens.Body3,
    val n1: TextStyle = TypographyTokens.N1,
    val n2: TextStyle = TypographyTokens.N2,
    val n3: TextStyle = TypographyTokens.N3,
    val n4: TextStyle = TypographyTokens.N4,
    val n5: TextStyle = TypographyTokens.N5,
    val n6: TextStyle = TypographyTokens.N6,
    val default: TextStyle = TypographyTokens.H4,
) {
    fun map(transform: TextStyle.(numeric: Boolean) -> TextStyle): Typography {
        return Typography(
            h1 = transform(h1, false),
            h2 = transform(h2, false),
            h3 = transform(h3, false),
            h4 = transform(h4, false),
            body1 = transform(body1, false),
            body2 = transform(body2, false),
            body3 = transform(body3, false),
            n1 = transform(n1, true),
            n2 = transform(n2, true),
            n3 = transform(n3, true),
            n4 = transform(n4, true),
            n5 = transform(n5, true),
            n6 = transform(n6, true),
            default = transform(default, false),
        )
    }
}

internal val DefaultTextStyle = TextStyle.Default

internal object TypographyTokens {
    val H1 = DefaultTextStyle.copy(
        fontSize = 28.sp,
        lineHeight = 37.sp,
    )
    val H2 = DefaultTextStyle.copy(
        fontSize = 20.sp,
        lineHeight = 27.sp,
    )
    val H3 = DefaultTextStyle.copy(
        fontSize = 18.sp,
        lineHeight = 24.sp,
    )
    val H4 = DefaultTextStyle.copy(
        fontSize = 16.sp,
        lineHeight = 22.sp,
    )
    val Body1 = DefaultTextStyle.copy(
        fontSize = 14.sp,
        lineHeight = 19.sp,
    )
    val Body2 = DefaultTextStyle.copy(
        fontSize = 12.sp,
        lineHeight = 16.sp,
    )
    val Body3 = DefaultTextStyle.copy(
        fontSize = 10.sp,
        lineHeight = 13.sp,
    )
    val N1 = DefaultTextStyle.copy(
        fontSize = 56.sp,
        lineHeight = 74.sp,
        //fontFamily = FontFamilyTokens.BananaPie, /*不同服有不同的字体要求，在业务层组件注入字体*/
    )
    val N2 = DefaultTextStyle.copy(
        fontSize = 30.sp,
        lineHeight = 40.sp,
        //fontFamily = FontFamilyTokens.BananaPie, /*不同服有不同的字体要求，在业务层组件注入字体*/
    )
    val N3 = DefaultTextStyle.copy(
        fontSize = 24.sp,
        lineHeight = 32.sp,
        //fontFamily = FontFamilyTokens.BananaPie, /*不同服有不同的字体要求，在业务层组件注入字体*/
    )
    val N4 = DefaultTextStyle.copy(
        fontSize = 18.sp,
        lineHeight = 24.sp,
        //fontFamily = FontFamilyTokens.BananaPie, /*不同服有不同的字体要求，在业务层组件注入字体*/
    )
    val N5 = DefaultTextStyle.copy(
        fontSize = 14.sp,
        lineHeight = 20.sp,
        //fontFamily = FontFamilyTokens.BananaPie, /*不同服有不同的字体要求，在业务层组件注入字体*/
    )
    val N6 = DefaultTextStyle.copy(
        fontSize = 12.sp,
        lineHeight = 16.sp,
        //fontFamily = FontFamilyTokens.BananaPie, /*不同服有不同的字体要求，在业务层组件注入字体*/
    )
}

val LocalTypography = staticCompositionLocalOf { Typography() } /*外部注入切入点*/