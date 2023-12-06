package com.example.nutriguide

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class ContactActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_contact)

        val emailButton: Button = findViewById(R.id.buttonEmail)
        val callButton: Button = findViewById(R.id.buttonCall)

        emailButton.setOnClickListener {
            val emailAddress = "contact@example.com"
            val emailIntent = Intent(Intent.ACTION_SENDTO)
            emailIntent.data = Uri.parse("mailto:$emailAddress")
            startActivity(emailIntent)
        }

        callButton.setOnClickListener {
            val phoneNumber = "+1234567890"
            val phoneIntent = Intent(Intent.ACTION_DIAL)
            phoneIntent.data = Uri.parse("tel:$phoneNumber")
            startActivity(phoneIntent)
        }

    }
}