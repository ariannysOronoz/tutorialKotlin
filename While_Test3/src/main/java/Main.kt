fun leerNumeroDeteclado(): Int {
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
fun main () {
    var division=0
    var residuoA=0
    var residuoB=0
    var A=0
    var B=0
    var MCD=0
    do {
        println("1 - ingresar un numero")
        println("2 - no deseo ingresar mas numeros")
        println("Ingrese una opcion: ")
        opcion = leerNumeroDeteclado()
        println("la opcion escogida es: $opcion")
        when (opcion) {
            1 -> {
                print("       ingresa un numero: ")
                Calificacion = leerNumeroDeteclado()
                //acumulador
                Suma=Suma+Calificacion
                //contador
                Nro=Nro+1

            }
            2 -> {
                //--- aqui pasa algo mas
                promedio=Suma/Nro
                println("el promedio es:  $promedio")
                println("Hasta Luego")
            }
            else -> {
                println("Escoger numero entre 1 o 2")
            }

        }
    } while (opcion != 2)

}

}