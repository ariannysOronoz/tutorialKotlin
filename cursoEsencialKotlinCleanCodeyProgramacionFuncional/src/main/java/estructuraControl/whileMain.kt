package estructuraControl

fun main() {

    val greetings = arrayOf("Hola", "Te doy la bienvenida", "Hi", "Buenos días", "Hallo")
                            // 0            1                2          3           4
    greetings[0]
    greetings[1]
    greetings[2]
    greetings[3]
    greetings[4]

    var i = 0
    while (i <= greetings.size - 1) { // 4
        println(greetings[i])
        i++ // 5
    }

    println()

    var j = 0
    do {
        val greeting = greetings[j]
        println(greeting)
        j++
    } while (greeting.length > 2 && j < greetings.size - 1)
    println("Continuando")


    var k = 0
    while (k < greetings.size - 1) {
        val greeting = greetings[k]
        println(greeting)
        k++
        if (greeting.length <= 2) continue
        println("Continuando en While")
    }
    println("Termino While")

}




