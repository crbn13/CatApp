package org.example

class MenuObj(
    val data: Map<String, Any>,
    val title: String = ""
)

class Functor(val callback: () -> Unit) {
    fun map(): Unit {
        callback()
    }
}

class Cli(val menu: MenuObj) {
    private val rootMenu = menu
    private var currentMenu: Any = menu
    private var previousMenu = menu
    private var running = true

    private fun getInput(): Int {
        var inp = readln()
        if (inp.length == 1) {
            return inp[0].code - 'a'.code
        } else {
            throw Exception("Not implemeted, or wrong input")
        }

    }

    private fun printMenu(menu: MenuObj) {
        var ind = 0 //int
        println("Type the letter in the [] to select the menu option")
        for (i in menu.data.keys) {
            println(
                "[%c] %s".format(('a'.code + ind).toChar(), i)
            )
            ind++
        }

    }

    fun start() {
        while (running)
            when (currentMenu) {
                is MenuObj -> {
                    printMenu(currentMenu as MenuObj)
                    val ind = getInput()
                    println(ind)
                    previousMenu = currentMenu as MenuObj
                    currentMenu = (currentMenu as MenuObj).data.entries.elementAt(ind).value
                }

                is Functor -> {
                    val callback = currentMenu as Functor
                    callback.callback()
                    currentMenu = previousMenu
                }

                else -> throw Exception("RAHHH")
            }


    }
}
