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
    var acumulador: Int = 1
    var contador: Int = 1
    var numeroA = 0
    var numeroB=0
    var opcion: Int? = 0

    println(" Ingresar Número")
    print("       INGRESAR VALOR A: ")
    numeroA = leerNumeroDeteclado()
    print("       INGRESAR VALOR B: ")
    numeroB = leerNumeroDeteclado()
    println()
    do {
        println(" $acumulador * $numeroA es:  ${acumulador*numeroA}")
        acumulador=acumulador*numeroA
        contador++
    } while (contador<=numeroB)
    println("el resultado de la multiplicacion es:  $acumulador")

}