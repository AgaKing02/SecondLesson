package com.example.secondlesson

import android.content.Intent
import android.os.Bundle
import android.view.Gravity
import android.view.View
import android.widget.Button
import android.widget.ImageView
import android.widget.LinearLayout
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.example.secondlesson.models.Dog
import com.example.secondlesson.models.Tiger

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val wildAnimal=findViewById(R.id.wild) as Button
        val domesticAnimal=findViewById(R.id.domestic) as Button


        wildAnimal.setOnClickListener(View.OnClickListener { v: View? ->

            val wild:Tiger= Tiger("Siberian");


            val toast = Toast.makeText(applicationContext, wild.animalType, Toast.LENGTH_LONG)
            toast.setGravity(Gravity.CENTER, 0, 0)

            val toastContainer = toast.view as LinearLayout
            val catImage = ImageView(this)
            catImage.setImageResource(R.drawable.tiger)
            toastContainer.addView(catImage, 0)
            toast.show()

        })

        domesticAnimal.setOnClickListener(View.OnClickListener { v: View? ->
            val dog:Dog=Dog("Fluppy","Zheke")

            val toast = Toast.makeText(applicationContext, dog.petName, Toast.LENGTH_LONG)
            toast.setGravity(Gravity.CENTER, 0, 0)

            val toastContainer = toast.view as LinearLayout
            val catImage = ImageView(this)
            catImage.setImageResource(R.drawable.dog)
            toastContainer.addView(catImage, 0)
            toast.show()
        })





    }
}