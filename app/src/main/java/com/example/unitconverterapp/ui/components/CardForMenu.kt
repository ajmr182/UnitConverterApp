package com.example.unitconverterapp.ui.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Card
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import com.example.unitconverterapp.ui.theme.CardColor

@Composable
fun CardForMenu(image: Painter, title: String) {
    Card(shape = RoundedCornerShape(4.dp), elevation = 4.dp, backgroundColor = CardColor, modifier = Modifier.clickable {

    }) {
        Column(
            Modifier
                .padding(4.dp)
        ) {
            Image(painter = image, contentDescription = "", Modifier.size(150.dp))

            Box {
                Text(text = title, modifier = Modifier.width(150.dp), textAlign = TextAlign.Center)
            }
        }
    }
}