package app

import data.Person

fun main() {
    // Data duplicate akan di Reject oleh set
    val set: Set<Person> = setOf(
        Person("Akhmad Fauzi"),
        Person("Adinda Fatiharki"),
        Person("Muhammad Zein"),

        Person("Muhammad Zein"),
        Person("Adinda Fatiharki"),
    )



    println(set.size)  // Menampilkan jumlah data, tapi data duplicate akan di reject
    println(set.contains(Person("Akhmad Fauzi")))

    for (person in set) {
        println(person)
    }
}