package com.example.dinnerdeciderapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*
import java.util.*
import kotlin.random.Random.Default.nextInt


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        button2.setOnClickListener{
            var foodmenu = arrayOf( "Hamburger", "Pizza",
                                     "Mexican", "American", "Chinese" )
            val randomValue = foodmenu.random()
             textv.text =randomValue
        }
        button1.setOnClickListener {
            var newfood = food.text
            var foodmenu = arrayOf( "Hamburger", "Pizza",
                "Mexican", "American", "Chinese" )
            foodmenu.plusElement(newfood.toString())
        }
    }
}