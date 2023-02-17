

fun main () {
    var miClasificacion : Char = 'E'

    when (miClasificacion){
        'A' -> {
            println("Salario: 1000")
        }
        'B' -> {
            println("Salario: 850")
        }
        'C' -> {
            println("Salario: 723")
        }
        'D' -> {
            println("Salario: 614")
        }
        'E' -> {
            println("Salario: 522")
        }
        else -> {
            println("Salario no definino")
        }
    }
}