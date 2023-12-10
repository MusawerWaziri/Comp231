package com.example.nutriguide

import android.content.Intent
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.google.firebase.FirebaseApp

class MainActivity : AppCompatActivity() {

    private lateinit var usernameEditText: EditText
    private lateinit var passwordEditText: EditText
    private lateinit var loginButton: Button
    private lateinit var registerButton: Button
    private lateinit var guestButton: Button
    private lateinit var welcomeMsg: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)


        //Firebase setup
        FirebaseApp.initializeApp(this)
        setContentView(R.layout.activity_main)

        // Initialize views
        usernameEditText = findViewById(R.id.username)
        passwordEditText = findViewById(R.id.password)
        loginButton = findViewById(R.id.loginBtn)
        registerButton = findViewById(R.id.registerLink)
        guestButton = findViewById(R.id.guestBtn)
        welcomeMsg = findViewById(R.id.welcome_msg)

        //Invisible for 2-seconds except for the logo and a welcome text
        usernameEditText.visibility = View.INVISIBLE
        passwordEditText.visibility = View.INVISIBLE
        loginButton.visibility = View.INVISIBLE
        registerButton.visibility = View.INVISIBLE
        guestButton.visibility = View.INVISIBLE


        // Handler to introduce a 2-second delay
        Handler(Looper.getMainLooper()).postDelayed({
            usernameEditText.visibility = View.VISIBLE
            passwordEditText.visibility = View.VISIBLE
            loginButton.visibility = View.VISIBLE
            registerButton.visibility = View.VISIBLE
            guestButton.visibility = View.VISIBLE
            welcomeMsg.visibility = View.GONE

        }, 2000)

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
        // Set on click listener for guest button to navigate to the HomeActivity
        guestButton.setOnClickListener {
            val intent = Intent(this, HomeActivity::class.java)
            startActivity(intent)
            finish()
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
