package actividadTres

fun main() {
    print("Se genero el siguiente saludo aleatorio: ")
    val names : Array<String> = arrayOf("Ann", "Anahi", "anncode", "Irene", "Ani")
    val greetings : Array<String> = arrayOf("Hello", "Hi", "Welcome", "Good Morning", "Hallo")
    val introductions : Array<String> = arrayOf("my name is", "you can call me", "I use named", "I'm")
    print("${phrase(names,greetings,introductions)}")
}

fun generateRandomIntroduction (
    theArrayRandom : Array<String>
) : Int {
    val randIndex = (Math.random() * theArrayRandom.size).toInt()

    return randIndex
}


fun phrase (
    names : Array<String>,
    greetings : Array<String>,
    introductions :Array<String>

)  : String{
    val names = names[generateRandomIntroduction(names)]
    val greetings = greetings[generateRandomIntroduction(greetings)]
    val introductions = introductions [generateRandomIntroduction(introductions)]
    val message = "$greetings $introductions $names"

    return message.toString()
}


