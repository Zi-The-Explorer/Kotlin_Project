package app

fun main() {
    val list1: List<String> = listOf("Ozi", "Dinda", "Irna")

    /**
     * Melakukan filter terhadap data list
     *
     * Tapi tidak akan menghilangkan data awal, karna filtering hanya membuat data baru
     *
     * dan memasukan kondisi didalam lambda expression
     *
     * Kondisi dimana mencari data name yang panjang nya lebih dari atau samadengan 5 karakter
     */
    val list2 = list1.filter { it.length >= 5 }
    println(list2)

    // Data lama masih ada
    println(list1)

    /**
     * filterIndexed()
     *
     * Mengambil data melalui index yang genap saja
     *
     * hasil dari kondisi modulo
     */
    val list3 = list1.filterIndexed { index, value -> index % 2 == 0  }
    println(list3)

    /**
     * buat list yang bisa menampung data dengan tipe data apa saja dan bisa null?
     */
    val list4: List<Any?> = listOf(null, 1, "Ozi", "Dinda", "Irna", 2, null)

    /**
     * untuk mengambil data tertentu
     *
     * menggunakan filterIsInstance<TipeData>()
     */
    val dataStringOnly = list4.filterIsInstance<String>()
    println(dataStringOnly)
    val dataIntOnly = list4.filterIsInstance<Int>()
    println(dataIntOnly)

    /**
     *
     * Untuk mengambil data yang bukan null
     *
     * Menggunakan filterNotNull()
     *
     */
    val listDataNotNull = list4.filterNotNull()
    println(listDataNotNull)



}