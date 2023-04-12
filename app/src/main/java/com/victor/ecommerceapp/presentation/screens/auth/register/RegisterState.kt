package com.victor.ecommerceapp.presentation.screens.auth.register

/****
 * Project: Ecommerce App
 * From: com.victor.ecommerceapp.presentation.screens.auth.register
 * Created by: Victor Sanjines Lopez on 11/4/2023 at 19:32
 * More info: www.victorsanjines.com.bo
 * All rights reserved 2023
 ****/
data class RegisterState(
    val name: String = "",
    val lastName: String = "",
    val email: String = "",
    val phone: String = "",
    val password: String = "",
    val confirmPassword: String = ""
)
