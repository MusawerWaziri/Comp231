package com.example.nutriguide

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

/**
 *  RecycleView.
 *  Will contain buttons to the FoodDetailActivity.
 */
class FoodListingActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_food_listing)
    }
}