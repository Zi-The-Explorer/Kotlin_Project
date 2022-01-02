package app

fun main() {
    val list1 = listOf("a", "a", "b", "b", "c", "c")
    val grouping: Grouping<String, String> = list1.groupingBy { it }

    println("EachCount:  ${grouping.eachCount()}")

    println("Fold: ${grouping.fold("") { accumulator, element -> accumulator + element }}")

    println("Reduce: ${grouping.reduce { key, accumulator, element -> accumulator + element }}")

    println("Aggregate: ${grouping.aggregate { key, accumulator: String?, element, first ->
        if (first) element
        else accumulator + element
    }}")
}