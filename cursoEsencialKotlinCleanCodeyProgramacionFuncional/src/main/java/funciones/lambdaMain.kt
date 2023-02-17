package funciones

fun main() {

    // Declararla
    val printHola = {
        println("Hola Lambda")
    }

    // Ejecutar
    printHola()

    val printText = { text: String ->
        println(text)
    }

    printText("Hola Lambda")

    val addOneTo = { x: Int ->
        x + 1
    }

    val total = addOneTo(4)
    println(total)

    val addFiveTo: (Int) -> Int = {
        it + 5
    }

    println(addFiveTo(5))

    val sum: (Int, Int, String) -> Int = { x: Int, y: Int, _: String ->
        x + y
    }

    println(sum(5, 3, ""))

    val sum2: (Int, Int, String) -> Int = { x: Int, y: Int, message: String ->
        val total = x + y
        println("$message $total")
        total
    }

    sum2(5, 3, "El resultado es:")

}



