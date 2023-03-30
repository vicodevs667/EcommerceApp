package com.victor.ecommerceapp.presentation.screens.auth.register

import androidx.compose.foundation.layout.padding
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import com.victor.ecommerceapp.presentation.components.DefaultTopBar
import com.victor.ecommerceapp.presentation.screens.auth.LoginScreen
import com.victor.ecommerceapp.presentation.screens.auth.register.components.RegisterContent
import com.victor.ecommerceapp.presentation.ui.theme.EcommerceAppTheme

/****
 * Project: Ecommerce App
 * From: com.victor.ecommerceapp.presentation.screens.auth.register
 * Created by: Victor Sanjines Lopez on 29/3/2023 at 19:10
 * More info: www.victorsanjines.com.bo
 * All rights reserved 2023
 ****/

@Composable
fun RegisterScreen(navController: NavHostController) {
    Scaffold(
        topBar = {
            DefaultTopBar(
                title = "Registro",
                upAvailable = true,
                navController = navController
            )
        }
    ) { paddingValues ->
        RegisterContent(paddingValues = paddingValues)
    }
}

@Preview(showBackground = true, showSystemUi = true)
@Composable
fun RegisterScreenPreview() {
    EcommerceAppTheme {
        RegisterScreen(rememberNavController())
    }
}