package com.example.nutriguide



/**
 *  RecycleView.
 *  Will contain buttons to the FoodDetailActivity.
 */
import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class FoodListingActivity : AppCompatActivity() {

    companion object {
        const val FOOD_TYPE = "foodType"
    }

    private lateinit var foodListingAdapter: FoodListingAdapter
    private lateinit var tvNoFoodsFound: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_food_listing)

        tvNoFoodsFound = findViewById(R.id.tvNoFoodsFound)

        val selectedFoodType = intent.getStringExtra(FOOD_TYPE)

        val filteredFoods = Foods.FOODS.filter { it.type == selectedFoodType }

        val recyclerView = findViewById<RecyclerView>(R.id.foodListView)
        val layoutManager = LinearLayoutManager(this)
        foodListingAdapter = FoodListingAdapter(filteredFoods)
        recyclerView.layoutManager = layoutManager
        recyclerView.adapter = foodListingAdapter

        checkAndShowNoFoodsMessage(filteredFoods)
    }

    private fun checkAndShowNoFoodsMessage(foods: List<Food>) {
        tvNoFoodsFound.visibility = if (foods.isEmpty()) TextView.VISIBLE else TextView.GONE
    }
}