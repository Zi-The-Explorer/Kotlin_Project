package app

class ContraVariant <in T>{
    fun sayHello(name: T) {
        return println("Hello $name")
    }


    // Tidak Boleh
//    fun getData(): T {
//        return data
//    }
}

fun main() {
    val data1: ContraVariant<Any> = ContraVariant()
    val data2: ContraVariant<String> = data1

    data2.sayHello("Akhmad Fauzi")
}

// Untuk membuat Contravariant Generic type
// Harus menyertakan in didalam Generic type
// Wajib mengembalikan T pada input parameter
// Tidak boleh mengembalikan T pada return Value nya