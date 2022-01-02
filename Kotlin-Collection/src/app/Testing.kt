package app

fun main() {
    val list: List<String> = listOf("Ozi", "Dinda", "Irna")

    /**
     * list.any {condition}
     *
     * mengecek apakah data pada list yang jumlah karakter nya ada yang lebih dari 4
     *
     * true : Karna ada data yang panjang nya lebih dari 4
     */
    val test1 = list.any { it.length > 4 }
    println(test1)


    /**
     * list.none {condition}
     *
     * mengecek apakah tidak ada data yang jumlah karakter nya nya lebih dari 4
     *
     * false : Karna ada data yang panjang nya lebih dari 4
     */

    val test2 = list.none { it.length > 4 }
    println(test2)


    /**
     * list.all {condition}
     *
     * mengecek apakah Semua data di list jumlah karakter nya lebih dari 4
     *
     * false : Karna tidak semua data yang jumlah karakternya lebih dari 4
     */
    val test3 = list.all { it.length > 4 }
    println(test3)

    /**
     * list.any()
     *
     * mengecek apakah di list ada datanya?
     *
     * true : karena ada
     */
    val test4 = list.any()
    println(test4)

    /**
     * list.none()
     *
     * mengecek apakah di list datanya kosong / tidak ada?
     *
     * false : karena data nya ada
     */
    val test5 = list.none()
    println(test5)
}