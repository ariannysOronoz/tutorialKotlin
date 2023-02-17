package licuadora

interface Motor {

    fun encender(velocidad: Velocidad)
    fun apagar()
    fun estaEncendido():Boolean

}
