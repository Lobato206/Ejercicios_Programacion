import kotlin.math.sqrt

fun main() {

   /* println("Vamos a calcular la raiz de el numero que nos pases por teclado")
    println("Introduce un numero:")
    var numero= readln().toDouble()

    if (numero<0){
        println("No se pueden hacer raices de numeros negativos")
    }else{
        var raiz= sqrt(numero)
        println("La raiz cuadrada de ${numero} es: ${raiz}")
    }*/



    /*println("Vamos a calcular la raiz de el numero que nos pases por teclado")
    println("Introduce un numero")
    var numero=readln().toDouble()
    while (numero<0) {
        println("El numero no es valido")
        println("Introduce otro numero:")
        numero = readln().toDouble()
    }

    var raiz= sqrt(numero)
    println("La raiz cuadrada de ${numero} es: ${raiz}")
    */

    var numero = 0.0
    do {
        println("Introduce un numero positivo:")
        numero = readln().toDouble()
        if (numero<0) println("Dame un numero positivo")
    } while (numero<0)

    var raiz = sqrt(numero)
    println("La raiz cuadrada de ${numero} es: ${raiz}")


}