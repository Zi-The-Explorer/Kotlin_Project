package app

fun main() {



    val mutableMap: MutableMap<Char, String> = mutableMapOf()

    /**
     * put(K, V) untuk menambahkan data key dan value
     */
    mutableMap.put('A', "Akhmad Fauzi")
    mutableMap['D'] = "Adinda Fatiharki"
    mutableMap['M'] = "Muhammad Zein"

    /**
     * get(K) Untuk mengambil data di MutableMap berdasarkan Key nya
     * */
    println(mutableMap.get('A'))
    println(mutableMap['D'])
    println(mutableMap['M'])

    /**
     * getOrderDefault() Memungkinkan untuk mengambil data namun data tidak ada, maka defaultValue Akan Dicetak
     */
    println(mutableMap.getOrDefault('X', "Data NotFound"))

    /**
     * Menghapus data berdasarkan Key
     */
    mutableMap.remove('M')

    for ((key, value ) in mutableMap) {
        println("$key to $value")
    }


}