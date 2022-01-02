package app

fun <T> displayMutableIterable(iterable: MutableIterable<T>) {
    val iterator = iterable.iterator()
    while (iterator.hasNext()){
//        iterator.remove() -> menghapus data di iterasi saat ini
        println(iterator.next())
    }
}

fun main() {
    displayMutableIterable(mutableListOf("Akhmad Fauzi", "Adinda Fatiharki", "Muhammad Zein"))
    displayMutableIterable(mutableSetOf("Akhmad Fauzi", "Adinda Fatiharki", "Muhammad Zein"))
}