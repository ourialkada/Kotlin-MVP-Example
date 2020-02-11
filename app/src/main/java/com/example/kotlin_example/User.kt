package com.example.kotlin_example

import android.text.Editable

data class User(val email: Editable, val password: Editable)
{
    override fun toString(): String {
        return email.toString() + " " + password.toString()
    }
}

