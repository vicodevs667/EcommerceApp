package com.victor.ecommerceapp.presentation.navigation.screen

/****
 * Project: Ecommerce App
 * From: com.victor.ecommerceapp.presentation.navigation.screen
 * Created by: Victor Sanjines Lopez on 29/3/2023 at 19:02
 * More info: www.victorsanjines.com.bo
 * All rights reserved 2023
 ****/
sealed class AuthScreen(val route: String) {
    object Login: AuthScreen("login")
    object Register: AuthScreen("register")
}
