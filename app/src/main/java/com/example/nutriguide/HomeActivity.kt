package com.example.nutriguide

import java.util.*
import android.app.AlertDialog
import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.LinearLayout
import android.widget.SearchView
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import kotlin.reflect.full.*


/**
 *  Will contain the search bar, button to the FoodCategoryActivity, about, contact, etc.
 */
class HomeActivity : AppCompatActivity() {
    private lateinit var categoryButton: Button
    private lateinit var contactButton: Button
    private lateinit var buttonToggle: Button
    private lateinit var layoutInfo: LinearLayout

    private lateinit var searchView: SearchView
    private lateinit var recycleView: RecyclerView
    private lateinit var homeAdapter: HomeAdapter
    private var foodList: List<Food> = listOf()


    override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)
    setContentView(R.layout.activity_home)

        searchView = findViewById(R.id.searchBarHome)
        recycleView = findViewById(R.id.recycleViewHome)
        searchView.clearFocus()

        homeAdapter = HomeAdapter(foodList)
        recycleView.layoutManager = LinearLayoutManager(this)
        recycleView.adapter = homeAdapter

        setupSearchView()


        buttonToggle = findViewById(R.id.aboutBtnToggle)
        layoutInfo = findViewById<LinearLayout>(R.id.layoutInfo)
        categoryButton = findViewById(R.id.btnCategory)
        contactButton = findViewById(R.id.btnContact)

        //Logout button
        val logoutButton = findViewById<Button>(R.id.logoutButton)

        //About Nutriguide Toggle to show and hide info
        buttonToggle.setOnClickListener {
            if (layoutInfo.visibility == View.GONE) {
                layoutInfo.visibility = View.VISIBLE
                buttonToggle.text = "Hide Info"
            } else {
                layoutInfo.visibility = View.GONE
                buttonToggle.text = "About NutriGuide"
            }
        }

        categoryButton.setOnClickListener {
            val intentCatBtn = Intent(this, FoodCategoryActivity::class.java)
            startActivity(intentCatBtn)
        }

        contactButton.setOnClickListener {
            val intent2 = Intent(this, ContactActivity::class.java)
            startActivity(intent2)
        }

        logoutButton.setOnClickListener {
            showLogoutConfirmationDialog()
        }
    }
    private fun setupSearchView() {
        searchView.setOnQueryTextListener(object : SearchView.OnQueryTextListener {
            override fun onQueryTextSubmit(query: String?): Boolean {
                query?.let { filterData(it) }
                return true
            }

            override fun onQueryTextChange(newText: String?): Boolean {
                newText?.let { filterData(it) }
                return true
            }
        })
    }

    private fun filterData(query: String) {
        val filteredList = foodList.filter {

                    it.name.contains(query, ignoreCase = true) ||
                    it.type.contains(query, ignoreCase = true) ||
                    it.description.contains(query, ignoreCase = true)
        }
        if (filteredList.isNotEmpty() || query.isNotEmpty()) {
            recycleView.visibility = View.VISIBLE
        } else {
            recycleView.visibility = View.GONE
        }
        homeAdapter.updateItems(filteredList)
    }

    private fun showLogoutConfirmationDialog() {
        val builder = AlertDialog.Builder(this)
        builder.setTitle("Log Out")
        builder.setMessage("Are you sure you want to log out?")

        builder.setPositiveButton("Yes") { dialog, which ->
            // Implement your log-out logic here
            performLogout()
        }

        builder.setNegativeButton("No") { dialog, which ->
            dialog.dismiss()
        }

        val dialog: AlertDialog = builder.create()
        dialog.show()
    }

    private fun performLogout() {
        // Clear session data
        val sharedPreferences = getSharedPreferences("YourSharedPrefs", Context.MODE_PRIVATE)
        val editor = sharedPreferences.edit()
        editor.clear()
        editor.apply()

        // Navigate to the login activity
        val intent = Intent(this, MainActivity::class.java)
        startActivity(intent)
        finish() // Close the current activity
    }



}



