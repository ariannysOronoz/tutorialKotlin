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

fun main(){

    var acumulador: Int = 1
    var contador: Int = 1
    //var numeroA = 0
    var numeroB = 2
    var opcion: Int? = 0

    println(" Ingresar Número")
    //print("       INGRESAR VALOR A: ")
    //numeroA = leerNumeroDeteclado()
    print("       Calcular el factorial: ")
    numeroB = leerNumeroDeteclado()
    println()
    do {
        println(" $acumulador * $contador es:  ${acumulador*contador}")
        acumulador=acumulador*contador
        contador++
    } while (contador<=numeroB)
    println("el resultado de la multiplicacion es:  $acumulador")

}
