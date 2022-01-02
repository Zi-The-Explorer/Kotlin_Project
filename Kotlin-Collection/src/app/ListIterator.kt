package app

fun <T> displayListIterator(listIterator: ListIterator<T>) {
    /**
     * Mengatur display secara maju
     */
    println("Display Next")
    while (listIterator.hasNext()) println(listIterator.next())

    println()

    println("Display Previous")
    /**
     * Mengatur display secara mundur
     */
    while (listIterator.hasPrevious()) println(listIterator.previous())
}

fun main() {
    displayListIterator(listOf("Akhmad Fauzi", "Adinda Fatiharki", "Muhammad Zein").listIterator())
}