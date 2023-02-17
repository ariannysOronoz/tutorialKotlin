fun main() {
    var limiteInferior:Int=11
    var limiteSuperior:Int=20
    for (indice in limiteInferior..limiteSuperior){
        if (indice%2==0){
            println("$indice")
        }
    }
}