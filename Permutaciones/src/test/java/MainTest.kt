import org.junit.jupiter.api.Test



class MainTest {

    @Test
    fun testingAssert() {
        assert(true)
    }

    @Test
    //funcion uno
    fun probandoFuncionUno(

    ){
        val intEsperado : Int = 123;1123;2123;3123;4123;5123;6123;7123;8123;9123
        val intIngresado: Int = 123
        val evaluarFuncionUno = FuncionUno(
            intIngresado
        )
        assert(
            intEsperado.equals(evaluarFuncionUno)
        )
    }

    @Test
    //funcion dos
    fun probandoFuncionDos(

    ){
        val stringEsperado : String = "120;121;122;123;124;125;126;127;128;129"
        val stringIngresado: String = "123"
        val evaluarFuncionDos = FuncionDos(
            stringIngresado
        )
        assert(
            stringEsperado.contains(evaluarFuncionDos)
        )
    }
}

