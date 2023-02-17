fun leerNumeroDeteclado(): Float {
    var num: Float? = null
    while ( num == null){
        num = try {
            readLine()?.toFloat()
        } catch (ex: java.lang.NumberFormatException) {
            null
        }
    }
    return num
}
fun main () {
    val TemperaturasAgosto: Array <Float> = Array(31, {0f})
    var promedio: Float= 0f
    var media: Float= 0f
    var TemperaturaMasAlta : Float=0f
    var TemperaturaMasBaja : Float=0f


    for(i in 0 .. 30){
        print("ingrese valor ${i+1}: ")
        TemperaturasAgosto[i] = leerNumeroDeteclado()
    }
    TemperaturasAgosto.map{
        promedio = promedio + it
    }
    promedio = promedio/31

    var repeticiones = 1
    TemperaturasAgosto.map{ i ->
        var vecesEncontrado: Int = 0
        TemperaturasAgosto.map{j->
            if (i==j) vecesEncontrado++
        }
        if(vecesEncontrado>repeticiones){
            repeticiones=vecesEncontrado
            media=i
        }
    }

    TemperaturasAgosto.map{
        if (it<TemperaturaMasBaja)
            TemperaturaMasBaja = it
        if (it>TemperaturaMasAlta)
            TemperaturaMasAlta = it
    }


    println("promedio:  $promedio")
    println("media:  $media")
    println("menor:  $TemperaturaMasBaja")
    println("mayor:  $TemperaturaMasAlta")
}