package app

import data.MyData

fun main() {
    val myDataString: MyData<String, Int> = MyData("Ozi", 100)
    myDataString.firstData // data parameter otomatis berubah String
    myDataString.printlnData()

    val myDataInt: MyData<Int, String> = MyData(24, "Second Data")
    myDataInt.firstData // Data parameter otomatis berubah Int
    myDataInt.printlnData()
}