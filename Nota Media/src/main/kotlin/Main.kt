fun main() {

    //Ejercicio de calcular medias con constantes y bucles

    val NUM_MEDIA= 3

    var nota=0
    var suma=0
    var cont=1

    println("Dame ${NUM_MEDIA} numeros para hacer la media")
    while (cont<=NUM_MEDIA){
        println("Dame un numero")
        nota=readln().toInt()

        suma=suma+nota

        cont++
    }
    suma=suma/NUM_MEDIA

    println("La media de tus notas son: ${suma}")



}