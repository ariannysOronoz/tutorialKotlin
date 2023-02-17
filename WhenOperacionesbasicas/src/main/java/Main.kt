fun main () {
    var valorA : Int = 2
    var valorB : Int = 2
    var operacion: Char = 'd'

    when (operacion) {
        's' ->{
            println("${valorA + valorB}")
        }
        'r' ->{
            println("${valorA - valorB}")
        }
        'm' ->{
            println("${valorA * valorB}")
        }
        'd' ->{
            if (valorB != 0){
                println("${valorA / valorB}")
            }else{
                println("indeterminado")
            }

        }
        else -> {
            println("no definido")
        }
    }

}