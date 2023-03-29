package com.victor.ecommerceapp.presentation.screens.auth.register

import androidx.compose.foundation.layout.padding
import androidx.compose.material.Scaffold
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier

/****
 * Project: Ecommerce App
 * From: com.victor.ecommerceapp.presentation.screens.auth.register
 * Created by: Victor Sanjines Lopez on 29/3/2023 at 19:10
 * More info: www.victorsanjines.com.bo
 * All rights reserved 2023
 ****/

@Composable
fun RegisterScreen() {
    Scaffold() { paddingValues ->
        Text(
            modifier = Modifier.padding(paddingValues= paddingValues),
            text = "RegisterScreen"
        )
    }
}