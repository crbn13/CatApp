package org.example

import java.util.Dictionary

class MenuObj(val data: Dictionary<String, MenuObj?>, val callback: (() -> Unit), val title: String?) {

    public fun isCallback(): Boolean {
        if (callback != null)
            return true
        return false
    }

}

class Cli(menu: MenuObj) {

}
