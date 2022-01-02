package app

fun main() {
    // Cara Pair 1
    val pair1: Pair<String, String> = Pair("Akhmad", "Fauzi")
    println(pair1.first)
    println(pair1.second)

    // Cara Pair 2
    val pair2: Pair<String, String> = "Akhmad" to "Fauzi"
    println(pair1.first)
    println(pair1.second)
}