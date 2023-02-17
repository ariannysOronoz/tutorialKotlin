import org.junit.jupiter.api.Test

class MainTest {

    @Test
    //Probando funcion Suma de arreglos
    fun probandoSumaDeArreglos(

    ){
        val sumaEsperada : IntArray = intArrayOf(56)
        val a1 : MutableList<Int> = mutableListOf(23)
        val a2 : MutableList<Int> = mutableListOf(33)
        val sumandoDosArreglos = sumaDeArreglos(
            a1,a2
        )
        assert(
            sumaEsperada.contentEquals(sumandoDosArreglos)
        )
    }

    @Test
    //Probando funcion generar ceros
    fun probandoGenerarCeros(

    ){
        val valorEsperado = mutableListOf<Int>(0)
        val valorIngresado = 0
        val evaluarProbandoGenerarCeros = generarCeros(
            valorIngresado
        )
        assert(
            valorEsperado.containsAll(evaluarProbandoGenerarCeros)
        )
    }
    @Test
    fun probandoConversionDeDatos(

    ){
        val datoEsperado: IntArray = intArrayOf(1,2,3,4)
        val datoIngresado : String = "1,2,3,4"
        val evaluarConversionDeDatos = conversionDeDatos(
            datoIngresado
        )
        assert(
            datoEsperado.contentEquals(evaluarConversionDeDatos)
        )
    }


}