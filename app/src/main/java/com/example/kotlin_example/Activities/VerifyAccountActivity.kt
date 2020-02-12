package com.example.kotlin_example.Activities

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import com.example.kotlin_example.Presenters.CreateAccountPresenter
import com.example.kotlin_example.R


class VerifyAccountActivity : AppCompatActivity() {



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.name)

        val createAccountPresenter = CreateAccountPresenter(this)
        val verifytButton = findViewById<Button>(R.id.verifyAccountButton)
        val codeText = findViewById<EditText>(R.id.verifyCode)


        verifytButton.setOnClickListener{

                 if(validate(codeText.text.toString()))
                {
                    createAccountPresenter.verifyCode(codeText.text.toString())
                }

        }


    }

    private fun validate(code:String):Boolean
    {

        if (code.length < 6)
        {
            Toast.makeText(this,"Password Must be at least 6 characters",Toast.LENGTH_SHORT).show()
            return false
        }

        return true
    }

}


