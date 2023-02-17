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
fun main() {
    var Residuo: Int = 0
    var MCD: Int = 0
    var A = 0
    var B=0
    var opcion: Int? = 0
    do {
        println("1 - ingresar un numero")
        println("2 - operar de nuevo")
        println("3 - no deseo ingresar mas numeros")
        println("Ingrese una opcion: ")
        opcion = leerNumeroDeteclado()
        println("la opcion escogida es: $opcion")
        when (opcion) {
            1 -> {
                print("       INGRESAR VALOR A: ")
                A = leerNumeroDeteclado()
                print("       INGRESAR VALOR B: ")
                B = leerNumeroDeteclado()
                println()
            }
            2 -> {
                //--- aqui pasa algo mas
                Residuo=A%B
                println("el Residuo $A / $B es:  $Residuo")
                if (Residuo==0){
                    MCD=B
                    println ("MCD es:  $B")
                }else {
                    A=B
                    B=Residuo
                }
                //println("Hasta Luego")
            }
            else -> {
                println("Escoger numero entre 1 o 2")
            }

        }
    } while (opcion != 3)
}