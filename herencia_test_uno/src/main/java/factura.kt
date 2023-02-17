class factura (
    emisor:String="",
    cliente:String=""

        ): Precio ("","") {

            override fun imprimirFactura(){
            println(" Emisor: $emisor")
            println(" Cliente: $cliente")
            print("Total de la compra: $total ")
    }

}