import punto.Operaciones
import punto.Punto

fun main(){
    println("Hola")
    var operar = Operaciones()
    val puntoA = Punto()
    val puntoB = Punto()
    puntoA.x = 9
    puntoA.y = 9
    puntoB.x = 15
    puntoB.y = 6
    println("la distancia entre A y B es: ${operar.distanciaEntreDosPuntos(puntoA,puntoB)}")
}