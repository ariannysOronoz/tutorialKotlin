/*fun leerNumeroDeteclado(): String {
    var num: Int? = null
    while ( num == null){
        num = try {
            readLine()?.toInt()
        } catch (ex: java.lang.NumberFormatException) {
            null
        }
    }
    return num.toString()
}
fun main () {

    var numeroConventir = 326
    var numeroDivisor= 2
    var divisidorResiduo= 2
    var ResultadoDivision = 0
    var contador= 1
    var resultadoResiduo= 0
    var numeroBinario = ""
    do {
        println("nro: $numeroConventir")
        println("   Division ${contador}:  $numeroConventir / $numeroDivisor es:  ${numeroConventir/numeroDivisor}")
        println("   Residuo ${contador}:  $numeroConventir % $divisidorResiduo es:  ${numeroConventir % divisidorResiduo}")

        ResultadoDivision = numeroConventir / numeroDivisor
        resultadoResiduo = numeroConventir % divisidorResiduo
        numeroConventir = ResultadoDivision
        contador++

        numeroBinario = "$resultadoResiduo$numeroBinario"
    } while (ResultadoDivision >= 2 )


    println (" El num binario es: $numeroBinario ")
    println (" El resultado de la division es: $ResultadoDivision ")
    println (" El resultado del Residuo es: $resultadoResiduo ")
}/*

 */
 */


fun main() {
    val numbers = intArrayOf(1, 2, 3)
    val numbers2 = intArrayOf(4, 5, 6)
    val sum = numbers.zip(numbers2).map { (a, b) -> a + b }
    println(sum.joinToString(", "))
}

