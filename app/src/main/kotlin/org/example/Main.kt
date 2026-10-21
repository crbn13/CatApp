package org.example

fun main() {

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
