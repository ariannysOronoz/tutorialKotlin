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

    println(" Ingresar Número")
    print("       INGRESAR VALOR A: ")
    A = leerNumeroDeteclado()
    print("       INGRESAR VALOR B: ")
    B = leerNumeroDeteclado()
    println()

    do {
        Residuo=A%B
        println("el Residuo $A / $B es:  $Residuo")
            if (Residuo==0){
                MCD=B
                println ("MCD es:  $B")
            }else {
                A=B
                B=Residuo
        }
    } while (Residuo != 0)
}
