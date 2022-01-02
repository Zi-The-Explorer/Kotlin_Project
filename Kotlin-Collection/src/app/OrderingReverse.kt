package app

fun main() {
    val list1 = mutableListOf("Ozi", "Adinda", "Irna")
    val listReverse = list1.reversed()
    val listAsReversed = list1.asReversed()

    list1.add("Programmer")

    println(listReverse) // [Irna, Adinda, Ozi]
    println(listAsReversed) // [Programmer, Irna, Adinda, Ozi]
}