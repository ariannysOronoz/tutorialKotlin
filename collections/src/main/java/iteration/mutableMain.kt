package iteration

fun main() {
    println("MUTABLE LIST")
    val list = listOf(1,2,3)
    val anothermutableList : MutableList<Int> = list.toMutableList()

    val mutableList = mutableListOf(1,2,2,3)
    mutableList.add(4)
    mutableList[2] = 3
    mutableList.removeAt(3)

    mutableList.forEach{
        println(it)
    }

    println()
    println("MUTABLE SET")
    val muatableSet = mutableSetOf(1,2,2,3)
    muatableSet.forEach {
        println(it)
    }

    println()
    println("MUTABLE MAP")
    val mutableMap = mutableMapOf <Int, String>(
        1 to "Anahi",
        2 to "sandra",
        3 to "Ramon"
    )

    mutableMap[4] = "Andres"

    mutableMap.forEach{
        val item = it.key
        val name = it.value
        println("$item. $name")
    }


}
