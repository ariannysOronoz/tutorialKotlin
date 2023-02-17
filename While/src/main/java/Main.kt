fun main() {
    var num:Int?
    println("Introduce un numero entero: ")
    num=try {
        readLine()?.toInt()
    }catch (ex:java.lang.NumberFormatException){
        null
    }
    println("Su valor ingresado es:  $num")
}