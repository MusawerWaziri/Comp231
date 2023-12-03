package com.example.nutriguide

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.google.android.material.search.SearchView
import android.content.Intent

/**
 *  Will contain the search bar, button to the FoodCategoryActivity, about, contact, etc.
 */
class HomeActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)

        val searchView = findViewById<SearchView>(R.id.homeSearch)

        val foodCategoryButton = findViewById<Button>(R.id.foodCatButton)
        val aboutButton = findViewById<Button>(R.id.aboutButton)
        val contactButton = findViewById<Button>(R.id.contactButton)

        foodCategoryButton.setOnClickListener(){
            val intent = Intent(this, FoodCategoryActivity::class.java)
            startActivity(intent)
        }
    }
}