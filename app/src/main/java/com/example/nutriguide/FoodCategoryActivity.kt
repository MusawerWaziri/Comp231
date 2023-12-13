package com.example.nutriguide

/**
Alex Tang – Developer
Abdul Waziri – Developer
Sara Heimbecker – Developer
Vanessa Victorino - Agile Customer

RecycleView
Will buttons to the FoodListingActivity, about, contact, etc.
 **/
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.AdapterView
import android.widget.ArrayAdapter
import android.widget.ListView

class FoodCategoryActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_food_category)

        val foodTypes = listOf("Breakfast", "Lunch", "Dinner", "Dessert")

        //val food = intent.getSerializableExtra("selectedFood") as? Food
        // Use food details as needed

        val foodTypeListView = findViewById<ListView>(R.id.foodTypeListView)
        val adapter = ArrayAdapter(this, android.R.layout.simple_list_item_1, foodTypes)
        foodTypeListView.adapter = adapter

        foodTypeListView.onItemClickListener =
            AdapterView.OnItemClickListener { _, _, position, _ ->
                val selectedFoodType = foodTypes[position]
                val intent = Intent(this, FoodListingActivity::class.java)
                intent.putExtra(FoodListingActivity.FOOD_TYPE, selectedFoodType)
                startActivity(intent)
                Log.d("clicked","clicked")
            }
    }
}