package app

fun main() {
    val chars = ('a'..'z').toList()
    println(chars)
    println()

    println(chars.take(3))
    println(chars.takeLast(3))
    println(chars.takeWhile { it < 'f' })
    println(chars.takeLastWhile { it > 'w' })

    println()

    println(chars.drop(3))
    println(chars.dropLast(3))
    println(chars.dropWhile { it < 'f' })
    println(chars.dropLastWhile { it > 'w' })
}