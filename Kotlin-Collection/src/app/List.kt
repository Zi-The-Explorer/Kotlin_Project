package app

fun main() {
    // Contoh kode list
    // Tipe List ini hanya bisa dibaca
    // Tidak bisa dirubah
    // karna default nya immutable
    val list: List<String> = listOf("Akhmad Fauzi", "Adinda Fatiharki", "Muhammad Zein")
    println(list[0])
    println(list[1])
    println(list[2])
    println(list.isEmpty()) // mengecek apakah data list kosong?
    println(list.indexOf("Adinda Fatiharki")) // Mengecek data ini index keberapa
    println(list.contains("Akhmad Fauzi")) // Apakah ada data ini didalam list
    println(list.containsAll(listOf("Muhammad Zein", "Adinda Fatiharki"))) // Mengecek lebih dari satu apakah ada data tersebut
}