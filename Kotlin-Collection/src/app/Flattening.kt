package app

class Member(val name: String, val hobies: List<String>)

fun main() {
    val list: List<List<String>> = listOf(
        listOf("Ozi", "Zein", "Emon"),
        listOf("Godel", "Eko", "Jadul"),
        listOf("Zambul", "Peno", "Nino"),
        listOf("Dinda", "Laila", "Irna")
    )
    /**
     * Melakukan Flattening pada list data nested(Bersarang)
     *
     * Menggunakan konversi function flatten(), untuk merubah list nested menjadi flat
     *
     * data nested akan digabung jadi satu list
     */
    val listString: List<String> = list.flatten()
    println("Data List: $listString")

    /**
     * Membuat List Untuk menampung banyak data member dari Class Member
     */
    val member: List<Member> = listOf(
        Member("Ozi", listOf("Ngoding", "Playing Guitar", "Listen Music")),
        Member("Dinda", listOf("Hiking", "Playing Guitar", "Singing"))
    )

    /**
     * Cara Mengambil semua data hobies nya pada data nested list Member
     */
//    val hobies1 = member.map { it.hobies }.flatten() // Cara biasa
//    println(hobies1)

    val hobies2 = member.flatMap { it.hobies } // Cara ringkas menggunakan flatMap()
    println("Data Member Hobies: $hobies2")

    /**
     * Mengambil semua data member dan hobies nya
     */
    var number = 1
    val allmember = member.forEach { println("""
        Data Member ${number++}
        ${it.name} : ${it.hobies}
        
    """.trimIndent()) }
    return allmember





}