class guitarra : instrumentoMusical {
    var color:String=""

    constructor(
        color:String,
        nombre : String,
        tipoInstrumento : String
        ) :
            // va acceder al contructor de la clase instrumento musical
            super ( nombre,tipoInstrumento) {
        this.color=color
    }

    //COM OVERRRIDE PUEDO RECONOCER COMO UNA FUNCION PROPIA Y PONER SU IMPLEMENTACION
    override fun tocar () {
        //para acceder a la funcion del padre:
        super.tocar()
        println("Tomar el instrumento $nombre de tipo $tipoInstrumento")
        println("Mirar la partitura ")
        println("Mover los dedos y tocar las cuerdas ")
    }
    fun afinar(){
        println("Se esta afinano la guitarra de color $color")
    }
}


data class Billetera(var monto:Double)

data class Vehiculo(
    val placa:String,
    val color:String,
    val modelo:String,
    val fechaFabricacion:String,
    val kilometrosIniciales:Double,
    val kilometrosTotales:Double
)

data class Persona(
    var nombres:String,
    var apellidos:String,
    var numeroIdentidad:String,
    var fechaNacimiento:String,
    var numeroRegFiscal:String
)

data class Pasajero(
    var esVIP:Boolean,
    var billetera:Billetera,
    val persona: Persona
)

data class Chofer(
    var numLicencia:String,
    var vehiculo:Vehiculo,
    var billetera:Billetera,
    val persona: Persona
)