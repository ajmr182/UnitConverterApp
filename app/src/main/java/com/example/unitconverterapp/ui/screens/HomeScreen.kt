package com.example.unitconverterapp.ui.screens

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.stringResource
import com.example.unitconverterapp.R
import com.example.unitconverterapp.ui.components.MainMenu
import com.example.unitconverterapp.ui.components.TopAppBarMenu

@Composable
fun HomeScreen() {
    Column(Modifier.fillMaxSize()) {
        TopAppBarMenu(title = stringResource(id = R.string.tv_home_name))
        Column(
            modifier = Modifier
                .background(color = Color.White)
                .fillMaxSize()
        ) {
            MainMenu()
        }
    }
}