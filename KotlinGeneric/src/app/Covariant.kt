package app

class Covariant<out T>(val data: T) {
    fun data(): T {
        return data
    }

    // Tidak boleh membuat function dengan input generic function
//    fun setData(param: T) {
//        data = param
//    }
}

fun main() {
    val data1: Covariant<String> = Covariant("Data Satu")
    val data2: Covariant<Any> = data1 // Bisa di subtitusi dari data1 , Karna menggunakan covariant

    println(data2.data())

//    println(data2.setData(100)) //  Tidak boleh
}

// Covariant Generic di tandai dengan kata kunci out
// Parameter Constructor pada class tidak boleh menggunakan var
// tidak bisa menerima input Generic T didalam parameter function
// Bisa Mengembalikan Generic T pada function hanya di return Value

