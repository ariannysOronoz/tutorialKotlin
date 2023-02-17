fun leerStringDeteclado() : String {
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

fun arregloUno (primer:String) : String{
    var nrosUno = primer.map {
        it.toInt() - 48
    }
    nrosUno.map {
      println(it)
    }
    return primer
}


fun arregloDos (segundo:String) : String{
    var nrosDos = segundo.map {
        it.toInt() - 48
    }
    nrosDos.map {
        println(it)
    }
    return segundo
}

fun sumarDosArreglos(sumita: String, segundoArreglo: String, ): String{
    var a= 0
    var b = 0
    var suma = a + b
    return sumita
}

fun main() {
    print("Ingresar numero en el primer arreglo: ")
    var primerArreglo = ""
    primerArreglo = leerStringDeteclado()
    println("primer arreglo:  ${arregloUno(primerArreglo)}")
    print("Ingresar numero en el segundo arreglo: ")
    var segundoArreglo = ""
    segundoArreglo =leerStringDeteclado()
    println("segundo arreglo: ${arregloDos(segundoArreglo)}")
    println(" $primerArreglo + $segundoArreglo = ${sumarDosArreglos(primerArreglo, segundoArreglo)}")


}