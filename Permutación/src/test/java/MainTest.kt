import org.junit.jupiter.api.Test



class MainTest {
    //probando la funcion generando palabras
    @Test
    fun probandoGenerandoPalabras(

    ){
        val stringEsperando : String = "maria"
        val stringIngresado : String = "maria"
        val evalauarString = GenerandoPalabras(
            stringIngresado
        )
        assert(
            stringEsperando.equals(evalauarString)
        )
    }

}