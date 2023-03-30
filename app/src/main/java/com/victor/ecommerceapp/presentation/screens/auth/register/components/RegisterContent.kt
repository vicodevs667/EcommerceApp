package com.victor.ecommerceapp.presentation.screens.auth.register.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Card
import androidx.compose.material.Text
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Email
import androidx.compose.material.icons.filled.Lock
import androidx.compose.material.icons.filled.Person
import androidx.compose.material.icons.filled.Phone
import androidx.compose.material.icons.outlined.Lock
import androidx.compose.material.icons.outlined.Person
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.ColorFilter
import androidx.compose.ui.graphics.ColorMatrix
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.victor.ecommerceapp.R
import com.victor.ecommerceapp.presentation.components.DefaultButton
import com.victor.ecommerceapp.presentation.components.DefaultTextField

/****
 * Project: Ecommerce App
 * From: com.victor.ecommerceapp.presentation.screens.auth.register.components
 * Created by: Victor Sanjines Lopez on 29/3/2023 at 20:07
 * More info: www.victorsanjines.com.bo
 * All rights reserved 2023
 ****/

@Composable
fun RegisterContent(paddingValues: PaddingValues) {
    Box(modifier = Modifier
        .padding(paddingValues = paddingValues)
        .fillMaxSize()
    ) {
        BackgroundImage()
        Column(
            modifier = Modifier.fillMaxWidth(),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            HeaderBanner()
            Spacer(modifier = Modifier.weight(1f))
            Card(
                modifier = Modifier.fillMaxWidth(),
                shape = RoundedCornerShape(
                    topStart = 40.dp,
                    topEnd = 40.dp
                ),
                backgroundColor = Color.White.copy(alpha = 0.8f)
            ) {
                Column(modifier= Modifier.padding(top = 30.dp, start = 30.dp, end = 30.dp, bottom = 30.dp)) {
                    Text(
                        modifier = Modifier.padding(bottom = 20.dp),
                        text = "REGISTRARSE",
                        fontWeight = FontWeight.Bold,
                        fontSize = 20.sp,
                        color= Color.Black
                    )
                    DefaultTextField(
                        modifier = Modifier.fillMaxWidth(),
                        value = "",
                        onValueChange = {},
                        label = "Nombres",
                        icon = Icons.Default.Person
                    )
                    DefaultTextField(
                        modifier = Modifier.fillMaxWidth(),
                        value = "",
                        onValueChange = {},
                        label = "Apellidos",
                        icon = Icons.Outlined.Person
                    )
                    DefaultTextField(
                        modifier = Modifier.fillMaxWidth(),
                        value = "",
                        onValueChange = {},
                        label = "Correo Electrónico",
                        icon = Icons.Default.Email,
                        keyboardType = KeyboardType.Email
                    )
                    DefaultTextField(
                        modifier = Modifier.fillMaxWidth(),
                        value = "",
                        onValueChange = {},
                        label = "Teléfono",
                        icon = Icons.Default.Phone,
                        keyboardType = KeyboardType.Number
                    )
                    DefaultTextField(
                        modifier = Modifier.fillMaxWidth(),
                        value = "",
                        onValueChange = {},
                        label = "Contraseña",
                        icon = Icons.Default.Lock,
                        keyboardType = KeyboardType.Password
                    )
                    DefaultTextField(
                        modifier = Modifier.fillMaxWidth(),
                        value = "",
                        onValueChange = {},
                        label = "Confirmar Contraseña",
                        icon = Icons.Outlined.Lock,
                        keyboardType = KeyboardType.Password
                    )
                    Spacer(modifier = Modifier.height(15.dp))
                    DefaultButton(
                        modifier = Modifier
                            .fillMaxWidth()
                            .height(50.dp),
                        text = "CONFIRMAR",
                        onClick = {  }
                    )

                }

            }
        }
    }
}

























