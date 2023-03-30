package com.victor.ecommerceapp.presentation.screens.auth.register.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.victor.ecommerceapp.R

/****
 * Project: Ecommerce App
 * From: com.victor.ecommerceapp.presentation.screens.auth.register.components
 * Created by: Victor Sanjines Lopez on 29/3/2023 at 20:49
 * More info: www.victorsanjines.com.bo
 * All rights reserved 2023
 ****/
@Composable
fun HeaderBanner() {
    Row (
        modifier = Modifier.fillMaxWidth().padding(top = 35.dp),
        verticalAlignment = Alignment.CenterVertically,
        horizontalArrangement = Arrangement.Center
    ){
        Image(
            modifier= Modifier
                .height(100.dp)
                .width(100.dp)
                .padding(top = 20.dp),
            painter = painterResource(id = R.drawable.user_form),
            contentDescription = ""
        )
        Text(
            modifier = Modifier.padding(top = 7.dp, start = 10.dp),
            text = "INGRESA ESTA INFORMACION",
            fontWeight = FontWeight.Bold,
            fontSize = 16.sp,
            color = Color.White
        )
    }
}