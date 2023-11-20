package com.example.nutriguide

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

/**
 *  Will contain the search bar, button to the FoodCategoryActivity, about, contact, etc.
 */
class HomeActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)
    }
}