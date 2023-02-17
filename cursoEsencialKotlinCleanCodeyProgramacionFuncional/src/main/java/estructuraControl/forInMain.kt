package estructuraControl

fun main() {

    /*var i = 0
    while (i <= greetings.size - 1) { // 4
        println(greetings[i])
        i++ // 5
    }*/
    // 0,1,2,3,4

    for (i in 0..4) {
        println(i)
    }

    println()

    for (i in 'a'..'c') {
        println(i)
    }

    println()

    for (i in 'c'.downTo('a')) {
        println(i)
    }

    println()

    val greetings = arrayOf("Hola", "Hi", "Te doy la bienvenida", "Buenos días", "Hallo")
    for (greeting in greetings) {
        println(greeting)
    }

    println()
    for (i in 0..greetings.size - 1) {
        println(greetings[i])
    }

    println()
    for (i in 0 until greetings.size) {
        println(greetings[i])
    }


    println()
    for (i in greetings.indices) {
        println(greetings[i])
    }

}
