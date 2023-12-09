package com.example.nutriguide

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.LinearLayout


/**
 *  Will contain the search bar, button to the FoodCategoryActivity, about, contact, etc.
 */
class HomeActivity : AppCompatActivity() {
    private lateinit var categoryButton: Button
    private lateinit var contactButton: Button
    private lateinit var buttonToggle: Button
    private lateinit var layoutInfo: LinearLayout

        override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)

            buttonToggle = findViewById(R.id.aboutBtnToggle)
            layoutInfo = findViewById<LinearLayout>(R.id.layoutInfo)
            categoryButton = findViewById(R.id.btnCategory)
            contactButton = findViewById(R.id.btnContact)

            buttonToggle.setOnClickListener {
                if (layoutInfo.visibility == View.GONE) {
                    layoutInfo.visibility = View.VISIBLE
                    buttonToggle.text = "Hide Info"
                } else {
                    layoutInfo.visibility = View.GONE
                    buttonToggle.text = "About NutriGuide"
                }
            }

            categoryButton.setOnClickListener {
                val intent = Intent(this, FoodCategoryActivity::class.java)
                startActivity(intent)
            }

            contactButton.setOnClickListener {
                val intent = Intent(this, ContactActivity::class.java)
                startActivity(intent)
            }

   }

}