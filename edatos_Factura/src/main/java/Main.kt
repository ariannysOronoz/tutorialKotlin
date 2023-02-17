fun main (){
    println("FACTURA DE VENTA:")
    println("EMISOR:")
    var miEmisor : Emisor = Emisor(
        registroMercantil = "01",
        persona = Persona(
        "LA EMPRESA",
        "0424",
        "RUA PARQUE NUMERO 10",
        "P100"
        )
    )
    println("${miEmisor.persona}   ")
    println("Registro Mercantil : ${miEmisor.registroMercantil}"
    )
    println("CLIENTE:")
    var miReceptor: Receptor =Receptor(
        25083,
        "10",
        Persona(
            "JOSE",
            "0412",
            "RUA JAPPIM NUMERO 200",
            "PL200")
    )
    println("${miReceptor.Persona}")
    println("Registro Mercantil : ${miReceptor.registroMercantil}")
    println("Cedula : ${miReceptor.numeroIdentidad}")

    println("PRODUCTOS:")
    var miProducto: Producto=Producto(
        1,
        "Tortita",
        0,
        0,
        0,
        0,
        0,
    )
    var miProducto2:Producto=Producto(
        2,
        "Orejita",
        0,
        0,
        0,
        0,
        0,
    )
    println("Cantidad:${miProducto.cantidad}  Descripcion:${miProducto.descripcion}  Precio Unitario:${miProducto.precioUnitario}")
    println("sub-TOTAL:${miProducto.subtotal}")
    println("Impuesto:${miProducto.impuesto}")
    println("VENTA TOTAL:${miProducto.valorVentaTotal}")

    var miFactura:Factura=Factura(
        0,
        "15 de Noviembre 2022",
        miReceptor,
        miEmisor,
        listOf(miProducto,miProducto2)

    )
    println("Nro Factura:${miFactura.numeroFactura}")
    println("Fecha:${miFactura.fecha}")
}