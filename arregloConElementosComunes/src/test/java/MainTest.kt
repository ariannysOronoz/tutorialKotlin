import org.junit.jupiter.api.Test


class MainTest {

    @Test
    fun testingAssert(){
        assert(true)
    }

    @Test
    fun probandoValoresEnComun(

    ){
        val esperandoValorComun = intArrayOf(4,5)
        var arreglo1 : MutableList <Int> = mutableListOf(
            1,2,3,4,5)
        var arreglo2 : MutableList <Int> = mutableListOf(
            7,6,5,4)
        var comparandoLosArreglos = valoresEnComun(
            arreglo1,arreglo2
        )
        assert(
            esperandoValorComun.contentEquals(comparandoLosArreglos)
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