
/*
*
*  fun nombreFuncion(parametros de la funcion:TipoParametro) : TipoRetorno{
*       bloque de funcion
*       return "puede o no existir"
* }
*
* */
fun leerNumeroDeteclado() : String {
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


fun invertirString(
    stringAInvertir:String
):String{
    var stringTemporal = ""
    stringAInvertir.map {
        stringTemporal = "$it$stringTemporal"
    }
    return stringTemporal
}

fun esCapicua(numero: String) : Boolean {
    return numero == invertirString(numero)
}

fun obtenerMsgSegunValor(valor:Boolean):String{
    return if(valor){
        "es capicua"
    } else {
        "no es capicua"
    }
}

fun main (){
    var numero = ""
    print("Ingrese Numero a analizar: ")
    numero = leerNumeroDeteclado()
    println("")
    println("     Numero ingresado: $numero")
    println()
    println(" El numero #$numero ${obtenerMsgSegunValor(esCapicua(numero))}")
   /* println(
        sumarTresNumeros(
            leerNumeroDeteclado().toInt(),
            leerNumeroDeteclado().toInt(),
            leerNumeroDeteclado().toInt()
        )
    )
}

fun sumarDosNumeros(
    a:Int,
    b:Int
):Int{
    return a+b
}

fun sumarTresNumeros(
    a:Int,
    b:Int,
    c:Int
):Int{
    return a+b+c
}

fun sumarCuatroNumeros(
    a:Int,
    b:Int,
    c:Int,
    d:Int
):Int{
    return a+b+c+d
}

fun calcularPromedioDe5Numeros(
    a:Int,
    b:Int,
    c:Int,
    d:Int,
    e:Int
):Int{
    val suma = a+b+c+d+e
    return suma/5
} */

}
