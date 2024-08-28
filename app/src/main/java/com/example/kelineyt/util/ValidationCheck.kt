package com.example.kelineyt.util

import android.util.Patterns

fun validateEmail(email:String):RegisterValidation{
    if(email.isEmpty())
        return RegisterValidation.Failed("Email cannot be Empty")
    else if(!Patterns.EMAIL_ADDRESS.matcher(email).matches()){
        return RegisterValidation.Failed("Email should be in proper format")
    }
    return RegisterValidation.Success
}

fun validatePassword(password:String):RegisterValidation{
    if(password.isEmpty())
        return RegisterValidation.Failed("Password cannot be Empty")
    if(password.length<6)
        return RegisterValidation.Failed("Password is too short")
    return RegisterValidation.Success
}
