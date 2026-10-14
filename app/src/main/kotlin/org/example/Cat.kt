package org.example

class Cat(val name: String, var age: Int, var weight: Int) {

    fun walk(distance: Int = 1) {
        weight -= distance
    }

    // returns the ammount of eaten food, might be less than the input ammount!!!
    fun eat(ammount: Int = 1): Int {
        weight += ammount
        if (weight < 20) {
            return ammount
        } else {
            var ret = weight - 20
            weight = 20
            return ret
        }
    }

    override fun toString(): String {
        return "Name: $name Age: $age Weight: $weight"
    }
}
