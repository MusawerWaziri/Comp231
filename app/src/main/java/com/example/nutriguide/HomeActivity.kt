package com.example.nutriguide

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button


/**
 *  Will contain the search bar, button to the FoodCategoryActivity, about, contact, etc.
 */
class HomeActivity : AppCompatActivity() {
    private lateinit var categoryButton: Button
        override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)

            categoryButton = findViewById(R.id.category_btn)
            categoryButton.setOnClickListener {
                val intent = Intent(this, FoodCategoryActivity::class.java)
                startActivity(intent)
            }
   }
}