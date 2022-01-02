package app

fun main() {
    /**
     * Buat list untuk di konversi menjadi Map
     */
    val list = listOf("Ozi", "Zein", "Emon")

    /**
     * Melakukan konversi list menjadi Map
     *
     * Tipe Map nya : Tipe Key nya String diambil dari data List | dan Tipe value nya Int diambil dari data list panjang nya
     *
     * Map<V, K> = list.associate {value -> Pair(value, value.length)}
     *
     * Untuk Transformasi Wajib menggunakan Pair()
     */
    val map1: Map<String, Int> = list.associate { value -> Pair(value, value.length) }
    println(map1)

    /**
     * Atau bisa menggunakan it pada value lambda nya
     *
     * Lebih Ringkas
     */
    val map2: Map<String, Int> = list.associate { Pair(it, it.length) }
    println(map2)

    /**
     * Tidak menggunakan Pair juga bisa
     *
     * hanya mengambil value panjangnya, key nya otomatis mengambil dari data list
     *
     * Lebih ringkas
     */
    val map3: Map<String, Int> = list.associateWith { it.length }
    println(map3)

    /**
     * Jika data list nya ingin dijadikan value nya
     *
     * kita hanya mengambil key nya dari list panjang nya, it.length
     */
    val map4: Map<Int, String> = list.associateBy { it.length }
    println(map4)
}