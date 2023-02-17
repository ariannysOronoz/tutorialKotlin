package licuadora

class Licuadora(
    val motor : Motor,
    val vaso: Vaso
) {

    fun llenarVaso(
        listaIngredientes:List<Ingredientes>
    ){
        vaso.insertarIngredientes(listaIngredientes)
    }

    fun obtener(): ResultadoVaso {
        return vaso.obtenerMezcla()
    }

    //encender licuadora
    fun encender(
        vel: Velocidad
    ){
        //encendemos segun la velocidad
        motor.encender(vel)
        if(motor.estaEncendido()){
            vaso.procesar()
        }
    }

    //no licuar
    fun apagar(){
        motor.apagar()
    }

}