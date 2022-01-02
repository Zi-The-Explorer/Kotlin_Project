package app

import data.Function

fun main() {
    val function = Function("Akhmad Fauzi")


    // Di bawah ini adalah semua cara mengakses Generic pada function

    function.sayHello<String>("Dinda")
    function.sayHello("Zein")

    function.sayHello<Int>(24)
    function.sayHello(25)
}