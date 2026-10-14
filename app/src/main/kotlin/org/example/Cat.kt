package org.example

class Cat(val name: String, var age: Int, var weight: Int) {

    fun walk(distance: Int = 1) {
        weight -= distance
    }

    fun eat(): Boolean {
        if (weight < 20) {
            weight++
            return true
        }
        return false
    }

    override fun toString(): String {
        return "Name: $name Age: $age"
    }
}
