import kotlin.random.Random
import kotlin.random.nextInt
import kotlin.uuid.Uuid.Companion.random

fun main() {
    println("Bienvenido a la quiniela del partido\n" +
            "Hoy juega el Atletico de Madrid (1) contra el Real Madrid (2)")
    var cont=0
    var equipo1=0
    var equipo2=0
    var empate=0
    while (cont<15){
        var quiniela= Random.nextInt(1..3)
        when (quiniela){
            1->equipo1++
            2->equipo2++
            3->empate ++
        }

        cont++
    }
    if ((equipo1>equipo2)&&(equipo1>empate)) println("Las espectativas estan para el Atletico de Madrid")
    else if ((equipo2>equipo1)&&(equipo2>empate)) println("Las espectativas estan con el Real Madrid")
    else if((empate>equipo1)&&(empate > equipo2)) println("Las espectativas dan a un empate")

    println("Estos son los resultados de las quinielas\n" +
            "Atletico de Madrid: $equipo1 \n" +
            "Real Madrid: $equipo2 \n" +
            "Empate: $empate")


}