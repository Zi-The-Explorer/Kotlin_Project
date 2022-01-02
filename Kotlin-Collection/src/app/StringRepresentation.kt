package app

import java.lang.Appendable
import java.util.*

fun main() {
    val list: List<String> = listOf("Ozi", "Dinda", "Irna")

    /**
     * String tambahan
     *
     * Separator: Di tengah tengah kalimat untuk misahkan kata
     *
     * prefix: Untuk menambahkan String Di Awal Kalimat
     *
     * postfix: Untuk menambahkan String Di Akhir Kalimat
     */
    val string1: String = list.joinToString(" ", "|", "|")
    println(string1)

    /**
     * Menambahkan transformation di dalam lambda
     *
     * Transformation String ke UpperCase
     */
    val string2: String = list.joinToString(" ", "|", "|") { it.uppercase(Locale.getDefault()) }
    println(string2)

    /**
     * Untuk membuat String Representasi berkali kali dengan string yang berbeda dengan joinTo() yang berisi Appandable
     *
     * Membutuhkan StringBuilder()
     *
     * Maka Data List Akan dibuat berkali kali dengan string representation menggunakan jointTo() dan Appandable nya -> StringBuilder()
     */
    val builder = StringBuilder()
    list.joinTo(builder," ", "|", "|")
    list.joinTo(builder," ", ">", "<")
    list.joinTo(builder," ", "@", "@")
    val string3 = builder.toString()
    println(string3)

    /**
     * Menggunakan Tipe data Integer
     */
    val number: List<Int> = (1..10).toList()
    println(number.joinToString(">"))

}

// String Representation tidak hanya di definisikan hanya untuk String
// Bisa tipe data yang lain, karna kembalian nya adalah tipe generic iterable <T>