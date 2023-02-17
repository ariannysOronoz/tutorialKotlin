data class Factura (
    var numeroFactura:Int,
    var fecha:String,
    var datoReceptor:Receptor,
    var emisor: Emisor,
    var producto: List<Producto>
    )