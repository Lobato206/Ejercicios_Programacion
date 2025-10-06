fun main() {
    println("Dame la base de tu rectangulo:")
    var base= readln()
    println("Dame la altura:")
    var altura = readln()

    var baseEntero= base.toInt()
    var alturaEntero= altura.toInt()

    var perimetro= (baseEntero*2) + (alturaEntero*2)
    var superficie= baseEntero * alturaEntero

    println("El perimetro del cuadrado es: ${perimetro}")
    println("La superficie del cuadrado es: ${superficie}")



}