package com.example.unitconverterapp.ui.components

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import com.example.unitconverterapp.R

@Preview
@Composable
fun MainMenu() {
    Column(Modifier.fillMaxSize()) {
     CardForMenu(image = painterResource(id = R.drawable.ic_temperature2), title = "Temperature" )
    }
}