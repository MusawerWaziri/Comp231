package com.example.nutriguide

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.squareup.picasso.Picasso


/**
 *  Will contain image of the food, recipe, instruction, and health benefits, etc.
 */
class FoodDetailActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_food_detail)



       val food = intent.getSerializableExtra("selectedFood") as? Food


        if(food != null){
            //Set data to views
            val detailImage = findViewById<ImageView>(R.id.iv_image_detail)
            Picasso.get().load(food.image)
                .error(R.drawable.placeholder_image)
                .into(detailImage)
            findViewById<TextView>(R.id.tv_name_detail).text = food.name
            findViewById<TextView>(R.id.tv_description_detail).text = food.description
            findViewById<TextView>(R.id.tv_recipe_detail).text = food.recipe
            findViewById<TextView>(R.id.tv_nutrition_detail).text = food.nutrition

        }else {
            Toast.makeText(this, "Food data not available", Toast.LENGTH_SHORT).show()
        }


    }

}





