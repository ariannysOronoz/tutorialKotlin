import org.junit.jupiter.api.Test
import io.mockk.every
import io.mockk.mockkStatic

import org.junit.jupiter.api.Assertions.assertTrue

class MainTest {

    @Test
    fun `ingresado un valor mayor que 0 se genera un arreglo de enteros de la misma logitud`(){
        //entrada de datos
        val tamArreglo = 10

        //mock de funcion que no se puede probar
        mockkStatic(::leerNumeroDeteclado)
        every {
            leerNumeroDeteclado()
        } returns "10"

        //prueba de la funcion
        val arreglo = generarArregloConValores(tamArreglo)

        //assert del valor de retorno
        assertTrue(arreglo.size==10)
    }

    @Test
    fun `obtener la suma de todos los elementos en un arreglo`(){
        //entrada de datos
        val arreglo = intArrayOf(1,2,3,4)

        //prueba de la funcion
        val suma = sumarValoresArreglo(arreglo)

        //assert del valor de retorno
        assertTrue(suma==10)
    }

}