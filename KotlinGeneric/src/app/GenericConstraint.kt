package app

interface CanSayHello{
    fun sayHello(name: String)
}

open class Employee

class Manager : Employee()

// Di class ini bisa memanggil Interface CanSayHello
// dan function akan di Override
class VicePresident : Employee(), CanSayHello{
    override fun sayHello(name: String) {
        println("Hello $name, I'm Vice President")
    }

}

// Class untuk membatasi hanya class Employee dan class turunanya
// Kalo ingin membtasi T nya itu tidak hanya Employee, Tapi juga CanSayHello
// Tambahkan Where setelah Constructor
// Dan ini Adalah cara Menambahkan Lebih dari satu constraint

// Disini harus Employee dan juga CanSayhello
class Company<T>(val employee: T) where T:Employee, T:CanSayHello

fun main() {
//    val data1 = Company(Employee()) // Error karna Class Employee tidak bisa melakukan CanSayHello
//    val data2 = Company(Manager()) // Error karna Class Manager tidak bisa melakukan CanSayHello

    val data3 = Company(VicePresident()) // Bisa, Karna Class VicePresident bisa melakukan CanSayHello

//    val data4 = Company("String") // Error, karna bertype String, Bukan Employee
}

// Generic type harus Employee dan Turunan nya
// Tidak bisa memasukan diluar Employee dan turunan nya

// class Company hanya membatasi Generic type nya harus class apa aja?
// default generic type nya adalah Any -> Semua tipe data bisa di akses