import com.sun.org.apache.xpath.internal.operations.Div

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
fun main (){
    var Residuo: Int = 0
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
    Residuo=A-B
    println(" $A - $B es:  $Residuo")
    A=Residuo
    contador++
} while ( A > B)
    println("el resultado de la division es:  $contador")

}

