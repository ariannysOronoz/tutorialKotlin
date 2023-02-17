
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

fun generarArregloConValores(tamArreglo:Int):IntArray{
    val arreglo = IntArray(tamArreglo)
    for (i in 0 until arreglo.size){
        print("Ingrese numero ${i+1}: ")
        arreglo[i] = leerNumeroDeteclado().toInt()
        println()
    }
    return arreglo
}

fun sumarValoresArreglo(arreglo:IntArray):Int{
    var resultadoSuma = 0
    arreglo.forEach {
        resultadoSuma = resultadoSuma +it
    }
    return resultadoSuma
}

fun main (){
    print("Ingrese la cantidad de valores que ira a ingresar: ")
    var cantidadValoresAIngresar = leerNumeroDeteclado().toInt()
    println()
    var arreglo = generarArregloConValores(cantidadValoresAIngresar)
    println("el promedio de los valores: ${arreglo.asList()}")
    println("es ${sumarValoresArreglo(arreglo)/arreglo.size}")
}