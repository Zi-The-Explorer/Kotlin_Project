package app

/**
 * Buat function Mutable Collection
 */
fun <T> displayMutableCollection(collection: MutableCollection<T>){
    for (item in collection)
        println(item)
}

fun main() {
    displayMutableCollection(mutableListOf("Akhmad Fauzi", "Adinda Fatiharki", "Muhammad Zein"))
    displayMutableCollection(mutableSetOf("Akhmad Fauzi", "Adinda Fatiharki", "Muhammad Zein"))
    displayMutableCollection(mutableMapOf('A' to "Akhmad Fauzi").entries)
}