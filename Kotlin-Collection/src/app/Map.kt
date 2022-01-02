package app

fun main() {


    val map: Map<Char, String> = mapOf(
        Pair('A', "Akhmad Fauzi"),
        'D' to "Adinda Fatiharki",
        'M' to "Muhammad Zein"
    )

    // Mendapatkan keys dan value
//    println("This is Key    : ${map.keys}")
//    println("This is values : ${map.values}")

//    println()

    println("This Pair Key and Value")
    for ((key, value ) in map) {
        println("$key to $value")
    }

//    println(map.entries)
}