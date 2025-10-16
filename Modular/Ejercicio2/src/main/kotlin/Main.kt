import kotlin.math.PI

val VALOR_PI=3.14
fun main() {

    println("Vamos a hacer la circunferencia y el area de un circulo")
    print("Introduce el radio: ")
    var radio=readln().toDouble()

    println("La circunferencia es ${circunferencia(radio)} y el area es ${area(radio)}")

}

fun circunferencia(radio: Double): Double{
    var c= 2*VALOR_PI*radio
    return c
}

fun area(radio:Double):Double{
    var a= VALOR_PI*(radio*2)
    return a
}