package com.example.secondlesson.models

class Tiger(override val animalType: String) : WildAnimal() {
    public val image="https://upload.wikimedia.org/wikipedia/commons/b/b9/P.t.altaica_Tomak_Male.jpg";

    override fun makeSound() {
        println("${this.animalType} make sound")
    }

}