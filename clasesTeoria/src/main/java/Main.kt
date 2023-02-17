fun main (){

    println("EJEMPLOS DE PROGRAMACION ORIENDATO A OBJETOS ")
    var miObjetoPersona : Persona = Persona("111","pepe",21,"1234567")
    var miObjetoPersona2 : PersonaData = PersonaData(
        "111",
        "Cristian",
        21,
        "1234567"
    )
   /*
    //asignando valores:
    miObjetoPersona.nombre = "Cristian"
    miObjetoPersona.documento = "111"
    miObjetoPersona.edad = 21
    miObjetoPersona.telefono = "1234567"
    */

    //mostrar la informacion mediante sus atributos
    println("El nombre de la persona es : ${miObjetoPersona.nombre}")
    //mostrar la informacion mediante los metodos:
    miObjetoPersona.caminar()
    miObjetoPersona.imprimirDatos()

    val p1 = Persona1()
    val p2 = Persona1("123123","Pedro")
    val pD = PersonaData()
    val pD3 = PersonaData2(documento = "12312312", nombre = "Carlos")
    val pD2 = PersonaData(nombre = "Pepe", telefono = "2020202020")
    val pdk = PersonaKDP(pD)



}



