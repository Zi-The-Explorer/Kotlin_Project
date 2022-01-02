package app

fun main() {
    // This not Sequence Code Programs
//    val words = "The Quick brown fox jumps over the lazy dog".split(" ")
//    val lengthsList = words
//        .filter { println("filter: $it"); it.length > 3 }
//        .map { println("length: ${it.length}"); it.length }
//        .take(4)
//
//    println("Lengths of first 4 word longer than 3 chars:")
//    println(lengthsList)

    // This use Sequence Code Programs
    val words = "The Quick brown fox jumps over the lazy dog".split(" ")
    val wordSequence = words.asSequence()
    val lengthsList = wordSequence
        .filter { println("filter: $it"); it.length > 3 }
        .map { println("length: ${it.length}"); it.length }
        .take(4)

    println("Lengths of first 4 word longer than 3 chars:")
    println(lengthsList.toList())

}