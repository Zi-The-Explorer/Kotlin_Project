package app

import java.util.*

fun main() {
    val list: List<String> = listOf("Ozi", "Dinda", "Zein")

    /**
     * Manual
     *
     * Tanpa menggunakan Mapping
     *
     * Untuk merubah data list ke Uppercase
     */
//    val temp = mutableListOf<String>()
//    for (value in list) {
//        temp.add(value.uppercase(Locale.getDefault()))
//    }
//    val list2 = temp.toList()
//    println(list2)


    /**
     * Lebih Simple
     * Menggunakan Mapping
     */
//    val list2 = list.map { value -> value.uppercase(Locale.getDefault()) }
    val list2 = list.map { it.uppercase(Locale.getDefault()) }
    println(list2)

    val set = setOf("OZi", "Dinda", "Zein")
    val set2 = set.map { it.lowercase(Locale.getDefault()) }
    println(set2)

    /**
     * mapIndexedNotNull
     *
     * Sebuah operation filtering
     *
     * Mengambil data dengan index yang ganjil
     */
    val names = listOf<String>("Ozi", "Dinda", "Zein", "Emon", "Godel", "Eko", "Jadul")
    val namesGanjil = names.mapIndexedNotNull { index, name ->
        if (index % 2 == 0)  null
        else name
    }
    println(namesGanjil)

    val number = (1..100).toList()
    val ganjil = number.mapNotNull {
        if (it % 2 == 0) null
        else it
    }
    println(ganjil)
}

// Setiap turunan collection iterable, bisa menggunakan Mapping