package com.example.secondlesson.models

open class DomesticAnimal(override val animalType: String, open val petName: String) : Animal() {
    override fun makeSound() {
        println("Make DomesticAnimal sound")
    }
}
