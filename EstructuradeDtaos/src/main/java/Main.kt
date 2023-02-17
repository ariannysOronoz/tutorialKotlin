import kotlin.math.roundToInt

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

fun llenarArreglo(arreglo: Array<Int>){
    var superior = arreglo.size - 1
    println("    Ingrese los numeros: ")
    for (i in 0..superior) {
        print("valor numero ${i + 1}: ")
        arreglo[i] = leerNumeroDeteclado()
    }
}

fun main () {
    val listaNumero: Array<Int> = Array(10, { 0 })
    var NumeroBuscar=0
    var superior = listaNumero.size - 1
    var inferior = 0
    var centro = 0

    var elementoEncontrado = false


    print("    Ingrese Numero a Buscar: ")
    NumeroBuscar = leerNumeroDeteclado()

    llenarArreglo(listaNumero)

    while (inferior<=superior){
        centro=(superior+inferior)/2
        if(NumeroBuscar==listaNumero[centro]){
            elementoEncontrado=true
            break
        }else if(NumeroBuscar<listaNumero[centro]){
            superior=centro -1
        }else{
            inferior=centro +1
        }
    }
    if(elementoEncontrado==true){
        println("")
        println("El numero $NumeroBuscar esta en la posicion  #${centro+1}")
    }else{
        println("El numero $NumeroBuscar no esta en el arreglo ")
    }
}





