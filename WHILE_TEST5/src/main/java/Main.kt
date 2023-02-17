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

    var acumulador: Int = 0
    var contador: Int = 0
    var A = 0
    var B=0
    var opcion: Int? = 0

    println(" Ingresar Número")
    print("       INGRESAR VALOR A: ")
    A = leerNumeroDeteclado()
    print("       INGRESAR VALOR B: ")
    B = leerNumeroDeteclado()
    println()
    do {
        println(" $acumulador + $A es:  ${acumulador+A}")
        acumulador=acumulador+A
        contador++
    } while (contador<B)
    println("el resultado de la multiplicacion es:  $acumulador")

}

