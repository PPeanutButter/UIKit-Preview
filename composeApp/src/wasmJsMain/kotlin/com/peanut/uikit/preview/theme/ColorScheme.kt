package com.wejoy.compose.theme

import androidx.compose.runtime.staticCompositionLocalOf
import androidx.compose.ui.graphics.Color

data class ColorScheme(
    val colorBrandActive: Color = WePlayColorSchemaTokens.colorBrandActive,
    val colorBrandBg: Color = WePlayColorSchemaTokens.colorBrandBg,
    val colorBrandBorder: Color = WePlayColorSchemaTokens.colorBrandBorder,
    val colorBrandDefault: Color = WePlayColorSchemaTokens.colorBrandDefault,
    val colorBrandDisabled: Color = WePlayColorSchemaTokens.colorBrandDisabled,
    val colorVipActive: Color = WePlayColorSchemaTokens.colorVipActive,
    val colorVipBg: Color = WePlayColorSchemaTokens.colorVipBg,
    val colorVipBorder: Color = WePlayColorSchemaTokens.colorVipBorder,
    val colorVipDefault: Color = WePlayColorSchemaTokens.colorVipDefault,
    val colorVipDisabled: Color = WePlayColorSchemaTokens.colorVipDisabled,
    val colorYellowActive: Color = WePlayColorSchemaTokens.colorYellowActive,
    val colorYellowBg: Color = WePlayColorSchemaTokens.colorYellowBg,
    val colorYellowBorder: Color = WePlayColorSchemaTokens.colorYellowBorder,
    val colorYellowDefault: Color = WePlayColorSchemaTokens.colorYellowDefault,
    val colorYellowDisabled: Color = WePlayColorSchemaTokens.colorYellowDisabled,
    val colorPinkActive: Color = WePlayColorSchemaTokens.colorPinkActive,
    val colorPinkBg: Color = WePlayColorSchemaTokens.colorPinkBg,
    val colorPinkBorder: Color = WePlayColorSchemaTokens.colorPinkBorder,
    val colorPinkDefault: Color = WePlayColorSchemaTokens.colorPinkDefault,
    val colorPinkDisabled: Color = WePlayColorSchemaTokens.colorPinkDisabled,
    val colorWarningActive: Color = WePlayColorSchemaTokens.colorWarningActive,
    val colorWarningBg: Color = WePlayColorSchemaTokens.colorWarningBg,
    val colorWarningBorder: Color = WePlayColorSchemaTokens.colorWarningBorder,
    val colorWarningDefault: Color = WePlayColorSchemaTokens.colorWarningDefault,
    val colorWarningDisabled: Color = WePlayColorSchemaTokens.colorWarningDisabled,
    val colorTextPrimary: Color = WePlayColorSchemaTokens.colorTextPrimary,
    val colorTextSecondary: Color = WePlayColorSchemaTokens.colorTextSecondary,
    val colorTextTertiary: Color = WePlayColorSchemaTokens.colorTextTertiary,
    val colorTextDefault: Color = WePlayColorSchemaTokens.colorTextDefault,
    val colorTextDisabled: Color = WePlayColorSchemaTokens.colorTextDisabled,
    val colorGrayActive: Color = WePlayColorSchemaTokens.colorGrayActive,
    val colorGrayBg: Color = WePlayColorSchemaTokens.colorGrayBg,
    val colorGrayBorder: Color = WePlayColorSchemaTokens.colorGrayBorder,
    val colorGrayBtn: Color = WePlayColorSchemaTokens.colorGrayBtn,
    val colorGrayIconPrimary: Color = WePlayColorSchemaTokens.colorGrayIconPrimary,
    val colorGrayIconSecondary: Color = WePlayColorSchemaTokens.colorGrayIconSecondary,
    val colorGrayIconTertiary: Color = WePlayColorSchemaTokens.colorGrayIconTertiary,
    val colorGrayLine: Color = WePlayColorSchemaTokens.colorGrayLine,
    val colorOpacityBlack10: Color = WePlayColorSchemaTokens.colorOpacityBlack10,
    val colorOpacityBlack20: Color = WePlayColorSchemaTokens.colorOpacityBlack20,
    val colorOpacityBlack50: Color = WePlayColorSchemaTokens.colorOpacityBlack50,
    val colorOpacityBlack70: Color = WePlayColorSchemaTokens.colorOpacityBlack70,
    val colorOpacityWhite10: Color = WePlayColorSchemaTokens.colorOpacityWhite10,
    val colorOpacityWhite20: Color = WePlayColorSchemaTokens.colorOpacityWhite20,
    val colorOpacityWhite50: Color = WePlayColorSchemaTokens.colorOpacityWhite50,
    val colorOpacityWhite70: Color = WePlayColorSchemaTokens.colorOpacityWhite70,
    val colorTextBtnActive: Color = WePlayColorSchemaTokens.colorTextBtnActive,
    val colorTextBtnBg: Color = WePlayColorSchemaTokens.colorTextBtnBg,
    val colorTextBtnDefault: Color = WePlayColorSchemaTokens.colorTextBtnDefault,
    val colorTextBtnDisabled: Color = WePlayColorSchemaTokens.colorTextBtnDisabled,
    val colorTextBtnHover: Color = WePlayColorSchemaTokens.colorTextBtnHover,
)

