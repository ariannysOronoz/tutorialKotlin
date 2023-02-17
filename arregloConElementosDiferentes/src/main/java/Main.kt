fun valoresDiferentes (
    a1: MutableList<Int>,
    a2: MutableList<Int>
) : IntArray {
    println("Los valores del arreglo (A) son:")
    println("$a1")
    println("Los valores del arreglo (B) son:")
    println("$a2")
        var elementosDiferentes = a1.minus(a2)
        println("Los valores diferentes entre A y B son:")
        if ( a1 == a2) {
            println(" No hay valores diferentes ")
        }else {
            println("$elementosDiferentes")
    }
    return elementosDiferentes.toIntArray()
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
    print("Ingresar numero en el segundo arreglo: ")
    var segundo = ""
    segundo =leerStringDeteclado()
    print("")
    valoresDiferentes(
        conversionDeDatos(primer).toMutableList(),
        conversionDeDatos(segundo).toMutableList()
    )
}







