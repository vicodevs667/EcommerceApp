package com.victor.ecommerceapp.presentation.components

import androidx.compose.material.Icon
import androidx.compose.material.IconButton
import androidx.compose.material.Text
import androidx.compose.material.TopAppBar
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController

/****
 * Project: Ecommerce App
 * From: com.victor.ecommerceapp.presentation.components
 * Created by: Victor Sanjines Lopez on 29/3/2023 at 19:58
 * More info: www.victorsanjines.com.bo
 * All rights reserved 2023
 ****/

@Composable
fun DefaultTopBar(
    title: String,
    upAvailable: Boolean = false,
    navController: NavHostController? = null // en caso que llegue nulo
) {
    TopAppBar(
        title = {
            Text(
                text = "Registro",
                fontSize = 19.sp
            )
        },
        backgroundColor = Color.White,
        navigationIcon = {
            if (upAvailable) {
                IconButton(onClick = { navController?.popBackStack() }) {
                    Icon(
                        imageVector = Icons.Default.ArrowBack,
                        contentDescription = "",
                        tint = Color.Black
                    )
                }
            }
        }
    )
}