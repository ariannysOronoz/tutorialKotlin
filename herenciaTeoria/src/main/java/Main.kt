fun main (){
    println("OBJETO INSTRUMENTO ")
    var miInstrumento : instrumentoMusical = instrumentoMusical(
        "",
        ""
    )
    miInstrumento.marca="AAA"
    miInstrumento.tocar()
    miInstrumento.limpiar()


    println("OBJETO GUITARRA ")
    var miGuitarra : guitarra = guitarra(
        "Blanca",
        "Guitarra",
        "Cuerda"
    )
    miGuitarra.afinar()
    miGuitarra.tocar()

    println("OBJETO FLAUTA ")
    var miFlauta : flauta = flauta(
        "grande",
        "cosita",
        "Viento"
    )
    miFlauta.marca="Gato"
    miFlauta.brillar()
    miFlauta.limpiar()
    miFlauta.tocar()

    //forma explicita
    /*miFlauta.nombre="cosita"
    miFlauta.tipoInstrumento="Viento"
    miFlauta.marca="Gato"*/
}