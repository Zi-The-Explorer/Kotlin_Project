package app

class Application(map: Map<String, Any>) {
    val name: String by map
    val version: Any by map
}

fun main() {
    val application = Application(mapOf(
        "name" to "Belajar kotlin",
        "version" to 1.0
    ))

    println(application.name)
    println(application.version)
}