fun main() {
    val arregloEnteros : Array <Int> = Array(4,{0})
    arregloEnteros[0]=10
    arregloEnteros[1]=-8
    arregloEnteros[2]=4
    arregloEnteros[3]=30
    arregloEnteros.map{
        println(it)
    }
    for (i in 0 .. 3){
        println(arregloEnteros[i])
    }
}
