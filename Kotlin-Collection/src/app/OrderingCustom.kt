package app

data class Fruit (val name: String, val quantity: Int)

fun main() {
    val fruits = listOf(
        Fruit("Apple", 10),
        Fruit("Orange", 5),
        Fruit("Banana", 7)
    )

    // Asc
    println(fruits.sortedBy { it.quantity })

    // Desc
    println(fruits.sortedByDescending { it.quantity })

    println(fruits.sortedWith(compareBy { it.quantity }))

    println(fruits.sortedWith(compareByDescending { it.quantity }))

    println(fruits.sortedWith(Comparator { fruit1, fruit2 -> fruit1.quantity.compareTo(fruit2.quantity) }))
}