fun leerNumeroDeteclado(): Int? {
    var num: Int? = null
    while ( num == null){
        num = try {
            readLine()?.toInt()
        } catch (ex: java.lang.NumberFormatException) {
            null
        }
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
        println("Ingrese una opcion: ")
        opcion = leerNumeroDeteclado()
        println("la opcion escogida es: $opcion")

        when (opcion) {

            1 -> {
                print("       INGRESAR VALOR A: ")
                numA = leerNumeroDeteclado()
                print("       INGRESAR VALOR B: ")
                numB = leerNumeroDeteclado()
                println()
            }
            2 -> {
                print("el resultado de la suma es:  ")
                println(numA!! + numB!!)
            }
            3 -> {
                print("el resultado de la resta es:  ")
                println(numA!! - numB!!)
            }
            4 -> {
                print("el resultado de la multiplicacion es:  ")
                println(numA!! * numB!!)
            }
            5 -> {
                print("el resultado de la division es:  ")
                println(numA!! / numB!!)
            }
            6 -> {
                println("Hasta Luego")
            }
            else -> {
                println("Escoger numero entre 1 y 6")
            }

        }

    } while (opcion != 6)
}