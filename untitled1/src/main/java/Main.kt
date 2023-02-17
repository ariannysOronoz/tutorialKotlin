import kotlin.math.pow

fun calcularPotencia(base:Int,exp:Int) :Int {
    var potencia = 1
    for(i in 0 until exp){
        potencia = potencia * base
    }
    return potencia
}


fun main() {

    val numeroBinario = "11010"
    var numeroBase = 2
    var resPotencia = 0
    var resMultiplicacion = 0
    var sumaTotal = 0

    println("Numero Binario: $numeroBinario")

    var reverse = numeroBinario.reversed()

    println("Numero Binario invertido: $reverse")

    reverse.forEachIndexed { index, c ->
        var charComoInt = Integer.parseInt("$c")
        //posiciones de cada numero
        println("numero: $charComoInt en la pos: $index")
        //calculamos las potencias
        resPotencia = numeroBase.toDouble().pow(index.toDouble()).toInt()
        //resPotencia = calcularPotencia(numeroBase,index)
        println("potencia: $resPotencia")
        //multiplicar cada digito binario por la potencia en su posicion
        resMultiplicacion = resPotencia * charComoInt
        println("multiplicacion: $resMultiplicacion")
        //calculamos la suma en el acumulador
        sumaTotal = sumaTotal + resMultiplicacion
    }

    println("numero binario a decimal = $sumaTotal")

}





