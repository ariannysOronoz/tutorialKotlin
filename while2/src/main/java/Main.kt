fun leerNumeroDeteclado(): Int? {
    val num: Int?
    num = try {
        readLine()?.toInt()
    } catch (ex: java.lang.NumberFormatException) {
        null
    }
    return num
}

fun main() {
    var numA: Int? = 0
    var numB: Int? = 0
    var opcion: Int? = 0
    do {


        println("1- ingresar valores de A y B")
        println("2- Sumar A y B")
        println("3- Restar A y B")
        println("4- Multiplicar A y B")
        println("5- Dividir A y B")
        println("6- Salir del Sistema")
        opcion = leerNumeroDeteclado()

        when (opcion) {

            1 -> {
                numA = leerNumeroDeteclado()
                numB = leerNumeroDeteclado()
            }
            2 -> {
                println(numA!! + numB!!)
            }
            3 -> {
                println(numA!! - numB!!)
            }
            4 -> {
                println(numA!! * numB!!)
            }
            5 -> {
                println(numA!! / numB!!)
            }
            6 -> {
                println("Hasta Luego")
            }
            else -> {
                println("Opcion no valida")
            }

        }


    } while (opcion != 6)
}