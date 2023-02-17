package estructuraControl

import kotlin.math.roundToInt

fun main() {

    val isLoggedIn = true
    when (isLoggedIn) {
        true -> println("Usuario logedado")
        false -> println("Usuario No Logeado")
    }

    println()

    //aqui estamos definiendo estatus
    // 1  Logged In
    // 0  Logged Out
    // -1 Down
    // 10 - 20 Inactive time [10 -20]
    val userStatus = 17
    val userStatusString = when (userStatus) {
        0 -> "Logged Out"
        1 -> "Logged In"
        -1 -> "Down"
        in 10..20 -> "Inactive for $userStatus min"
        else -> "Not found"
    }

    println(userStatusString)
    println()

    val productPrices: Any = doubleArrayOf(15.99, 11.10, 45.99)
    val total = when (productPrices) {
        is DoubleArray -> productPrices.sum().roundToInt().toString()
        is Double -> productPrices.roundToInt().toString()
        is Int -> productPrices.toString()
        else -> productPrices.toString()
    }

    println("Totals: $total")
    println()


    val hasAddress = false
    val user = "anncode"
    val message = when {
        isLoggedIn and hasAddress -> "Lista direcciones de $user"
        isLoggedIn and !hasAddress -> "$user no tiene lista de direcciones"
        else -> ""
    }

    println("message: $message")



}
