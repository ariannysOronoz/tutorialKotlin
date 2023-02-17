open class instrumentoMusical (
    nombre: String,
    tipoInstrumento: String,
){
    var nombre:String=nombre
    var marca:String=" Por defecto"
    var tipoInstrumento:String=tipoInstrumento

    //
    open  fun tocar(){
        println(
            "Esta tocando el instrumento de tipo $tipoInstrumento " +
                    "de nombre $nombre y " +
                    "de marca $marca")
    }

    fun limpiar(){
        println("Está limpiando el instrumento")
    }
}