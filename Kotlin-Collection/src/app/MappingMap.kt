package app

import java.util.*

fun main() {
    val map: Map<Int, String> = mapOf(
        1 to "Ozi",
        2 to "Dinda",
        3 to "Zein",
        4 to "Godel",
        5 to "Emon",
        6 to "Eko"
    )

    val mapKeys = map.mapKeys { it.key * 10 }
    println(mapKeys)

    val mapValues = map.mapValues { it.value.uppercase(Locale.getDefault()) }
    println(mapValues)
}