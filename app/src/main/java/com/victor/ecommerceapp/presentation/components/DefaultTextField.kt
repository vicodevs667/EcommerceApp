package com.victor.ecommerceapp.presentation.components

import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material.Icon
import androidx.compose.material.OutlinedTextField
import androidx.compose.material.Text
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Email
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.text.input.KeyboardType
import com.victor.ecommerceapp.presentation.ui.theme.Blue500

/****
 * Project: Ecommerce App
 * From: com.victor.ecommerceapp.presentation.components
 * Created by: Victor Sanjines Lopez on 29/3/2023 at 18:21
 * More info: www.victorsanjines.com.bo
 * All rights reserved 2023
 ****/

@Composable
fun DefaultTextField(
    modifier: Modifier,
    value: String,
    onValueChange: (value: String) -> Unit,
    label: String,
    icon: ImageVector,
    keyboardType: KeyboardType = KeyboardType.Text
) {
    OutlinedTextField(
        modifier = modifier,
        value = value,
        onValueChange = { text ->
            onValueChange(text)
        },
        label = {
            Text(text = label)
        },
        leadingIcon = {
            Icon(
                imageVector = icon,
                contentDescription = "",
                tint = Blue500
            )
        },
        keyboardOptions = KeyboardOptions(keyboardType = keyboardType)
        /*colors = TextFieldDefaults.textFieldColors(
            backgroundColor = Color.White
        )*/
    )
}




















