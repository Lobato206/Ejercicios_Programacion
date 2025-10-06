import kotlin.random.Random

fun main() {
    var energia: Int
    do {
        print("Ingresa energía inicial (> 0): ")
        energia = readln().toInt()
    } while (energia <= 0)

    var humanosRescatados = 0
    var iteracion = 1

    while (energia > 0 && humanosRescatados < 3) {
        energia -= 1

        var esAmistoso = Random.nextBoolean()
        var humanosEncontrados = if (esAmistoso) Random.nextInt(2)
        else 0

        if (!esAmistoso) {
            energia -= 2
        } else if (humanosEncontrados > 0) {
            energia += 3
            humanosRescatados += 1
        }
        var tipo =""

            if(esAmistoso) {
                tipo = "amistoso"
            } else {
                tipo = "agresivo"
            }

            if (humanosRescatados >= 3) {
            println("\n¡Rescate exitoso!")
        } else {
            println("\nEnergía agotada. Misión fallida.")
        }

    }
}
//Ejercicio: “La Odisea del Faro Celeste”
//
//Eres el ingeniero encargado del Faro Celeste, una estación espacial autónoma que guía naves a través de un cinturón de asteroides vivientes. Cada asteroide puede ser amistoso (te brinda combustible) o agresivo (te roba energía). Tu misión es simular el viaje de rescate de la nave “Aurora”, que se ha desviado y pide auxilio. Debes controlar la energía restante, recopilar combustible y detectar si hay humanos a bordo de los asteroides.
//
//La mecánica es la siguiente:
//
//Arrancas con una cantidad de energía.
//
//Escaneas asteroides de uno en uno hasta que te quedes sin energía o rescates a la “Aurora”.
//
//Cada escaneo:
//
//Consume energía.
//
//Determina aleatoriamente si el asteroide es amistoso (te da combustible) o agresivo (pierdes energía extra).
//
//Si es amistoso, puede que contenga humanos; siempre que encuentres humanos, ganas energía adicional.
//
//El viaje termina cuando:
//
//Encuentras a la “Aurora” (ocurre si sumas cierto número de humanos rescatados), o
//
//Agotas tu energía.