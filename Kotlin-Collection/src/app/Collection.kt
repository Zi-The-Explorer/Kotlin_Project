package app

fun <T> displayCollection(collection: Collection<T>) {
    for (item in collection)
        println(item)
}

fun main() {
    displayCollection(listOf("Akhmad Fauzi", "Adinda Fatiharki", "Muhammad Zein"))
    displayCollection(setOf("Akhmad Fauzi", "Adinda Fatiharki", "Muhammad Zein"))
    displayCollection(mapOf('A' to "Akhmad Fauzi").entries)

    /**
     * Error
     * Map bukan turunan collection
     */
//    displayCollection(mapOf('A' to "Akhmad Fauzi"))

}