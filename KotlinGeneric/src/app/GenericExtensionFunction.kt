package app

// Membuat class Data<T>, Dia adalah Generic
// buat property constructor nya
class Data<T>(val data: T)

fun Data<String>.print() {
    val data = this.data
    println("String value is $data")
}
fun Data<Int>.printInt() {
    val data = this.data
    println("Integer value is $data")
}

fun main() {
    val data1: Data<Int> = Data(1)
    val data2: Data<String> = Data("Fauzi")

    data2.print()
    data1.printInt()
}