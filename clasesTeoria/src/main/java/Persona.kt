//explicito
    class Persona constructor(
        documento: String,
        nombre: String,
        edad: Int,
        telefono: String
    ) {
        var documento : String = documento
        var nombre : String = nombre
        var edad : Int = edad
        var telefono : String = telefono

        fun caminar(){
            println("la persona esta caminando")
        }
        fun imprimirDatos(){
            var texto = "Nombre: $nombre \n documento : $documento \n Edad: $edad \n telefono: $telefono"
            println(texto)
        }
    }

//implicito
class Persona1 (
   var documento: String,
   var nombre: String,
   var edad: Int,
   var telefono: String
) {

    constructor(
        documento: String,
        nombre: String
    ):this(
        documento,
        nombre,
            0,
            ""
    ){
        println("esta en el constructor...")
    }

    constructor():this(
            "",
            "",
            0,
            ""
    ){
        println("esta en el constructor...")
    }

        fun caminar(){
            println("la persona esta caminando")
        }
        fun imprimirDatos(){
            var texto = "Nombre: $nombre \n documento : $documento \n Edad: $edad \n telefono: $telefono"
            println(texto)
        }
    }



//todos los valores son obligatorios
class PersonaK(
    var documento: String,
    var nombre: String,
    var edad: Int,
    var telefono: String
) {
    fun caminar(){
        println("la persona esta caminando")
    }
    fun imprimirDatos(){
        var texto = "Nombre: $nombre \n documento : $documento \n Edad: $edad \n telefono: $telefono"
        println(texto)
    }
}

//todos los parametros son opcionales
//clase para los datos
data class PersonaData(
    val documento : String = "",
    val nombre : String = "",
    val edad : Int = 0,
    val telefono : String = "",
)

//clase para el comportamiento
//parametro no opcional
class PersonaKDP(
    var data: PersonaData
) {
    fun caminar(){
        println("la persona esta caminando")
    }
    fun imprimirDatos(){
        var texto = "Nombre: ${data.nombre} \n documento : ${data.documento} \n Edad: ${data.edad} \n telefono: ${data.telefono}"
        println(texto)
    }
}

data class PersonaData2(
    val documento : String,
    val nombre : String,
    val edad : Int = 0,
    val telefono : String = "",
)
