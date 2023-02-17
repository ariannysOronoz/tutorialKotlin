package funciones

fun main() {

    // "My Fabulous App"
    // "Welcome to the best experience"
    // "Anahi Salgado"

    // "**** My Fabulous App ****"
    // "** Welcome to the best experience **"
    // "* Anahi Salgado *"


    val appName = "My Fabulous App"
    val appNameFormatted = addStarsFormat(appName, 5)
    println(appNameFormatted)


    val welcome = "Welcome to the best experience"
    println(addStarsFormat(welcome, 3))

    val name = "Anahi Salgado"
    println(addStarsFormat(name, 2))

}
// "My Fabulous App"
fun addStarsFormat(text: String, starsNumber: Int): String {
    val textBuilder = StringBuilder(text)
    textBuilder.insert(0, " ")
    textBuilder.insert(textBuilder.length, " ")
    for (i in 0 until starsNumber) {
        textBuilder.insert(0, "*")
        textBuilder.insert(textBuilder.length, "*")
    }

    return textBuilder.toString()
}


