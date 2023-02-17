fun leerNumeroDeteclado(): Float {
    var num: Float? = null
    while ( num == null){
        num = try {
            readLine()?.toFloat()
        } catch (ex: java.lang.NumberFormatException) {
            null
        }
    }
    return num
}

fun main () {
    val listaNumero: Array<Float> = Array(10, { 0f })
    var cantidad = listaNumero.size
    var auxiliar=0

    println("    Ingrese los numeros: ")
    for (i in 0..9) {
        print("valor numero ${i + 1}: ")
        listaNumero[i] = leerNumeroDeteclado()
    }

    for(i in (0 until cantidad-1)){
        for(j in (0 until cantidad-1)){
            if(listaNumero[j]>listaNumero[j+1]){
                auxiliar= listaNumero[j].toInt()
                listaNumero[j]=listaNumero[j+1]
                listaNumero[j+1]= auxiliar.toFloat()
            }
        }
    }
    println("        ")
    println(" los numeros estan ordenados de menor a mayor:  ")
    for (i in (0 until cantidad)){
        println(listaNumero[i])
    }
    println("        ")
    println(" los numeros estan ordenados de mayor a menor:  ")
    for (i in (cantidad-1 downTo 0)){
        println(listaNumero[i])
    }


}