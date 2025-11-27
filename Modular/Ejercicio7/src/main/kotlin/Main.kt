fun main () {
    var resultado=0
    var eleccion=0
    println("Conversor de grados")
    do{
        eleccion = pedirNumero("1.- De Centigrados a Farenheith \n" +
            "2.- De Farenheith a Centigrados \n" +
            "Introduce un numero: ")
        if (eleccion!=1 && eleccion!=2) println("Solo puedes elegir 1 o 2")
    } while (eleccion!=1 && eleccion!=2)
    var grados = pedirNumero("Introduce los grados: ")
    if (eleccion==1){
        resultado=farenheith(grados)
    }else if(eleccion==2) {
        resultado=celsius(grados)
    }
    println("El resultado son $resultado grados")

}

fun pedirNumero(mensaje: String): Int {
    print(mensaje)
    return readln().toInt()
}

fun celsius (grados:Int) : Int{
    return (grados - 32) * 5/9
}

fun farenheith (grados:Int) : Int{
    return (grados*9/5)+32
}