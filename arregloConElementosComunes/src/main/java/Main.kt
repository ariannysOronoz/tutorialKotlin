
fun valoresEnComun (
    a1: MutableList<Int>,
    a2: MutableList<Int>
    ) : IntArray {
    println("Los valores del primer arreglo son:")
    println("$a1")
    println("Los valores del segundo arreglo son:")
    println("$a2")
    var elementosComunes = a1.intersect(a2)
    println("valores en comun:")
    print("$elementosComunes")
    return elementosComunes.toIntArray()
}

fun leerStringDeteclado() : String {
    var num: String? = null
    while ( num == null){
        num = readLine()
    }
    return num
}

fun conversionDeDatos ( convertir : String ) : IntArray {
    val arregloStrings : List<String> = convertir.split(",")
    val arregloInts : List<Int>  = arregloStrings.map { it.toInt() }
    return arregloInts.toIntArray()
}


fun main () {
    print("Ingresar numero en el primer arreglo: ")
    var primer = ""
    primer= leerStringDeteclado()
    //println("primer arreglo:  $primer")
    print("Ingresar numero en el segundo arreglo: ")
    var segundo = ""
    segundo =leerStringDeteclado()
    //println("segundo arreglo: $segundo")

    valoresEnComun(
        conversionDeDatos(primer).toMutableList(),
        conversionDeDatos(segundo).toMutableList()
    )

}

