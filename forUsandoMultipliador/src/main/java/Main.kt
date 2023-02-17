fun main () {
    var valorInicio:Int=11
    var valorFinal:Int=20
    var limiteInferior:Int=valorInicio/2
    var limiteSuperior:Int=valorFinal/2
    for (indice in limiteInferior..limiteSuperior){
            var numero: Int=indice*2
            if(numero>=valorInicio&&numero<=valorFinal){
                println("$numero")
            }
    }
}