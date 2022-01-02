package app

fun main() {
    // List Specific Operator (1)
    val list = listOf("Ozi", "Dinda", "Irna")
    println(list.getOrNull(1)) // Dinda
    println(list.getOrElse(5) {i -> "ups"}) // Ups
    println(list.subList(0, 2)) // [Ozi, Dinda]

    val sortedList = list.sorted()
    println(sortedList)
    println(sortedList.binarySearch("Ozi"))
    println(sortedList.binarySearch("Dinda "))
    println(sortedList.binarySearch("Irna"))

    // List Specific Operator (2)
    val number = listOf(1,1,2,2,3,3,4,4,5,5)
    println(number.indexOf(2))
    println(number.lastIndexOf(3))
    println(number.indexOfFirst { it > 3 })
    println(number.indexOfLast { it > 3 })
}