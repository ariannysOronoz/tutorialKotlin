package estructuraControl

fun main() {

    val isLoggedIn = false
    val hasAddress = false


    // if user is logged in
    // if hasAddress
    // Mostrar lista de direcciones
    // !hasAddress
    // El ususario no tiene direcciones
    // user is not logged in
    // ususario no logeado


    if (isLoggedIn) {
        println("Usuario está logeado")

        if (hasAddress) {
            println("Mostrar lista de direcciones")
        } else {
            println("El usuario no tiene direcciones")
        }
    } else {
        println("Usuario no logeado")
    }


    val userLoggedInStatus = if (isLoggedIn) "Logeado" else "No Logeado"

    println("Usuario: $userLoggedInStatus")



}