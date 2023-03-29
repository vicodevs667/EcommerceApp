package com.victor.ecommerceapp.presentation.navigation.graph

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import com.victor.ecommerceapp.presentation.navigation.Graph

/****
 * Project: Ecommerce App
 * From: com.victor.ecommerceapp.presentation.navigation.graph
 * Created by: Victor Sanjines Lopez on 29/3/2023 at 18:56
 * More info: www.victorsanjines.com.bo
 * All rights reserved 2023
 ****/

@Composable
fun RootNavGraph(navController: NavHostController) {
    NavHost(
        navController = navController,
        route = Graph.ROOT,
        startDestination = Graph.AUTH
    ) {
        AuthNavGraph(navController= navController)
    }
}






















