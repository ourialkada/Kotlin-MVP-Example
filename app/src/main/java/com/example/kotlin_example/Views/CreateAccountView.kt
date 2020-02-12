package com.example.kotlin_example.Views

interface CreateAccountView{

    fun SendEmailSuccess()
    fun SendEmailFailure()
    fun VerifyCodeSuccess()
    fun VerifyCodeFailure()
    fun CreateAccountSuccess()
    fun CreateaccountFailure()
}