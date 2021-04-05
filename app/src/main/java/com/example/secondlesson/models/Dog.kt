package com.example.secondlesson.models

class Dog(animalType: String, petName: String): DomesticAnimal(animalType, petName) {
    private val image="https://kb.rspca.org.au/wp-content/uploads/2018/11/golder-retriever-puppy.jpeg";

    override fun makeSound() {
        println("${this.animalType} make sound gav-gav")
    }
}
