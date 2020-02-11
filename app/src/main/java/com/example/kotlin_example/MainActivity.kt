package com.example.kotlin_example

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
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
            listOfUsers.add(User(userNameText.text,passwrodText.text))



            logInButton.setOnClickListener {

               // Toast.makeText(this,listOfUsers.toString(),Toast.LENGTH_LONG).show()
                loginPresenter.validate(userNameText.text.toString(),passwrodText.text.toString())

            }

                createAccountButton.setOnClickListener{
                    //val intent = new Intent()
                    //startActivity(intent)
                }


    }

}


