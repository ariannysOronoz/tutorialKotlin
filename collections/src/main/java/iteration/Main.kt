package iteration

fun main() {
    val list = listOf(1,2,3)
    println(list[2])

    list.forEach{
        println(it)
    }

    println()
    println("SET")

    val set = setOf(1,2,2,3)
    println( set.size)
    set.forEach {
        println(it)
    }

    val setNames = setOf("Ann","Anahi","Ann")
    setNames.forEach {
        println(it)
    }


    //sintaxis para agregar clave , valor
    val map = mapOf(
        1 to "Anahi",
        2 to "sandra",
        3 to "Ramon"
    )

    map.forEach{
        val item = it.key
        val name = it.value
        println("$item. $name")
    }



}