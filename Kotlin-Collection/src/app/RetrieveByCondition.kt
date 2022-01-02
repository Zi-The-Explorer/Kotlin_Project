package app

fun main() {
    val range = (1..20).toList()

    println(range.first { it > 10 }) // 11
    println(range.last { it > 10 }) // 20
    println(range.firstOrNull { it > 50 }) // null
    println(range.lastOrNull { it > 50 }) // null
    println(range.find { it > 50 }) // null
    println(range.findLast { it > 50 }) // null
}