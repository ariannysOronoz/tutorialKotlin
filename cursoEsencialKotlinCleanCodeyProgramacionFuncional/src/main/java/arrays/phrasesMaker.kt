package arrays

fun main() {

    // Saludo + Introduccion + Nombre

    //Saludo:  hola, hi, bienvenido, buenos dias, hallo
    //Introduccion: Mi nombre es, Puedes llamarme, Usualmente me llaman, Yo soy
    //Nombres: Anahi, Ann, anncode, Ani, Irene

    //declarando arrays
    val greetings = arrayOf("Hola", "Hi", "Te doy la bienvenida", "Buenos días", "Hallo")

    val introductions = arrayOf("mi nombre es", "puedes llamarme", "usualmente me llaman", "yo soy")

    val names = arrayOf("Ann", "Anahí", "anncode", "Ani", "Irene")

    //generando valores aleatorios
    val randIndexGreeting = (Math.random() * greetings.size).toInt()
    val randIndexIntroductions = (Math.random() * introductions.size).toInt()
    val randIndexNames = (Math.random() * names.size).toInt()

    //creando frases, concatenando.
    //interpolaccion de strings.
    val phrase = "${greetings[randIndexGreeting]} ${introductions[randIndexIntroductions]} ${names[randIndexNames]}"

    println(phrase)



}