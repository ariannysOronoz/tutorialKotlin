package tipoDato

fun main () {
    //Byte -127 - 128
    val age : Byte = 20
    val newAge : Byte = 20

    //Int
    //2 mil millones
    val productId = 2147483747
    val productId2 = 2_147_483_747

    //val productId3 : Int = 2_147_483_748

    //Int
    //9 trillones
    val userId: Long = 9_223_372_036_854_775_807
    val userId2 = 9_223_372_036_854_775_807L

    //Int
    val myDouble = 2.123456789112345678 //18
    val myFloat = 2.12345678911234567F

    println(myDouble)
    println(myFloat)

    val isLoggedIn = true
    val hasAddress = false

    // Operaciones logicas
    // o tabla de la verdad
    // And
    // true & true = true
    // true & false = false
    // false & true = false
    // false & false = false

    // Or
    // true | true = true
    // true | false = true
    // false | true = true
    // false | false = false

    // Not
    // !true = false
    // !false = true

    //3 formas de trabajar con operaciones logicas
    //And
    println(isLoggedIn && hasAddress)
    //comparando con las operaciones de Kotlin
    println(isLoggedIn.and(hasAddress))
    //usando infix functions.
    println(isLoggedIn and hasAddress)

    //Or
    //negaciones
    println(!isLoggedIn) // false
    //de acuerdo kotlin
    println(isLoggedIn.not())

    //char
    val keyInserted = 'a'
    println(keyInserted)
    //usando secuencias de escape
    println('\$') //detecta que es objeto y char lo que esta en comilla simple
    println('\'')





}