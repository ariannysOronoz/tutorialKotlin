package Transformation

fun main() {
    val languages = listOf(
        "Java",
        "C",
        "php",
        "swift"
    )
    val strLanguages = languages.map {
        "Language: $it"
    }
    strLanguages.forEach{
        println(it)
    }

    val numbers = listOf(1,2,3)
    val items = numbers.map {
       "$it. Item"
    }
    println(items.joinToString())

    val data = listOf("1","2","*","3","/")
     val dataNumbers = data.mapNotNull {
        it.toIntOrNull()
    }

    println(dataNumbers)
    val sum = dataNumbers.sum()
    println(sum)


}