import org.junit.jupiter.api.Test
import org.junit.jupiter.api.Assertions.*
class MainTest {

    @Test
    fun testingAssert(){
        assert(true)
    }

    //Probando la funcion Valores Diferentes
    @Test
    fun probandoCon1ValorDiferentes (
    ){
    //Entradas al sistema
    val valoresDiferentesEntreAyBEsperados : Array <Int> = arrayOf(1)
    val arreglo1 : MutableList <Int> = mutableListOf(
        1,2,3,4,5,6,7,8,9)
    val arreglo2 : MutableList <Int> = mutableListOf(
        2,3,4,5,6,7,8,9)
    //cuerpo de la prueba
    val comparandoLosArreglos = valoresDiferentes(
        arreglo1,arreglo2
    )
    //assert del valorDeRetorno
     assertNotEquals(
         valoresDiferentesEntreAyBEsperados,
         comparandoLosArreglos
     )
}
    @Test
    fun probandocon2ValoresDiferentes (
    ){ // ntradas al sistema
        val valoresDiferentesEntreAyBEsperados : Array <Int> = arrayOf(1,2)
        val arreglo1 : MutableList <Int> = mutableListOf(
            1,2,3,4,5,6,7,8,9)
        val arreglo2 : MutableList <Int> = mutableListOf(
            3,4,5,6,7,8,9)
        //cuerpo de la prueba
        val comparandoLosArreglos = valoresDiferentes(
            arreglo1,arreglo2
        )
        //assert del valorDeRetorno
        assertNotEquals(
            valoresDiferentesEntreAyBEsperados,
            comparandoLosArreglos
        )
    }
    @Test
    fun probandocon3ValoresDiferentes (
    ){ // ntradas al sistema
        val valoresDiferentesEntreAyBEsperados : Array <Int> = arrayOf(1,2,3)
        val arreglo1 : MutableList <Int> = mutableListOf(
            1,2,3,4,5,6,7,8,9)
        val arreglo2 : MutableList <Int> = mutableListOf(
            4,5,6,7,8,9)
        //cuerpo de la prueba
        val comparandoLosArreglos = valoresDiferentes(
            arreglo1,arreglo2
        )
        //assert del valorDeRetorno
        assertNotEquals(
            valoresDiferentesEntreAyBEsperados,
            comparandoLosArreglos
        )
    }
    @Test
    fun probandocon4ValoresDiferentes (
    ){ // ntradas al sistema
        val valoresDiferentesEntreAyBEsperados : Array <Int> = arrayOf(1,2,3,4)
        val arreglo1 : MutableList <Int> = mutableListOf(
            1,2,3,4,5,6,7,8,9)
        val arreglo2 : MutableList <Int> = mutableListOf(
            5,6,7,8,9)
        //cuerpo de la prueba
        val comparandoLosArreglos = valoresDiferentes(
            arreglo1,arreglo2
        )
        //assert del valorDeRetorno
        assertNotEquals(
            valoresDiferentesEntreAyBEsperados,
            comparandoLosArreglos
        )
    }

    // Probando la funcion ConversionDeDatos

    @Test
    fun probandoConversionDeDatos(

    ){
        //entrada al sistema
        val datoEsperado: IntArray = intArrayOf(1,2,3,4)
        val datoIngresado : String = "1,2,3,4"
        //cuerpo de la prueba
        val evaluarConversionDeDatos = conversionDeDatos(
            datoIngresado
        )
        // assert del valor de retorno
        assert(
            datoEsperado.contentEquals(evaluarConversionDeDatos)
        )
    }

}