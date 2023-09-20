package com.example.dashboardapp

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import androidx.cardview.widget.CardView

class MainActivity : AppCompatActivity(), View.OnClickListener {

    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val clothingCard = findViewById<CardView>(R.id.clothingCard)
        val beautyCard = findViewById<CardView>(R.id.beautyCard)
        val electronicsCard = findViewById<CardView>(R.id.electronicsCard)
        val homeCard = findViewById<CardView>(R.id.homeCard)
        val pharmacyCard = findViewById<CardView>(R.id.pharmacyCard)
        val groceryCard = findViewById<CardView>(R.id.groceryCard)

        clothingCard.setOnClickListener(this)
        beautyCard.setOnClickListener(this)
        electronicsCard.setOnClickListener(this)
        homeCard.setOnClickListener(this)
        pharmacyCard.setOnClickListener(this)
        groceryCard.setOnClickListener(this)
        }
        /*clothingCard.setOnClickListener {
            val intent = Intent(this@MainActivity, ClothingActivity::class.java)
            startActivity(intent)
        }*/

    override fun onClick(v: View?) {

        when(v!!.id){
            R.id.clothingCard -> {val i = Intent(this, ClothingActivity::class.java)
            startActivity(i)}
            R.id.homeCard -> {val i = Intent(this, HomeActivity::class.java)
                startActivity(i)}
            R.id.beautyCard -> {val i = Intent(this, BeautyActivity::class.java)
                startActivity(i)}
            R.id.pharmacyCard -> {val i = Intent(this, PharmacyActivity::class.java)
                startActivity(i)}
            R.id.groceryCard -> {val i = Intent(this, GroceriesActivity::class.java)
                startActivity(i)}
            R.id.electronicsCard -> {val i = Intent(this, ElectronicsActivity::class.java)
                startActivity(i)}
        }
    }

}
