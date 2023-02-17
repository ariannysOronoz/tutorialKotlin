fun leerNumeroDeteclado(
) : String {
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


fun GenerandoPalabras(
    Permutacion:String
) : String {
    var palabra = ""
    var nuevaPalabra= ""
    if (palabra == palabra) {
        println("Existe la palabra")
    } else {
        println("No existe la palabra")
    }
    return Permutacion
}

fun main (){
    var Lapalabra = ""
    println(" Ingrese la palabra permutar:")
    Lapalabra = leerNumeroDeteclado()
    println("${GenerandoPalabras(Lapalabra)}")
}

