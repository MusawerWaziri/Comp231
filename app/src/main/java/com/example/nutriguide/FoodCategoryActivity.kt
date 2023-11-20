package com.example.nutriguide

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

/**
 *  RecycleView
 *  Will contain button (Breakfast, Lunch, Dinner, etc.) to the FoodListingActivity.
 */
class FoodCategoryActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_food_category)
    }
}