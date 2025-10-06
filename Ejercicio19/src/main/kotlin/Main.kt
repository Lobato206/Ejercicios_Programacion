import kotlin.math.sqrt

fun main() {
    var a=0
    var b=0
    var c=0

    println("Vamos a hacer una ecuacion de segundo grado")

    println("Introduce el primer valor")
    a=readln().toInt()

    println("Introduce el segundo valor")
    b=readln().toInt()

    println("Introduce el trecer valor")
    c=readln().toInt()

    var discriminante= (b*b)-4*a*c

    var ecuacion1= ((-b)-sqrt(discriminante.toDouble()))/(2*a)
    var ecuacion2= ((-b)+sqrt(discriminante.toDouble()))/(2*a)


    if(discriminante<0){
        println("No tiene solucion")
    }else if(ecuacion1==ecuacion2){
        println("Solo hay una respuesta y es ${ecuacion1}")
    }else{
        println("Hay dos respuestas, la primera es: ${ecuacion1}; y la segunda es ${ecuacion2}")
    }



}