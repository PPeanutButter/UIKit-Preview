package com.peanut.uikit.preview

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.width
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import com.wejoy.compose.theme.WePlayTheme

@Composable
fun ButtonsPreview() {
    MaterialTheme(
        colorScheme = MaterialTheme.colorScheme.copy(background = Color.White),
    ) {
        Column(verticalArrangement = Arrangement.spacedBy(2.dp), modifier = Modifier.width(400.dp)) {
            Row(horizontalArrangement = Arrangement.spacedBy(2.dp)) {
                WPButton(
                    onClick = {}, modifier = Modifier
                        .weight(1f)
                        .height(48.dp)
                ) {
                    Text("WPButton", style = WePlayTheme.typography.h4, fontWeight = FontWeight.Bold)
                }
                WPButton(
                    onClick = {}, modifier = Modifier
                        .weight(1f)
                        .height(48.dp), enabled = false
                ) {
                    Text("WPButton", style = WePlayTheme.typography.h4, fontWeight = FontWeight.Bold)
                }
            }
            Row(horizontalArrangement = Arrangement.spacedBy(2.dp)) {
                WPOutlinedButton(
                    onClick = {}, modifier = Modifier
                        .weight(1f)
                        .height(48.dp)
                ) {
                    Text("WPOutlinedButton", style = WePlayTheme.typography.h4, fontWeight = FontWeight.Bold)
                }
                WPOutlinedButton(
                    onClick = {}, modifier = Modifier
                        .weight(1f)
                        .height(48.dp), enabled = false
                ) {
                    Text("WPOutlinedButton", style = WePlayTheme.typography.h4, fontWeight = FontWeight.Bold)
                }
            }
            Row(horizontalArrangement = Arrangement.spacedBy(2.dp)) {
                WPButton(
                    onClick = {}, modifier = Modifier
                        .weight(1f)
                        .height(48.dp),
                    colors = WPButtonDefaults.grayButtonColors()
                ) {
                    Text("WPButton", style = WePlayTheme.typography.h4, fontWeight = FontWeight.Bold)
                }
                WPButton(
                    onClick = {}, modifier = Modifier
                        .weight(1f)
                        .height(48.dp), enabled = false, colors = WPButtonDefaults.grayButtonColors()
                ) {
                    Text("WPButton", style = WePlayTheme.typography.h4, fontWeight = FontWeight.Bold)
                }
            }
            Row(horizontalArrangement = Arrangement.spacedBy(2.dp)) {
                WPOutlinedButton(
                    onClick = {},
                    modifier = Modifier
                        .weight(1f)
                        .height(48.dp),
                    colors = WPButtonDefaults.grayOutlinedButtonColors(),
                    border = WPButtonDefaults.outlinedButtonBorder(WePlayTheme.colorScheme.colorGrayBorder),
                ) {
                    Text("WPOutlinedButton", style = WePlayTheme.typography.h4, fontWeight = FontWeight.Bold)
                }
                WPOutlinedButton(
                    onClick = {},
                    modifier = Modifier
                        .weight(1f)
                        .height(48.dp),
                    enabled = false,
                    colors = WPButtonDefaults.grayOutlinedButtonColors(),
                    border = WPButtonDefaults.outlinedButtonBorder(WePlayTheme.colorScheme.colorGrayBorder),
                ) {
                    Text("WPOutlinedButton", style = WePlayTheme.typography.h4, fontWeight = FontWeight.Bold)
                }
            }
        }
    }
}