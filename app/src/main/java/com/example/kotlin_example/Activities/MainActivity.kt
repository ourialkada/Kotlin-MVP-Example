package com.example.kotlin_example.Activities

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import com.example.kotlin_example.Model.User
import com.example.kotlin_example.Presenters.LoginPresenter
import com.example.kotlin_example.R
import kotlin.collections.ArrayList

class MainActivity : AppCompatActivity() {



        override fun onCreate(savedInstanceState: Bundle?) {
            super.onCreate(savedInstanceState)
            setContentView(R.layout.activity_main)

            val loginPresenter = LoginPresenter(this)
            val logInButton = findViewById<Button>(R.id.button)
            val createAccountButton = findViewById<Button>(R.id.createAccountButton)
            val userNameText = findViewById<EditText>(R.id.userName)
            val passwrodText = findViewById<EditText>(R.id.password)
            var listOfUsers = ArrayList<User>()
            listOfUsers.add(
                User(
                    userNameText.text,
                    passwrodText.text
                )
            )

            logInButton.setOnClickListener {
                loginPresenter.validate(userNameText.text.toString(),passwrodText.text.toString())
            }

                createAccountButton.setOnClickListener{
                    val intent = Intent(this,SendEmailActivity::class.java)
                    startActivity(intent)
                }


    }

}


