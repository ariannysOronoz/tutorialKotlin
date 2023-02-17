package conversionDatos

fun main() {
    val productLowStock: Byte = 20
    val productStock: Int = productLowStock.toInt()
    println(productStock)


    val numberString = "1"
    val numberByte: Byte = numberString.toByte()
    println("El numero en byte es: $numberByte")

    val numberDouble = numberString.toDouble()
    println("El numero en Double es: $numberDouble")

    // ♡  0x2661
    // ❤ 0x2764

    val unicodeInt = 0x2661
    val unicodeChar = unicodeInt.toChar()
    val unicode = unicodeChar.toString()

    println(unicode)

}