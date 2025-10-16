fun main() {
    println("Dame un numero y te dire si es positivo o negativo")
    var num = pedirNumero("Dame un numero: ")
    if(comprobar(num)) println("El numero es positivo")
    else println("El numero es negativo")

}

fun pedirNumero(mensaje:String): Int {
    print(mensaje)
    var num = readln().toInt()
    return num
}

fun comprobar(num: Int): Boolean {
    var resultado=false
    if (num >= 0) resultado=true
    return resultado
}