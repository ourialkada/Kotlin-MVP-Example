package com.example.kotlin_example

import android.content.Context
import android.widget.Toast

class LoginPresenter(context: Context) : LoginView
{
    private  var context : Context = context;

     fun  validate(email:String,password:String)
    {
        if(!email.equals("ouri@gmail.com") || !password.equals("1234")) {
            loginFailure()
        }
        else
        {
            logInSuccess()
        }
    }




    override fun logInSuccess() {
        Toast.makeText(context,"SUCCESS", Toast.LENGTH_LONG).show()
    }
    override fun loginFailure() {
        Toast.makeText(context,"Failure", Toast.LENGTH_LONG).show()
    }

}