fun main() {
    var acumulador : Int = 0
    var limiteInferior :Int = 5
    var limiteSuperior :Int = 33
    if (limiteInferior==5){
        acumulador=5
    }
    for (indice in limiteInferior..limiteSuperior){
        if (acumulador <= limiteSuperior){
            println("$acumulador")
            acumulador+=2

        }
    }
}

