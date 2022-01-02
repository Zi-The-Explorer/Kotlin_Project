package app

fun main() {
    val numbers = listOf(1,4,3,5,2,6)

    val sortedAsc = numbers.sorted()
    val sortedDesc = numbers.sortedDescending()


    println(sortedAsc)
    println(sortedDesc)
}