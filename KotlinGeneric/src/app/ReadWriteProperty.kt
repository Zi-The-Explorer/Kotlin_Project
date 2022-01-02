package app

import kotlin.properties.ReadWriteProperty
import kotlin.reflect.KProperty

// Untuk bisa merubah data, Constructor di set ke var
// Extend Ke ReadWriteProperty Interface

class StringLogReadWriteProperty(var data: String) : ReadWriteProperty<Any, String> {

    // Function untuk mengambil data value nya
    override fun getValue(thisRef: Any, property: KProperty<*>): String {
        println("You get data ${property.name} is $data")
        return data
    }

    // Function untuk mengubah data value nya
    override fun setValue(thisRef: Any, property: KProperty<*>, value: String) {
        println("You set data ${property.name} from $data to $value")
        data = value
    }

}

class Person(param: String) {
    var name: String by StringLogReadWriteProperty(param)
}

fun main() {
    val person = Person("Akhmad Fauzi")
    person.name = "Muhammad Zein"
    person.name = "Muhammad Adli Ilham"
    person.name = "Ade Septiawan"
    println(person.name)
}