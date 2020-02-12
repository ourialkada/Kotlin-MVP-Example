package com.example.kotlin_example.Activities

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import com.example.kotlin_example.Presenters.CreateAccountPresenter
import com.example.kotlin_example.R


class SendEmailActivity : AppCompatActivity() {

companion object {
   var  email = ""
    var password = ""
}

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.name)

        val createAccountPresenter = CreateAccountPresenter(this)
        val createAccountButton = findViewById<Button>(R.id.createAccountButton)
        val userNameText = findViewById<EditText>(R.id.userName1)
        val passwrodText = findViewById<EditText>(R.id.password1)
        val passwrodText2 = findViewById<EditText>(R.id.password2)


        createAccountButton.setOnClickListener{
            println("CLICKED")
          if(validate(userNameText.text.toString(),passwrodText.text.toString(),passwrodText2.text.toString()))
          {
              email = userNameText.text.toString()
              password= passwrodText.text.toString()
                createAccountPresenter.sendEmail(userNameText.text.toString())
          }

        }


    }

    private fun validate(email:String,password:String,verifyPass:String):Boolean
    {
        if (email.length < 6 || email == "" || !email.contains("@") || (!email.contains(".com") && !email.contains(".org") && !email.contains(".net") && !email.contains(".edu"))) {
           Toast.makeText(this,"Email is not valid",Toast.LENGTH_SHORT).show()
            return false
        }

        if (password.length < 6)
        {

            Toast.makeText(this,"Password Must be at least 6 characters",Toast.LENGTH_SHORT).show()
            return false
        }

        if (password != verifyPass)
        {
            Toast.makeText(this,"Passwords must match",Toast.LENGTH_SHORT).show()
            return false
        }

        println("SUCCESS?")

        return true
    }

}