internal object WePlayColorSchemaTokens {
    /**
     * def for [主题色](https://www.figma.com/design/Suhu6wdDoBbniuoPsQZDRM/%E2%9D%96-WePlay%E7%BB%84%E4%BB%B6%E5%BA%93?node-id=3885-21235&m=dev)
     */
    val colorBrandActive = Color(0xFF00A7D0)
    val colorBrandBg = Color(0xFFEAFCFE)
    val colorBrandBorder = Color(0xFF6EE6FB)
    val colorBrandDefault = Color(0xFF00CCF9)
    val colorBrandDisabled = Color(0xFFA3F2FF)

    /**
     * def for [功能色](https://www.figma.com/design/Suhu6wdDoBbniuoPsQZDRM/%E2%9D%96-WePlay%E7%BB%84%E4%BB%B6%E5%BA%93?node-id=3885-21198&m=dev)
     */
    val colorVipActive = Color(0xFFF9CE60)
    val colorVipBg = Color(0xFFFFFCE8)
    val colorVipBorder = Color(0xFFF8EBBC)
    val colorVipDefault = Color(0xFFF3D892)
    val colorVipDisabled = Color(0xFFFAF0C5)

    val colorYellowActive = Color(0xFFD27D2E)
    val colorYellowBg = Color(0xFFFFF8E8)
    val colorYellowBorder = Color(0xFFFFD392)
    val colorYellowDefault = Color(0xFFFFA94A)
    val colorYellowDisabled = Color(0xFFFFDEA9)

    val colorPinkActive = Color(0xFFD23E60)
    val colorPinkBg = Color(0xFFFFF5F5)
    val colorPinkBorder = Color(0xFFFEA2AF)
    val colorPinkDefault = Color(0xFFFE6484)
    val colorPinkDisabled = Color(0xFFFFC1C8)

    val colorWarningActive = Color(0xFFD22B31)
    val colorWarningBg = Color(0xFFFFECE8)
    val colorWarningBorder = Color(0xFFFFBCB5)
    val colorWarningDefault = Color(0xFFFF4646)
    val colorWarningDisabled = Color(0xFFFFB0A7)

    /**
     * def for [文字色](https://www.figma.com/design/Suhu6wdDoBbniuoPsQZDRM/%E2%9D%96-WePlay%E7%BB%84%E4%BB%B6%E5%BA%93?node-id=3885-21199&m=dev)
     */
    val colorTextPrimary = Color(0xFF1B1D38)
    val colorTextSecondary = Color(0xFF68697A)
    val colorTextTertiary = Color(0xFF999CB4)
    val colorTextDefault = Color(0xFFBABBC2)
    val colorTextDisabled = Color(0xFFCCCDD6)

    /**
     * def for [中性色](https://www.figma.com/design/Suhu6wdDoBbniuoPsQZDRM/%E2%9D%96-WePlay%E7%BB%84%E4%BB%B6%E5%BA%93?node-id=3885-21218&m=dev)
     */
    val colorGrayActive = Color(0xFFECEDEF)
    val colorGrayBg = Color(0xFFFAFAFA)
    val colorGrayBorder = Color(0xFFECEDEF)
    val colorGrayBtn = Color(0xFFF7F8FA)
    val colorGrayIconPrimary = Color(0xFF282D45)
    val colorGrayIconSecondary = Color(0xFF999CB4)
    val colorGrayIconTertiary = Color(0xFFE6E7EC)
    val colorGrayLine = Color(0xFFF3F3F3)

    val colorOpacityBlack10 = Color(0x1A000000)
    val colorOpacityBlack20 = Color(0x33000000)
    val colorOpacityBlack50 = Color(0x80000000)
    val colorOpacityBlack70 = Color(0xB2000000)
    val colorOpacityWhite10 = Color(0x1AFFFFFF)
    val colorOpacityWhite20 = Color(0x33FFFFFF)
    val colorOpacityWhite50 = Color(0x80FFFFFF)
    val colorOpacityWhite70 = Color(0xB2FFFFFF)

    /**
     * def for [文字按钮色](https://www.figma.com/design/Suhu6wdDoBbniuoPsQZDRM/%E2%9D%96-WePlay%E7%BB%84%E4%BB%B6%E5%BA%93?node-id=3885-21200&m=dev)
     */
    val colorTextBtnActive = Color(0xFF394E83)
    val colorTextBtnBg = Color(0xFFE8F3FF)
    val colorTextBtnDefault = Color(0xFF576B95)
    val colorTextBtnDisabled = Color(0xFFA6B9D5)
    val colorTextBtnHover = Color(0xFF6E83AA)
}


val LocalColorScheme = staticCompositionLocalOf { ColorScheme() }