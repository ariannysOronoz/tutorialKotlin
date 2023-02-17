import org.junit.jupiter.api.Test

class MainTest {
    @Test
    fun testingAssert(){
        assert(true)
    }

    @Test
    //Invertir String
    fun ProbandoInvertirString(

    ){
        val stringEsperado : String = "5,4,3,2,1"
        val stringIngresado: String = "1,2,3,4,5"
        val evaluarString = invertirString(
            stringIngresado
        )
        assert(
            stringEsperado.contentEquals(evaluarString)
        )
    }

    @Test
    fun probandoEsCapicua(

    ){
        val stringIngresado : String = "Es capicua"
        val booleanEsperado : Boolean = true
        val evaluarEsCapicua = esCapicua(
            stringIngresado
        )
        assert(
            booleanEsperado.also { evaluarEsCapicua }
        )
    }

    @Test
    //mensaje cuando ES capicua
    fun probandoObtenerMsgSiCapicua(

    ){
        val booleanMensajeIngresado : Boolean = true
        val stringEsperado: String  = "es capicua"
        val evaluarEsCapicua = obtenerMsgSegunValor(
            booleanMensajeIngresado
        )
        assert(
            booleanMensajeIngresado.also { stringEsperado }

        )
    }
    //mensaje cuando NO es capicua
    @Test
    fun probandoObtenerMsgNoCapicua(

    ){
        val booleanMensajeIngresado : Boolean = false
        val stringEsperado: String  = "no es capicua"
        val evaluarEsCapicua = obtenerMsgSegunValor(
            booleanMensajeIngresado
        )
        assert(
            booleanMensajeIngresado.also { stringEsperado }.not()

        )
    }


}
