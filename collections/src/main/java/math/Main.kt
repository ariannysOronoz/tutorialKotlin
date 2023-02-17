package math

import java.math.BigDecimal

fun main() {
    val productPrices = listOf(
        BigDecimal(33.5),
        BigDecimal(99.99),
        BigDecimal(50.5),
        BigDecimal(10.5)
    )

   val economyPrices = productPrices
       .count {
       it < BigDecimal(50)
   }
    println(economyPrices)


    val total = productPrices.sumOf {
        it.toBigInteger()
    }
    println(total)

    val randomPrices = productPrices.random()
    println(randomPrices)

    val scores = listOf(5.0, 4.9, 4.8, 4.7)
    val avarageScroe = scores
        .average()
        .toFloat()
    println(avarageScroe)

}