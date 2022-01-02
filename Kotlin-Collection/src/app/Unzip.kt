package app

fun main() {

    /**
     * Melakukan Unzip
     *
     * Melakukan Pemecahan data
     */
    val list: List<Pair<String, String>> = listOf(
        "Ozi" to "Dinda",
        "Zein" to "Laila",
        "Godel" to "Irna"
    )

    /**
     * Cara pertama
     */
    val pair: Pair<List<String>, List<String>> = list.unzip()
    println("This pair first: ${pair.first}")
    println("This pair second: ${pair.second}")

    println()

    /**
     * Cara kedua
     */
    val (list1, list2) = list.unzip()
    println("This pair first: $list1")
    println("This pair second: $list2")
}