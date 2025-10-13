import kotlin.random.Random
import kotlin.random.nextInt

fun main() {
    var numSecreto: Int = 0
    var cont = 0
    var num: Int = 0
    var opcion = ""
    do {
        println("Tienes 5 intentos para adivinar el numero secreto")
        numSecreto = Random.nextInt(1..100)
        println(numSecreto)
        do {
            println("Introduce un numero")
            num = readln().toInt()

            when {
                (num < numSecreto) -> println("El numero secreto es mayor")
                (num > numSecreto) -> println("El numero secreto es menor")
                (num == numSecreto) -> println("Felicidades, Has ganado")
            }
            /*if (num<numSecreto) println("El numero secreto es mayor")
            else if (num>numSecreto) println("El numero secreto es menor")
            else if (num==numSecreto) println("Felicidades, Has ganado")*/
            cont++
        } while ((num != numSecreto) && (cont < 5))
        cont = 0

        println("El numero secreto es ${numSecreto}")
        println("Quieres volver a jugar? S/N")
        opcion = readln().lowercase()
    } while ((opcion == "s") || (opcion == "si"))
}