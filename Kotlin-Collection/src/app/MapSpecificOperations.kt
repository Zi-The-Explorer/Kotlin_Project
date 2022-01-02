package app

fun main() {
    val map = mapOf("a" to "Ozi", "b" to "Dinda", "c" to "Irna")
    println(map.getValue("a")) // Ozi
    println(map.getOrElse("d") {"Ups"}) // Ups
    println(map.filter { (key, value) -> value.length > 3 })
    println(map.filterKeys { key -> key > "b" })
    println(map.filterValues { value -> value.length > 3 })
}