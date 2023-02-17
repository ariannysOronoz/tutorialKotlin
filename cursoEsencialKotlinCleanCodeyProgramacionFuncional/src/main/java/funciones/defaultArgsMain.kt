package funciones

fun main() {

    val usuario = "anncode"

    showWelcomeMessage("Hola")
    showWelcomeMessage("Hi")
    showWelcomeMessage("Buenos días")

    // "Buenos días anncode"
    showWelcomeMessage("Welcome", user = usuario)

}

fun showWelcomeMessage(text: String, user: String = "") {
    val message = "$text $user".trim() // "Welcome anncode"
    println(message)
}