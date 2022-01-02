package app

fun main() {
    val range = (1..100).toList()

    println(range.contains(5)) // true
    println(range.containsAll(listOf(3,4,5))) // true
    println(range.isEmpty()) // false
    println(range.isNotEmpty()) // true
}