fun leerStringDeteclado() : String {
    var num: String? = null
    while ( num == null){
        num = readLine()
    }
    return num
}

fun sumaDeArreglos (
    a1: MutableList<Int>,
    a2: MutableList<Int>
) : IntArray {
    if (a1.size > a2.size) {
        a2.addAll(
            generarCeros(
                a1.size - a2.size
            )
        )
    }
    if (a2.size > a1.size) {
        a1.addAll(
            generarCeros(
                a2.size - a1.size
            )
        )
    }
    var i = 0
    return a1.map {
        it + a2[i++]
    }.toIntArray()
}

fun generarCeros(
    cuantos:Int
) : MutableList<Int>{
    val cerosAgregar = mutableListOf<Int>()
    for (indice in 0 until cuantos) {
        println("indice: $indice")
        cerosAgregar += 0
    }
    return cerosAgregar
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
    println("primer arreglo:  $primer")
    print("Ingresar numero en el segundo arreglo: ")
    var segundo = ""
    segundo =leerStringDeteclado()
    println("segundo arreglo: $segundo")
    sumaDeArreglos(
        conversionDeDatos(primer).toMutableList() ,
        conversionDeDatos(segundo).toMutableList()
    ).forEach {
        println( "la suma $ $it")
    }
}