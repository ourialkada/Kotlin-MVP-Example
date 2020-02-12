package com.example.kotlin_example.Activities

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.TextUtils
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import com.example.kotlin_example.Model.NewUser
import com.example.kotlin_example.Presenters.CreateAccountPresenter
import com.example.kotlin_example.R
import kotlinx.android.synthetic.main.create_full_account.*


class CreateAccountActivity : AppCompatActivity() {



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.name)

        val createAccountPresenter = CreateAccountPresenter(this)
        val button = findViewById<TextView>(R.id.buttonFull)
        val firstName = findViewById<EditText>(R.id.etFirstNameSignUp)
        val lastName = findViewById<EditText>(R.id.etLastNameSignUp)
        val country = findViewById<EditText>(R.id.etCountrySignUpp)
        val state = findViewById<EditText>(R.id.etStateSignUpp)
        val city = findViewById<EditText>(R.id.etCitySignUpp)
        val zip = findViewById<EditText>(R.id.etZipCodeSignUpp)
        val address2 = findViewById<EditText>(R.id.etAddressSignUpp2)
        val address = findViewById<EditText>(R.id.etAddressSignUpp)
        val phone = findViewById<EditText>(R.id.etPhoneNoSignUpp)



        button.setOnClickListener{

            if(validate(firstName.text.toString(),lastName.text.toString(),city.text.toString(),SendEmailActivity.email,address.text.toString(),address2.text.toString(),country.text.toString(),zip.text.toString(),phone.text.toString()))
            {
                createAccountPresenter.createAccount(NewUser(firstName.text,lastName.text,SendEmailActivity.email,country.text,state.text,city.text,zip.text,address.text,address2.text,phone.text))
            }

        }


    }

    private fun validate(firstName:String,lastName:String,city:String,email:String,address:String,address2:String,country:String,zip:String,phoneNo:String):Boolean
    {

        if (TextUtils.isEmpty(firstName)) {
            visibilityGoneUserExists.setVisibility(View.VISIBLE)
            Toast.makeText(this,"Please enter firstname",Toast.LENGTH_SHORT).show()
           return false
        } else if (TextUtils.isEmpty(lastName)) {
            visibilityGoneUserExists.setVisibility(View.VISIBLE)
            Toast.makeText(this,"Please enter lastname",Toast.LENGTH_SHORT).show()
            return false
        } else if (TextUtils.isEmpty(email)) {
            visibilityGoneUserExists.setVisibility(View.VISIBLE)
            Toast.makeText(this,"Please enter email",Toast.LENGTH_SHORT).show()
            return false
        } else if (TextUtils.isEmpty(address)) {
            visibilityGoneUserExists.setVisibility(View.VISIBLE)
            Toast.makeText(this,"Please enter address",Toast.LENGTH_SHORT).show()
            return false
        } else if (TextUtils.isEmpty(country)) {
            visibilityGoneUserExists.setVisibility(View.VISIBLE)
            Toast.makeText(this,"Please enter country",Toast.LENGTH_SHORT).show()
            return false
        } else if (TextUtils.isEmpty(phoneNo)) {
            visibilityGoneUserExists.setVisibility(View.VISIBLE)
            Toast.makeText(this,"Please enter phone number",Toast.LENGTH_SHORT).show()
            return false
        } else if (!email.contains("@") || (!email.contains(".com") && !email.contains(".org") && !email.contains(".net") && !email.contains(".edu"))) {
            visibilityGoneUserExists.setVisibility(View.VISIBLE);
            Toast.makeText(this,"Please enter valid email address",Toast.LENGTH_SHORT).show()
            return false
        }  else if ((zip.length) != 5) {
            visibilityGoneUserExists.setVisibility(View.VISIBLE)
            Toast.makeText(this,"Zip Code must have 5 digits",Toast.LENGTH_SHORT).show()
            return false
        } else if (email.contains(" ")) {
            visibilityGoneUserExists.setVisibility(View.VISIBLE)
            Toast.makeText(this,"Email can not contain whitespaces",Toast.LENGTH_SHORT).show()
            return false
        }
        else if (zip.contains(",")) {
            visibilityGoneUserExists.setVisibility(View.VISIBLE)
            Toast.makeText(this,"ZIP can not contain whitespaces",Toast.LENGTH_SHORT).show()
            return false
        } else if (phoneNo.length != 10) {
            visibilityGoneUserExists.setVisibility(View.VISIBLE)
            Toast.makeText(this,"Please enter a valid phone number",Toast.LENGTH_SHORT).show()
            return false
        }


        return true
    }

}


