package com.example.nutriguide

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.TextView


class FoodCategoryAdapter(
    context: Context,
    private val foodTypes: Array<String>
) : ArrayAdapter<String>(context, android.R.layout.simple_list_item_1, foodTypes) {

    override fun getView(position: Int, convertView: View?, parent: ViewGroup): View {
        val view = convertView ?: LayoutInflater.from(context).inflate(android.R.layout.simple_list_item_1, parent, false)
        val textView = view.findViewById<TextView>(android.R.id.text1)
        textView.text = foodTypes[position]
        return view
    }
}
