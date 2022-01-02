package app

fun <T> displayMutableIterable(iterable: Iterable<T>) {
    val iterator = iterable.iterator()
    while (iterator.hasNext()){
        println(iterator.next())
    }
}

fun main() {
    displayMutableIterable(listOf("Akhmad Fauzi", "Adinda Fatiharki", "Muhammad Zein"))
    displayMutableIterable(setOf("Akhmad Fauzi", "Adinda Fatiharki", "Muhammad Zein"))
}