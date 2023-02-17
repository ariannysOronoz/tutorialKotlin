package punto

//respresenta comportamiento
class Operaciones {

    //las funciones o metodos siempre deben devolver un valor, y recibir un parametro(en teoria)
    fun distanciaEntreDosPuntos(
        a: Punto,
        b: Punto
    ):Int{
        return Math.sqrt(
            Math.pow(
                (b.x - a.x).toDouble(),
                2.0
            ) + Math.pow(
                (b.y - a.y).toDouble(),
                2.0
            )
        ).toInt()
    }


}
