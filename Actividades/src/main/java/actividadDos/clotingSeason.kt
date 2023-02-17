package actividadDos

fun main() {
    val temperatura = 20
    println("Temperatura: $temperatura")

     when {
        temperatura < 20 -> println("Usa un abrigo hace frio")
        temperatura in 20..30 -> println("Te ira bien " +
                "si usas una chaqueta el clima esta templado")
        temperatura > 30 -> println("Es mejor que lleves algo ligero, hace calor")
    }

}