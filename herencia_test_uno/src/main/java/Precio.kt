// Para hacer uso de la herencia usar OPEN
open class Precio (
    emisor:String,
    cliente:String
) {
    var emisor: String = "LA EMPRESA NACIONAL"
    var cliente: String = "NO DEFINIDO"
    var total: Int = 100

    open fun imprimirFactura(){
        println(" Emisor: $emisor")
        println(" Cliente: $cliente")
        print("Total de la compra: $total ")
    }

}