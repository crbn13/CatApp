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

    var student = Undergraduate("124", "bob", "soso", 323.0)
    println(student)
    student.mark = 23.0
    println(student)
    student.mark = 234723.0
    println(student)

    var menu = Cli(
        MenuObj(
            mapOf(
                "hello world main menu 1" to Functor({ println("IM A LANMNBMDA") }),
                "hello world 2 electric boogaloo" to 0,
            )
        )
    )
    menu.start()

}
