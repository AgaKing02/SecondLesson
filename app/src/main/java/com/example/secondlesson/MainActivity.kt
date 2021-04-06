package com.example.secondlesson

import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.ImageView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.example.secondlesson.models.Dog
import com.example.secondlesson.models.Tiger
import com.google.firebase.database.FirebaseDatabase


class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val wildAnimal = findViewById(R.id.wild) as Button
        val domesticAnimal = findViewById(R.id.domestic) as Button

        val database = FirebaseDatabase.getInstance()
        val myRef = database.getReference("animals")



        wildAnimal.setOnClickListener(View.OnClickListener { v: View? ->

            val wild: Tiger = Tiger("Siberian");
            myRef.setValue(wild)


            val toast = Toast(this)
            val view = ImageView(this)
            view.setImageResource(R.drawable.tiger)
            toast.setView(view)
            toast.show()

            Toast.makeText(this, "You have chosen " + wild.animalType, Toast.LENGTH_LONG).show()

        })

        domesticAnimal.setOnClickListener(View.OnClickListener { v: View? ->
            val dog: Dog = Dog("Fluppy", "Zheke")

            myRef.setValue(dog)


            val toast = Toast(this)
            val view = ImageView(this)
            view.setImageResource(R.drawable.dog)
            toast.setView(view)
            toast.show()

            Toast.makeText(this, "You have chosen " + dog.animalType, Toast.LENGTH_LONG).show()
        })


    }
}