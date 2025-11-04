fun main() {
    var vidaJugador = 20
    var enemigos = 5
    val escudoActivo = true
    var turnos = 0

    while ((vidaJugador > 0 && enemigos > 0) || (escudoActivo && turnos < 3)) {
        if (vidaJugador < 5 && !escudoActivo) {
            println("Turno ${turnos}: crifico, te están derrotando.")
                    turnos++;
                vidaJugador -= 3
            } else if (escudoActivo && vidaJugador < 10) {
                    println("Turno ${turnos}: escudo protege tu vida.")
                    turnos++
            vidaJugador -= 3
            } else {
                    println("Turno ${turnos}: atacas a los enemigos.")
                    enemigos--;
                turnos++
                        vidaJugador -= 3
            }
        }

        println("Batalla terminó en el turno ${turnos}. Vida: $vidaJugador, enemigos restantes: $enemigos}")
        }