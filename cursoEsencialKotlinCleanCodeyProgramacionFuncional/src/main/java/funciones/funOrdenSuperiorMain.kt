package funciones

fun main() {

    val isValid = isValid(5) {
        it > 4
    }

    println(isValid)
    consultProductId(onNext = getOnNextProductIdBehavior())

    val number: Int? = null
    number?.inc()

}

fun isValid(x: Int, validate: (x: Int) -> Boolean): Boolean = validate(x)

fun consultProductId(onNext: (productId: String) -> Unit) {
    // BD
    // Api
    val productId = "WERT123"
    //ejecutando la lambda
    onNext(productId)
}

fun getOnNextProductIdBehavior(): ((productId: String) -> Unit) {
    return {
        println("Go to Product Detail Screen with product Id: $it")
    }
}
