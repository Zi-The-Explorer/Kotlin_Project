package app

fun main() {
    /**
     * Biasa nya untuk melakukan iterasi menggunakan for untuk mencetak data di list / array
     */
//    for (value in listOf("Ozi", "Dinda", "Zein")) {
//        println(value)
//    }

    /**
     * Lebih simple dari for
     */
    listOf("Ozi", "Dinda", "Zein").forEach {
        println(it)
    }

    /**
     * Mencetak Index dan data value nya
     */
    mutableListOf("Ozi", "Dinda", "Zein").forEachIndexed { index, value ->
        println("$index : $value")
    }
}