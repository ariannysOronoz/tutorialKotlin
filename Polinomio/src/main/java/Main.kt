fun main (){
    print("Ingresar numero en el arreglo: ")
    var primer = ""
    primer= leerStringDeteclado()
    print("el polinomio es: ${
        reversoDelArreglo(
            revertirPolinomio(
                conversionDeDatos(primer).toMutableList()
            ).toMutableList()
        )
    }")
}

fun reversoDelArreglo (
    a1: MutableList<Double>
) : String {
    var polinomio = ""
    a1.forEachIndexed { i,valor ->
        if(i==0){
            polinomio = "${valor}x^($i)"
        }else{
            polinomio = "${valor}x^($i) + $polinomio"
        }
        println("vez $i: $polinomio")
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
    val arregloInts  = arregloStrings.map { it.toDouble() }
    return arregloInts.toDoubleArray()
}

fun leerStringDeteclado() : String {
    var num: String? = null
    while ( num == null){
        num = readLine()
    }
    return num
}
//ejemplo//
fun elevarNumero(base:Int,exponent:Int) : Double {
    var acumulador = 1.0
    for (i in 1..exponent){
        acumulador *= acumulador
    }
    return acumulador
}