package com.example.kotlin_example.Presenters

import android.content.Context
import android.widget.Toast
import com.example.kotlin_example.Model.NewUser
import com.example.kotlin_example.Views.CreateAccountView

class CreateAccountPresenter(context: Context) : CreateAccountView
{

    private  var context : Context = context


    fun sendEmail(email:String)
    {

    }

    fun verifyCode(code:String)
    {

    }

    fun createAccount(user: NewUser)
    {

    }



    override fun SendEmailSuccess() {
        Toast.makeText(context, "Email sent successfully",Toast.LENGTH_SHORT)
    }

    override fun SendEmailFailure() {
        Toast.makeText(context,"Failed to send Email",Toast.LENGTH_SHORT)
    }

    override fun VerifyCodeSuccess() {
        Toast.makeText(context, "Code verified successfully",Toast.LENGTH_SHORT)
    }

    override fun VerifyCodeFailure() {
        Toast.makeText(context,"Failed to verify code",Toast.LENGTH_SHORT)
    }

    override fun CreateAccountSuccess() {
        Toast.makeText(context, "Account Created successfully",Toast.LENGTH_SHORT)
    }

    override fun CreateaccountFailure() {
        Toast.makeText(context,"Failed to create account",Toast.LENGTH_SHORT)
    }




}