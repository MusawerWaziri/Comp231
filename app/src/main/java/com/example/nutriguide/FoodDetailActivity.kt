package com.example.nutriguide

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

/**
 *  Will contain image of the food, recipe, instruction, and health benefits, etc.
 */
class FoodDetailActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_food_detail)
    }
}