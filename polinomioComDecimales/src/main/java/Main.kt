fun main () {
    print("Ingresar numero en el arreglo: ")
    var primer = ""
    primer= leerStringDeteclado()
    print("el polinomio es: ${
        reversoDelArreglo(
            revertirPolinomio(
                conversionDeDatos(
                    primer
                ).toMutableList()
        ).toMutableList()
        )}")
}

fun leerStringDeteclado() : String {
    var num: String? = null
    while ( num == null){
        num = readLine()
    }
    return num
}

fun reversoDelArreglo (
    a1: MutableList<Double>
) : String {
    var polinomio = ""
    a1.forEachIndexed { i,valor ->
        if(i==0){
            polinomio = "${getAsRational(valor)}x^($i)"
        }else{
            polinomio = "${getAsRational(valor)}x^($i) + $polinomio"
        }
        //println("vez $i: $polinomio")
    }
    return polinomio
}

fun revertirPolinomio (
    a1:MutableList<Double>,
) : DoubleArray {
    return a1.reversed().toDoubleArray()
}

fun conversionDeDatos ( convertir : String ) : DoubleArray {
    val arregloStrings : List<String> = convertir.split(",")
    val arregloInts : List<Double>  = arregloStrings.map { it.toDouble() }
    return arregloInts.toDoubleArray()
}

fun getAsRational (
    d: Double
): String {
    val ds = d.toString().trimEnd('0').trimEnd('.')
    val index = ds.indexOf('.')
        if (index == -1) return "${ds.toLong()}"
    var num = ds.replace(".", "").toLong()
    var den = 1L
         for (n in 1..(ds.length - index - 1)) den *= 10L
            while (num % 2L == 0L && den % 2L == 0L) {
                 num /= 2L
                 den /= 2L
    }
            while (num % 5L == 0L && den % 5L == 0L) {
                num /= 5L
                den /= 5L
    }
    return "$num/$den"
}