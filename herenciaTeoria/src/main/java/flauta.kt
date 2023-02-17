

class flauta (
    tam:String,
    nombre:String,
    tipoInstrumento:String,

) : instrumentoMusical (nombre, tipoInstrumento ){

    var tam:String=tam

    //COM OVERRRIDE PUEDO RECONOCER COMO UNA FUNCION PROPIA Y PONER SU IMPLEMENTACION
    override fun tocar () {
        println("sostener el instrumento  $nombre")
        println("llevar a la boca y soplarla  $nombre")
    }

    fun brillar () {
        println("Esta brillando la flauta $tam")
    }
}