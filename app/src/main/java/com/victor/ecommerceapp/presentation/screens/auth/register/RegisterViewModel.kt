package com.victor.ecommerceapp.presentation.screens.auth.register

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
 * From: com.victor.ecommerceapp.presentation.screens.auth.register
 * Created by: Victor Sanjines Lopez on 11/4/2023 at 19:34
 * More info: www.victorsanjines.com.bo
 * All rights reserved 2023
 ****/

@HiltViewModel
class RegisterViewModel @Inject constructor(): ViewModel() {

    var state by mutableStateOf(RegisterState())

    var errorMessage by mutableStateOf("")
        private set

    fun onNameInput(input: String) {
        state = state.copy(name = input)
    }

    fun onLastNameInput(input: String) {
        state = state.copy(lastName = input)
    }

    fun onEmailInput(input: String) {
        state = state.copy(email = input)
    }

    fun onPhoneInput(input: String) {
        state = state.copy(phone = input)
    }

    fun onPasswordInput(input: String) {
        state = state.copy(password = input)
    }

    fun onConfirmPasswordInput(input: String) {
        state = state.copy(confirmPassword = input)
    }

    fun validateForm() = viewModelScope.launch{

        if (state.name == "") {
            errorMessage = "Ingrese el nombre"
        }
        else if (state.lastName == "") {
            errorMessage = "Ingrese el apellido"
        }
        else if (state.phone == "") {
            errorMessage = "Ingrese el teléfono"
        }
        else if (state.email == "") {
            errorMessage = "Ingrese el email"
        }
        else if (state.password == "") {
            errorMessage = "Ingrese el password"
        }
        else if (state.confirmPassword == "") {
            errorMessage = "Ingrese el password de confirmación"
        }
        else if (!Patterns.EMAIL_ADDRESS.matcher(state.email).matches()) {
            errorMessage = "El email no es válido"
        }
        else if (state.password.length < 6) {
            errorMessage = "la contraseña debe tener al menos 6 caracteres"
        }
        else if (state.password != state.confirmPassword) {
            errorMessage = "las contraseñas no coinciden"
        }

        delay(3000)
        errorMessage = ""
    }


}