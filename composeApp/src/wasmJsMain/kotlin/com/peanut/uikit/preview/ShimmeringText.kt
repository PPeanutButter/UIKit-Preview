package com.peanut.uikit.preview

import androidx.compose.material3.LocalTextStyle
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableFloatStateOf
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.geometry.Size
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.LinearGradientShader
import androidx.compose.ui.graphics.Matrix
import androidx.compose.ui.graphics.Shader
import androidx.compose.ui.graphics.ShaderBrush
import androidx.compose.ui.graphics.TileMode
import androidx.compose.ui.platform.LocalDensity
import androidx.compose.ui.text.TextLayoutResult
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.style.TextDecoration
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.unit.TextUnit
import androidx.compose.ui.unit.dp
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import org.jetbrains.skia.BlendMode

@Composable
fun ShimmeringText(
    text: String,
    modifier: Modifier = Modifier,
    color: Color = Color.Black,
    fontSize: TextUnit = TextUnit.Unspecified,
    fontStyle: FontStyle? = null,
    fontWeight: FontWeight = FontWeight.Bold,
    fontFamily: FontFamily? = null,
    letterSpacing: TextUnit = TextUnit.Unspecified,
    textDecoration: TextDecoration? = null,
    textAlign: TextAlign? = null,
    lineHeight: TextUnit = TextUnit.Unspecified,
    overflow: TextOverflow = TextOverflow.Ellipsis,
    softWrap: Boolean = true,
    maxLines: Int = 1,
    minLines: Int = 1,
    onTextLayout: (TextLayoutResult) -> Unit = {},
    style: TextStyle = LocalTextStyle.current,
    colors: UserNameColorsConfig = UserNameColorsConfig(),
) {
    val flashWidth = with(LocalDensity.current) { 14.dp.toPx() }
    val flashSpeed = with(LocalDensity.current) { (1.3).dp.toPx() }
    val x1 = -flashWidth

    var offset by remember { mutableFloatStateOf(0f) }
    val scope = rememberCoroutineScope()
    LaunchedEffect(Unit, colors) {
        if (colors.blend.isEmpty() && !colors.forceAnim) return@LaunchedEffect
        if (offset > 0) return@LaunchedEffect
        scope.launch {
            while (true) {
                offset += flashSpeed
                delay(33)// 30fps & break point
            }
        }
    }

    val mulShader by remember(colors, color, offset) {
        mutableStateOf(object : ShaderBrush() {
            fun getBaseShader(size: Size, forceAnim: Boolean = false): Shader {
                return LinearGradientShader(
                    colors = colors.base.map { Color(it) }
                        .ifEmpty { listOf(colors.textColor?.let { Color(it) } ?: color, colors.textColor?.let { Color(it) } ?: color) },
                    from = Offset(0f, 0f),
                    to = if (forceAnim) Offset(flashWidth, flashWidth * 0.2f) else Offset(size.width, size.height),
                    tileMode = TileMode.Clamp
                )
            }

            val matrix = Matrix()
            var cacheShader: Shader? = null

            override fun createShader(size: Size): Shader {
                matrix.reset()
                matrix.translate(offset % (size.width + flashWidth), 0f)
                return cacheShader
                    ?: (if (colors.blend.isEmpty()) getBaseShader(size) else {
                        Shader.makeBlend(
                            BlendMode.SRC_OVER, // 使用混合模式
                            getBaseShader(size),
                            LinearGradientShader(
                                colors = colors.blend.map { Color(it) },
                                from = Offset(x1 + offset % (size.width + flashWidth), 0f),
                                to = Offset(x1 + flashWidth + offset % (size.width + flashWidth), flashWidth * 0.2f),
                                tileMode = TileMode.Clamp
                            ),
                        )
                    })
            }
        })
    }
    Text(
        text = text,
        modifier = modifier,
        color = color,
        fontSize = fontSize,
        fontStyle = fontStyle,
        fontWeight = fontWeight,
        fontFamily = fontFamily,
        letterSpacing = letterSpacing,
        textDecoration = textDecoration,
        textAlign = textAlign,
        lineHeight = lineHeight,
        overflow = overflow,
        softWrap = softWrap,
        maxLines = maxLines,
        minLines = minLines,
        onTextLayout = onTextLayout,
        style = style.copy(brush = mulShader),
    )
}

data class UserInfo(
    val uid: Int = -1,
    val nickName: String = "",
    val headUrl: String = "",
    val decorUrl: String = "",
    val vipLevel: Int = 0,
    val colors: UserNameColorsConfig = UserNameColorsConfig(),
) {
    companion object {
        val empty = UserInfo()
    }
}

data class UserNameColorsConfig(
    val base: List<Long> = emptyList(),//底层颜色
    val blend: List<Long> = emptyList(),//混合颜色
    val textColor: Long? = null,//文本颜色
    val forceAnim: Boolean = false,//是否强制动画,Android SDK N_MR1- 的GOLD级别需要移动base而不是blend
) {
    companion object {
        val COLOR_GOLD = UserNameColorsConfig(
            // 最炫酷的
            blend = listOf(0x00FFFFFF, 0xFFFFFF00, 0xFFFFFF00, 0xFFFFFF00, 0x00FFFFFF),
            base = listOf(0xFFFD023D, 0xFFFFAC00, 0xFFFF2E8D, 0xFF8F00FF),
        )
        val GOLD = UserNameColorsConfig(
            blend = listOf(0xFFC27B00, 0xFFD8A721, 0xFFFFF000, 0xFFFFF000, 0xFFFFF000, 0xFFD8A721, 0xFFC27B00),
            base = listOf(0xFFC27B00, 0xFFD8A721, 0xFFFFF000, 0xFFFFF000, 0xFFFFF000, 0xFFD8A721, 0xFFC27B00),//Android SDK N_MR1- 兼容
            forceAnim = true,//Android SDK N_MR1- 兼容
        )
        val GOLD_DARK = UserNameColorsConfig(
            blend = listOf(0xFFFFBB00, 0xFFFFFF00, 0xFFFFFF00, 0xFFFFFF00, 0xFFFFBB00),
            base = listOf(0xFFFFBB00, 0xFFFFFF00, 0xFFFFFF00, 0xFFFFFF00, 0xFFFFBB00),//Android SDK N_MR1- 兼容
            forceAnim = true,//Android SDK N_MR1- 兼容
        )
        val RED = UserNameColorsConfig(
            textColor = 0xFFF35524
        )
        val RED_ANIM = UserNameColorsConfig(//特定场景触发
            blend = listOf(0xFFFFFFFF, 0xFFFF9D9D, 0xFFFF9D9D, 0xFFFF9D9D, 0xFFFFFFFF),
            textColor = 0xFFF35524
        )
        val TEST = UserNameColorsConfig(
            blend = listOf(0x00FFFFFF, 0xFFFF00FF, 0x00FFFFFF),
            base = listOf(0xFFFF0000, 0xFF00FF00, 0xFF0000FF),
            textColor = 0xFFFFFF00,// YELLOW
        )
    }
}
