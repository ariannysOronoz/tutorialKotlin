package licuadora

interface Vaso {

    fun insertarIngredientes(listaIngredientes: List<Ingredientes>)
    fun obtenerMezcla(): ResultadoVaso
    fun procesar()

}
