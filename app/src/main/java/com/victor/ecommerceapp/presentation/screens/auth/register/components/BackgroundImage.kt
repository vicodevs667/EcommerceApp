package com.victor.ecommerceapp.presentation.screens.auth.register.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.ColorFilter
import androidx.compose.ui.graphics.ColorMatrix
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import com.victor.ecommerceapp.R

/****
 * Project: Ecommerce App
 * From: com.victor.ecommerceapp.presentation.screens.auth.register.components
 * Created by: Victor Sanjines Lopez on 29/3/2023 at 20:52
 * More info: www.victorsanjines.com.bo
 * All rights reserved 2023
 ****/

@Composable
fun BackgroundImage() {
    Image(
        modifier= Modifier.fillMaxSize(),
        painter = painterResource(id = R.drawable.banner_form),
        contentDescription = "",
        contentScale = ContentScale.Crop,
        colorFilter = ColorFilter.colorMatrix(ColorMatrix().apply {
            setToScale(.6f, .6f, .6f, 1f)
        })
    )
}