import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

class MainTest {

    @Test
    fun testingAssert(){
        assert(true)
    }

    @Test
    fun testingSystem(){
        //inicializar
        val resultadoEsperado = "2.0x^(4) + 0.5x^(3) + 0.3x^(2) + 4.0x^(1) + 0.4x^(0)"
        val arreglo = listOf<Double>(
            0.4, 4.0, 0.3, 0.5, 2.0
        )
        //proceso
        val aEvaluar = reversoDelArreglo(
            arreglo.toMutableList()
        )
        //evaluar
        assertEquals(
            resultadoEsperado,
            aEvaluar
        )
    }

    @Test
    fun probandoRevertirPolinomio(
    ){
       //1 entradas del sistema
        val arregloRevertidoEsperado = doubleArrayOf(
            4.0,5.0,6.0,7.0,8.0
        )
        val arregloIngresado = doubleArrayOf(
            8.0,7.0,6.0,5.0,4.0
        )
        //2 cuerpo de prueba
        val evaluarElArreglo = revertirPolinomio(
            arregloIngresado.toMutableList()
        )
        //3 assert del valorDeRetorno
        assert(
            arregloRevertidoEsperado.contentEquals(evaluarElArreglo)
        )
    }
    @Test
    fun probandoConversionDeDatos(
    ){
        val datoEsperado : DoubleArray = doubleArrayOf(
            1.0,2.0,3.0,4.0,5.0)
        val datoIngresado : String = "1,2,3,4,5"
        val evaluarElDato = conversionDeDatos(
            datoIngresado
        )
        assert(
            datoEsperado.
            contentEquals(evaluarElDato)
        )
    }

    //exemplo
    @Test
    fun elevarCuatroAlCuadrado(){
        val resultadoEsperado = 16.0
        val exponente = 2
        val base = 4
        val aEvaluar = elevarNumero(base,exponente)
        assertEquals(
            resultadoEsperado,
            aEvaluar
        )
    }

    @Test
    fun elevarCuatroAla5(){
        val resultadoEsperado = 1024.0
        val exponente = 5
        val base = 4
        val aEvaluar = elevarNumero(base,exponente)
        assertEquals(
            resultadoEsperado,
            aEvaluar
        )
    }

    @Test
    fun elevarCuatroAlaCero(){
        val resultadoEsperado = 1.0
        val exponente = 0
        val base = 4
        val aEvaluar = elevarNumero(base,exponente)
        assertEquals(
            resultadoEsperado,
            aEvaluar
        )
    }

}