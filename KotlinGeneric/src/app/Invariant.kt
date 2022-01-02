package app

class Invariant <T>(val data: T)

fun main() {

    val data1: Invariant<String> = Invariant("Data Satu")

//    val data2: Invariant<Any> = data1 // Bisa
//    data2.data = 100 // Tapi bahaya



}