fun leerNumeroDeteclado(): String {
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
    var numero = ""

    print("Ingrese Numero a analizar: ")
    numero = leerNumeroDeteclado()
    println("")
    println("     Numero ingresado: $numero")
    var ivertido = numero.reversed()
    println("     Numero invertido: $ivertido")
        if (numero == ivertido)
        println(" El numero #$numero es capicua")
        else {
            println(" El numero #$numero no es capicua")
        }
}
