import com.includehelp.basic.Permutation
import com.sun.org.apache.bcel.internal.generic.SWAP
import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.assertAll

class MainTest {
    @Test
    fun testingAssert(){
        assert(true)
    }

    @Test
    //probando swap
    fun probandoSwap (

    ){
        val permutation = Permutation();
        val textoEsperado = "maria"
        val textoIngresado = "airam"
        val evaluarSwap = permutation.swap(textoIngresado,5,0,4)
        assertEquals(
            textoEsperado,
            evaluarSwap
        )
    }
}