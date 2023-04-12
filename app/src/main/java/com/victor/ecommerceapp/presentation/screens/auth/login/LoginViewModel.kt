package com.victor.ecommerceapp.presentation.screens.auth.login

import android.util.Patterns
import androidx.compose.runtime.*
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import javax.inject.Inject

/****
 * Project: Ecommerce App
 * From: com.victor.ecommerceapp.presentation.screens.auth.login
 * Created by: Victor Sanjines Lopez on 11/4/2023 at 19:13
 * More info: www.victorsanjines.com.bo
 * All rights reserved 2023
 ****/

@HiltViewModel
//Indicamos que la clase puede ser inyectada en otra clase o en una función
class LoginViewModel @Inject constructor(): ViewModel() {
    var state by mutableStateOf(LoginState())
        private set

    var errorMessage by mutableStateOf("")
        private set

    //old
    //var email by mutableStateOf("")
    //var password by mutableStateOf("")

    //new
    fun onEmailInput(email: String) {
        state = state.copy(email = email)
    }

    fun onPasswordInput(password: String) {
        state = state.copy(password = password)
    }

    fun validateForm() = viewModelScope.launch{

        if (!Patterns.EMAIL_ADDRESS.matcher(state.email).matches()) {
            errorMessage = "El email no es válido"
        }
        else if (state.password.length < 6) {
            errorMessage = "la contraseña debe tener al menos 6 caracteres"
        }

        delay(3000)
        errorMessage = ""
    }

}