package com.example.dashboardapp

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.cardview.widget.CardView

class MainActivity : AppCompatActivity() {

    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val clothingCard = findViewById<CardView>(R.id.clothingCard)
        val homeCard = findViewById<CardView>(R.id.homeCard)
        clothingCard.setOnClickListener {
            val intent = Intent(this@MainActivity, ClothingActivity::class.java)
            startActivity(intent)
        }
        homeCard.setOnClickListener {
            val intent = Intent(this@MainActivity, MapActivity::class.java)
            startActivity(intent)
        }
    }
}