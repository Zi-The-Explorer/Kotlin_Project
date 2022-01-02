package app

fun main() {
    val mutableList: MutableList<String> = mutableListOf()
    mutableList.add("Akhmad Fauzi")
    mutableList.add("Adinda Fatiharki")
    mutableList.add("Muhammmad Zein")
    mutableList[2] = "Rizka"

    for (value in mutableList) {
        println(value )
    }

}