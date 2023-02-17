fun main() {

    var acumulador : Int = 0
    var limiteInferior :Int = 0
    var limiteSuperior :Int = 10
    if (limiteInferior < 2){
        acumulador=2
    } else {
        if (limiteInferior%2 == 0) {
            acumulador = limiteInferior
        } else {
            acumulador = limiteInferior + 1
        }
    }

    for (indice in limiteInferior..limiteSuperior){
        if (acumulador <= limiteSuperior){
            println("$acumulador")
            acumulador+=2

        }
    }
}


