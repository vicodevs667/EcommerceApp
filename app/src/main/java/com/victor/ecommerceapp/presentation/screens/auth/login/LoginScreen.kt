package com.victor.ecommerceapp.presentation.screens.auth

import androidx.compose.material.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import com.victor.ecommerceapp.presentation.screens.auth.login.components.LoginContent
import com.victor.ecommerceapp.presentation.ui.theme.EcommerceAppTheme

/****
 * Project: Ecommerce App
 * From: com.victor.ecommerceapp.presentation.screens.auth
 * Created by: Victor Sanjines Lopez on 29/3/2023 at 17:16
 * More info: www.victorsanjines.com.bo
 * All rights reserved 2023
 ****/

@Composable
fun LoginScreen(navController: NavHostController) {
    //ubicar los componentes en la pantalla de mejor manera
    Scaffold() { paddingValues ->
        LoginContent(paddingValues, navController= navController)
    }
}

@Preview(showBackground = true, showSystemUi = true)
@Composable
fun LoginScreenPreview() {
    EcommerceAppTheme {
        LoginScreen(rememberNavController())
    }
}