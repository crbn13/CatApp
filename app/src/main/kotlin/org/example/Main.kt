package org.example

fun main() {
    val binnie = Cat("Binnie", 10, 10)
    val clyde = Cat("Clyde", 5, 6)
    binnie.walk()
    clyde.walk()
    println(binnie)
    println(clyde)

    for (x in 1..100) {
        clyde.eat(2)
        println(clyde)
    }

    var student = Student("124", "bob", "soso", 323.0)
    println(student)

}
