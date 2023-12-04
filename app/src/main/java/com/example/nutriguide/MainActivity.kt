package com.example.nutriguide

import android.content.Intent
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import android.view.View
import android.view.View.*
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import org.w3c.dom.Text
import java.util.EventListener

class MainActivity : AppCompatActivity() {

    private lateinit var usernameEditText: EditText
    private lateinit var passwordEditText: EditText
    private lateinit var loginButton: Button
    private lateinit var registerButton: Button
    private lateinit var guestButton: Button
    private lateinit var TextView: TextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Initialize views
        usernameEditText = findViewById(R.id.username)
        passwordEditText = findViewById(R.id.password)
        loginButton = findViewById(R.id.loginBtn)
        registerButton = findViewById(R.id.registerLink)
        guestButton = findViewById(R.id.guest_btn)
        TextView = findViewById(R.id.welcome_msg)

        //make INVISIBLE to user
        usernameEditText.visibility = INVISIBLE
        passwordEditText.visibility = INVISIBLE
        loginButton.visibility = INVISIBLE
        registerButton.visibility = INVISIBLE
        guestButton.visibility = INVISIBLE



        // Handler to introduce a 3-second delay
        Handler(Looper.getMainLooper()).postDelayed({

            usernameEditText.visibility = VISIBLE
            passwordEditText.visibility = VISIBLE
            loginButton.visibility = VISIBLE
            registerButton.visibility = VISIBLE
            guestButton.visibility = VISIBLE
            TextView.visibility = INVISIBLE

        }, 3000)

        // Set on click listener for login button
        loginButton.setOnClickListener {

            val username = usernameEditText.text.toString().trim()
            val password = passwordEditText.text.toString()

            if (validateLogin(username, password)) {
                // This is where you would verify the credentials against your database
                // For now, we assume the login is successful
                goToHomeActivity()
            } else {
                showToast("Invalid username or password")
            }
        }

        // Set on click listener for register button to navigate to the RegisterActivity
        registerButton.setOnClickListener {
            val intent = Intent(this, RegisterActivity::class.java)
            startActivity(intent)
        }

        guestButton.setOnClickListener {
            val intent = Intent(this, HomeActivity::class.java)
            startActivity(intent)
        }

    }

    private fun validateLogin(username: String, password: String): Boolean {
        // Add your validation logic here. For now, we assume any non-empty input is valid
        return username.isNotEmpty() && password.isNotEmpty()
    }

    private fun goToHomeActivity() {
        // Navigate to HomeActivity
        val intent = Intent(this, HomeActivity::class.java)
        startActivity(intent)
        finish() // Close the login activity so it's removed from the back stack
    }

    private fun showToast(message: String) {
        Toast.makeText(this, message, Toast.LENGTH_SHORT).show()
    }







}
