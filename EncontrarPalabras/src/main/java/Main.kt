import org.omg.CORBA.ARG_IN.value

/***
 *
 *  println()
println()
var palabraTest = "mandioquinano"
println(palabraTest.substring(3,6))
println(palabraTest.substring(6,11))

val arregloNumeros = arrayOf(1,2,3,4,5,6,7,8,9,10)
val tabla = 2
arregloNumeros.map { numero ->
if(numero%2==0){
println("$tabla x $numero = ${tabla*numero}")
}else{
println("$tabla + $numero = ${tabla+numero}")
}
}
for (pos in 0..arregloNumeros.size-1){
println("$tabla x ${arregloNumeros[pos]} = ${tabla*arregloNumeros[pos]}")
}
 *
 * */

fun leerNumeroDeteclado(): String {
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
fun main () {

    val oracion = "DE un camino muy largo dependio su dEstino"
    var buscar = "de"
    var numeroDeVeces = 0

    println("palabra a buscar: $buscar")
    println("dentro de la oracion: $buscar")
    //conversion de la palabra en minuscula
    buscar = buscar.lowercase()
    // se declaro un arreglo y se esta separando la oracion por palabras
    val palabrasEnOracion = oracion.lowercase().split(" ")
    //estamos recorriendo un arreglo con una estructura repetitiva
    //
    palabrasEnOracion.map { palabra ->
        if ( buscar == palabra){
            println(" Numero de veces: ")
            numeroDeVeces++
        } else if(palabra.contains(buscar)){
            //una estructura repetitiva
            println()
            println("deletreando la palabra: $palabra")
            for (i in 0..palabra.length-1){
                println("letra: ${palabra[i]}")
                if ( palabra[i] == buscar[0] ){
                    val tam = buscar.length
                    println(  " i: $i tamano: $tam (i+tamano): ${i+tam}")
                    println(  " sub :${palabra.substring(i,i+buscar.length)}")
                    if(palabra.substring(i,i+buscar.length)==buscar){
                        numeroDeVeces++
                    }
                }
            }

            println()
        } else {

        }
    }

    println(numeroDeVeces)
}





