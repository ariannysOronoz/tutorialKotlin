package split

fun main() {
    val superMarket = listOf(
        "Milk",
        "Eggs",
        "Juice",
        "Meat",
        "Rice",
    )

    val breakFast = superMarket
        .take(3)
        .filterNot {
            it == "Eggs"
        }

    println(breakFast.joinToString())


    val dinnerList = superMarket.drop(3)
    println(dinnerList.joinToString())
}