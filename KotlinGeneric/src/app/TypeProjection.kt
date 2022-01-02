package app

// Class dengan type Generic invariant
class Container<T>(var data: T)


fun copy(from: Container<out Any>, to: Container<Any>) {
    to.data = from.data
}

fun main() {
    val data1 = Container("Data Satu")
    val data2: Container<Any> = Container("Data Dua")
    copy(data1, data2)

    println(data1.data)
    println(data2.data)
}