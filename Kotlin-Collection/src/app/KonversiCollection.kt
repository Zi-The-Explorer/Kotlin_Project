package app

fun main() {
    val array = arrayOf(1,2,3,4,5)
    val range = 1..50
    val list = range.toList()
    val mutableList = array.toMutableList()
    val set = list.toSet()
    val mutableSet = list.toMutableSet()
    val sortedSet = list.toSortedSet()

    println("this code array ")
    for (ar in array){
        println(ar)
    }
    println("__________________")


    println("this code range ")
    for (r in range){
        println(r)
    }
    println("__________________")

    println("""
        Convert range.toList()
        $list
        ________________________
    """.trimIndent())

    println(mutableList)
    println(set)
    println(mutableSet)
    println(sortedSet)
}