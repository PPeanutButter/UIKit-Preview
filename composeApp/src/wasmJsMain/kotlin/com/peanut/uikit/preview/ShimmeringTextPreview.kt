package com.peanut.uikit.preview

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun ShimmeringTextPreview() {
    Column(horizontalAlignment = Alignment.CenterHorizontally, verticalArrangement = Arrangement.spacedBy(8.dp), modifier = Modifier.padding(vertical = 12.dp)) {
        var colors: UserNameColorsConfig by remember { mutableStateOf(UserNameColorsConfig.COLOR_GOLD) }
        Box(modifier = Modifier.size(400.dp, 100.dp).background(MaterialTheme.colorScheme.background, shape = RoundedCornerShape(20.dp))) {
            ShimmeringText("Hello World!", modifier = Modifier.align(Alignment.Center), fontSize = 40.sp, colors = colors)
        }
        Row(horizontalArrangement = Arrangement.spacedBy(8.dp)) {
            Button(onClick = { colors = UserNameColorsConfig.COLOR_GOLD }) {
                Text("COLOR_GOLD")
            }
            Button(onClick = { colors = UserNameColorsConfig.GOLD }) {
                Text("GOLD")
            }
            Button(onClick = { colors = UserNameColorsConfig.RED }) {
                Text("RED")
            }
            Button(onClick = { colors = UserNameColorsConfig.TEST }) {
                Text("RGB")
            }
        }
    }
}