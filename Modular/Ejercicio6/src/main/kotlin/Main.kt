fun main() {
    val numero = pedirNumero("Introduce un numero real: ")
    if (tieneDecimales(numero)) {
        println("El número $numero tiene decimales.")
    } else {
        println("El número $numero no tiene decimales.")
    }
}

fun pedirNumero(mensaje: String): Double {
    print(mensaje)
    return readln().toDouble()
}

fun tieneDecimales(num: Double): Boolean {
    return num % 1 != 0.0
}