package app

import java.time.Year
import kotlin.properties.Delegates
import kotlin.properties.ObservableProperty
import kotlin.reflect.KProperty


// Buat class LogObservableProperty, Untuk Nge-LOG Before Changed dan after Change
// Set tipe data Generic agar bisa diubah macem macem tipe data
// tambahkan constructor (data: T), dimana nanti akan di kirim ke constructor Observable(data)
class LogObservableProperty<T>(data: T) : ObservableProperty<T>(data) {

    // Sebelum Berubah
    override fun beforeChange(property: KProperty<*>, oldValue: T, newValue: T): Boolean {
        println("Before Change ${property.name} from $oldValue to $newValue")
        return true
    }

    // Setelah berubah
    override fun afterChange(property: KProperty<*>, oldValue: T, newValue: T) {
        println("After Change ${property.name} from $oldValue to $newValue")
    }

}

class Car(brand: String, year: Int) {
    var brand: String by LogObservableProperty<String>(brand)
    var year: Int by LogObservableProperty<Int>(year)

    // Tanpa perlu membuat class
    var owner: String by Delegates.notNull<String>()
    var description: String by Delegates.vetoable(""){property, oldValue, newValue ->
        println("Before Change ${property.name} from $oldValue to $newValue")
        true
    }
    var other: String by Delegates.observable(""){property, oldValue, newValue ->
        println("After Change ${property.name} from $oldValue to $newValue")
    }
}


fun main() {
    val car = Car("Toyota", 2019)

    car.brand = "Wuling"
    println(car.brand)

    car.year = 2021
    println(car.year)


    car.owner = "Akhmad Fauzi"
    println(car.owner)

    car.description = "Ini Delegate vetoable"
    println(car.description)

    car.other = "Ini Delegate Obervable"
    println(car.other)

}