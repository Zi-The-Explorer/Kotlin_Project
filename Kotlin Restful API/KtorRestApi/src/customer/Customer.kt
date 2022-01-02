package customer

import kotlinx.serialization.Serializable

val customerStorage = mutableListOf(
    Customer(
    "100",
    "Akhmad",
    "Fauzi",
    "akhmadfauzi1046@gmail.com"),

    Customer(
        "200",
        "Adinda",
        "Fatiharki",
        "adindafatiharki@gmail.com"
    )
)

@Serializable
data class Customer(
    val id: String,
    val firstName: String,
    val lastName: String,
    val email: String
)
