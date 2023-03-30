package com.victor.ecommerceapp.presentation.navigation.graph


import androidx.navigation.NavGraphBuilder
import androidx.navigation.NavHostController
import androidx.navigation.compose.composable
import androidx.navigation.navigation
import com.victor.ecommerceapp.presentation.navigation.Graph
import com.victor.ecommerceapp.presentation.navigation.screen.AuthScreen
import com.victor.ecommerceapp.presentation.screens.auth.LoginScreen
import com.victor.ecommerceapp.presentation.screens.auth.register.RegisterScreen

/****
 * Project: Ecommerce App
 * From: com.victor.ecommerceapp.presentation.navigation.graph
 * Created by: Victor Sanjines Lopez on 29/3/2023 at 19:01
 * More info: www.victorsanjines.com.bo
 * All rights reserved 2023
 ****/

fun NavGraphBuilder.AuthNavGraph(navController: NavHostController) {
    navigation(
        route = Graph.AUTH,
        startDestination = AuthScreen.Login.route
    ) {
        composable(route = AuthScreen.Login.route) {
            LoginScreen(navController)
        }
        composable(route = AuthScreen.Register.route) {
            RegisterScreen(navController)
        }

    }
}