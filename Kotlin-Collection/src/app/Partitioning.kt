package app

fun main() {
    val list: List<String> = listOf("Ozi", "Dinda", "Irna")


    /**
     * membuat partition code
     *
     * partition tidak akan menghilangkan data namun membagi
     */
//    val pair: Pair<List<String>, List<String>> = list.partition { it.length >= 5 }

    /**
     * Ringkas code dengan destructuring
     *
     * jika kondisi partition didalam lambda terpenuhi(true) akan masuk kedalam paramter pertama listMatch
     *
     * Jika kondisi false akan masuk ke parameter kedua listNotMatch
     */
    val (listMatch, listNotMatch) = list.partition { it.length >= 5 }

    println(listMatch)
    println(listNotMatch)


}