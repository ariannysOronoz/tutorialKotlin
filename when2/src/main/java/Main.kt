fun main() {

    var miClasificacion: Char = 'B'
    var resultado = when (miClasificacion){
        'A' -> {
            "Salario: 1000"
        }
        'B' -> {
            "Salario: 850"
        }
        'C' -> {
            "Salario: 723"
        }
        'A' -> {
            "Salario: 614"
        }
        'A' -> {
            "Salario: 522"
        }
        else -> {
            "Salario no definido"
        }
    }
    println(resultado)
}