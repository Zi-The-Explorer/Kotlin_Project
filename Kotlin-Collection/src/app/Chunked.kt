package app

fun main() {
    val range = (1..100).toList()

    val list1 = range.chunked(10)
    println(list1)

    val list2 = range.chunked(10) { list: List<Int> ->
        var total = 0
        for (number in list) {
            total += number
        }
        total
    }
    println(list2)
}