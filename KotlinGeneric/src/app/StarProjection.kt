package app

// Membuat function dengan parameter array
// Array sudah pasti Generic
// masukan bintang pada Generic type Array artinya tida peduli dengan tipe data Generic nya
// hanya ingin menampilkan panjang array nya
fun displayLength(array: Array<*>) {
    println("Length Array is ${array.size}")
}

fun main() {
    val arrayInt = arrayOf(1,2,3,4,5,6)
    val arrayString = arrayOf("Akhmad", "Fauzi")
    displayLength(arrayInt)
    displayLength(arrayString)
}