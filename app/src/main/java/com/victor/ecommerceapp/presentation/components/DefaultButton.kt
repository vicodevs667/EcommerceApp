package com.victor.ecommerceapp.presentation.components

import androidx.compose.foundation.layout.*
import androidx.compose.material.Button
import androidx.compose.material.ButtonDefaults
import androidx.compose.material.Icon
import androidx.compose.material.Text
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowForward
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.victor.ecommerceapp.presentation.screens.auth.LoginScreen
import com.victor.ecommerceapp.presentation.ui.theme.Blue500
import com.victor.ecommerceapp.presentation.ui.theme.EcommerceAppTheme

/****
 * Project: Ecommerce App
 * From: com.victor.ecommerceapp.presentation.components
 * Created by: Victor Sanjines Lopez on 29/3/2023 at 18:40
 * More info: www.victorsanjines.com.bo
 * All rights reserved 2023
 ****/

@Composable
fun DefaultButton(
    modifier: Modifier,
    text: String,
    onClick: () -> Unit,
    color: Color = Blue500,
    icon: ImageVector = Icons.Default.ArrowForward
) {
    Button(
        modifier = modifier,
        onClick = { onClick() },
        colors = ButtonDefaults.buttonColors(backgroundColor = color)
    ) {
        Icon(
            imageVector = icon,
            contentDescription = ""
        )
        Spacer(modifier = Modifier.width(10.dp))
        Text(text = text)
    }
}

@Preview(showBackground = true)
@Composable
fun DefaultButtonPreview() {
    EcommerceAppTheme {
        DefaultButton(
            modifier = Modifier
                .fillMaxWidth()
                .height(50.dp),
            text = "LOGIN",
            onClick = {  }
        )
    }
}



















