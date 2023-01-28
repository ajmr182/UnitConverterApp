package com.example.unitconverterapp.ui.components

import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.material.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.ui.text.style.TextAlign

@Composable
fun TopAppBarMenu(title:String) {
    TopAppBar(title = {
        Text(
            text = title,
            style = MaterialTheme.typography.h6,
            textAlign = TextAlign.Center
        )
    })
}