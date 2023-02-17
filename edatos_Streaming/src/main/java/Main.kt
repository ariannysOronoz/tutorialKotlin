fun main() {
    println("STREAMING")
    println("PERFIL DE:")
    var miDatoUsuario : DatoUsuario = DatoUsuario(
        "Pedro",
        "pedro@gmail.com",
        "04249556374",
        "debito"
        )
    println("${miDatoUsuario.nombre}   ")

    println("MI LISTA:")
    var miLista: miLista = miLista(
        pelicula(formato(
            "Piratas Del Caribe",
            "3:00",
            "50 Actores",
            "10 personas",
            "Shakira",
            "ingles"
        ),
            1),
        series(formato(
            "EL CHAVO",
            "3:00",
            "20 actores",
            "10 personas ",
            "Luis Miguel",
            "Ingles"
        ),
            0,
            0
        )
    )
    println("${miLista.pelicula.formato}")
    println("${miLista.series.formato}")

}