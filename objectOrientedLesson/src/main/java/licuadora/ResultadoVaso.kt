package licuadora

sealed class ResultadoVaso {

}

class VasoVacio : ResultadoVaso()

class VasoConIngredientes : ResultadoVaso(){

    lateinit var listaIngredientes : List<Ingredientes>

}

class VasoConMezcla : ResultadoVaso(){

    lateinit var mezcla: Mezcla

}
