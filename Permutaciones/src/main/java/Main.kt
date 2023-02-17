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

fun FuncionUno (
    terminal:Int
) : Int {
    var conteo = 0
    do {
        println(" #$conteo = $conteo$terminal ")
        conteo++
    } while (conteo != 10)
    return terminal
}


fun main (){
    print("Crear numeros con la terminal: ")
    var numero=0
    numero = leerNumeroDeteclado()
    println(" ${FuncionUno(numero)}")
    print("Crear numeros con la inicial: ")
    var Inumero=""
    Inumero=leerStringDeteclado()
    println("${FuncionDos(Inumero)}")
}

fun FuncionDos (Inicial:String) : String {
    var conteo = 0
        do {
            println(" #$conteo = ${Inicial[0]}${Inicial[1]}$conteo ")
            conteo++
        } while (conteo != 10)
        return Inicial
    }






