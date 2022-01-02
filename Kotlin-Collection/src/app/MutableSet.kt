package app

import data.Person

fun main() {
    val mutableSet: MutableSet<Person> = mutableSetOf()
    mutableSet.add(Person("Akhmad Fauzi"))
    mutableSet.add(Person("Adinda Fatiharki"))
    mutableSet.add(Person("Muhammad Zein"))

    mutableSet.add(Person("Muhammad Zein"))
    mutableSet.add(Person("Adinda Fatiharki"))

    for (person in mutableSet) {
        println(person)
    }

}