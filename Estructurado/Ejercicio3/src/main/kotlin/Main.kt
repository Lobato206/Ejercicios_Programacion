fun main() {
    val pi=3.14
    
    println("Dame el radio de tu circulo:")
    var radio = readln().toDouble()

    var area = pi*(radio*radio)
    var superficie= 2*pi*radio


    println("El área del circulo es: ${area}")
    println("La superficie del circulo es: ${superficie}")

}