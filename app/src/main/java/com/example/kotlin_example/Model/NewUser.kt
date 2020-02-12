package com.example.kotlin_example.Model

import android.text.Editable


data class NewUser(val firstName: Editable,val lastName: Editable,val email: String,val country: Editable,val state: Editable
                   ,val city: Editable, val zip: Editable,val address: Editable,val address2: Editable,val phone: Editable)