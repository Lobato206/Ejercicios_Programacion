import kotlin.math.sqrt

fun main() {
    println("Raices Cuadradas en modular")
    do {
        var num = pedirNumero("Introduce un numero: ")
        if (comprobar(num)) {
            var raiz = raiz(num)
            println("La raiz de ${num} es ${raiz} ")
        } else println("No se puede hacer la raiz con un numero negativo")
    }while(!comprobar(num))
}

fun raiz(n: Double): Double {
    var r = sqrt(n)
    return r

}

fun pedirNumero(mensaje: String): Double {
    print(mensaje)
    var num = readln().toDouble()
    return num
}

fun comprobar(num: Double): Boolean {
    var resultado = false
    if (num >= 0) resultado = true
    return resultado
}