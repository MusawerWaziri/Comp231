package com.example.nutriguide

import android.content.Intent
import android.os.Handler
import android.os.Looper
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.squareup.picasso.Callback
import com.squareup.picasso.Picasso
import java.io.IOException


class FoodListingAdapter(private val foods: List<Food>) :
    RecyclerView.Adapter<FoodListingAdapter.FoodViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): FoodViewHolder {
        val itemView = LayoutInflater.from(parent.context)
            .inflate(R.layout.item_food, parent, false)
        return FoodViewHolder(itemView)
    }

    override fun onBindViewHolder(holder: FoodViewHolder, position: Int) {
        val currentFood = foods[position]
        holder.bind(currentFood)
    }

    override fun getItemCount(): Int {
        return foods.size
    }

    inner class FoodViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        private val foodNameTextView: TextView = itemView.findViewById(R.id.tvName)
        private val foodImageView: ImageView = itemView.findViewById(R.id.ivImage)

        fun bind(food: Food) {
            foodNameTextView.text = food.name


            // Load the image from the URL with retry logic
            loadImageWithRetry(food.image, foodImageView)

            foodImageView.setOnClickListener {
                openFoodDetail(food) //should be FoodDetails
            }
        }

        private fun openFoodDetail(food: Food) {
            val intent = Intent(itemView.context, FoodDetailActivity::class.java)
            intent.putExtra("selectedFood", food)
            itemView.context.startActivity(intent)
        }

        //loading image from the internet
        private fun loadImageWithRetry(url: String, imageView: ImageView) {
            val picasso = Picasso.get()

            val callback = object : Callback {
                override fun onSuccess() {
                    // Image loaded successfully
                }

                override fun onError(e: Exception?) {
                    // Error loading image, handle retry logic here
                    if (e is IOException) {
                        // Retry loading the image after a delay
                        Handler(Looper.getMainLooper()).postDelayed({
                            picasso.load(url)
                                .resize(
                                    500,
                                    500
                                ) // Replace with the desired dimensions of the ImageView
                                .centerCrop()
                                .placeholder(R.drawable.placeholder_image)
                                .error(R.drawable.ic_error_placeholder)
                                .into(imageView, this)
                        }, 3000) // Retry after 3 seconds (adjust the delay as needed)
                    } else {
                        Log.e("Picasso", "Error loading image: ${e?.message}")
                    }
                }
            }

            try {
                picasso.load(url)
                    .resize(500, 500) // Replace with the desired dimensions of the ImageView
                    .centerCrop()
                    .placeholder(R.drawable.placeholder_image)
                    .error(R.drawable.ic_error_placeholder)
                    .into(imageView, callback)
            } catch (e: Exception) {
                Log.e("Picasso", "Error loading image: ${e.message}")
            }
        }
    }
}