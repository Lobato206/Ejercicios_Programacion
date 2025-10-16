fun main() {

    val DIURNO = 20
    val NOCTURNO = 35
    var diasem=0
    var turno=0
    var repetir=""

    do{
        println("Vamos a calcular tu jornal")
        do {
            println("Que dia es hoy?")
            println("1-Lunes, -2-Martes, 3-Miercoles, 4-Jueves, 5-Viernes, 6-Sabado o 7-Domingo")
            diasem = readln().toInt()

            if((diasem<1) || (diasem > 7)) println("Solo se aceptan numeros del 1 al 7")

        } while ((diasem < 1) || (diasem > 7))

        do{
            println("Tienes turno diurno o nocturno?")
            println("1- Diurno, 2- Nocturno")
            turno=readln().toInt()

            if((turno>2)||(turno<1)) println("Solo puedes elegir entre 1 y 2")
        }while ((turno>2)||(turno<1))
        var precioDiurno=0
        var precioNocturno=0

        if ((diasem == 7)&&(turno==1)){
            precioDiurno=(DIURNO + 10) * 8
            println("Tu salario es ${precioDiurno}5")
        }else if((diasem != 7) && (turno==1)){
            precioDiurno= DIURNO * 8
            println("Tu salario es ${precioDiurno}€")
        }else if((diasem == 7) && (turno==2)){
            precioNocturno= (NOCTURNO + 15) * 8
            println("Tu salario es ${precioNocturno}€")
        }else if((diasem!=7) && (turno==2)){
            precioNocturno=NOCTURNO * 8
            println("Tu salario es ${precioNocturno}€")
        }
        println("Si quieres calcular el jornal de otro empleado pulse s")
        repetir=readln().lowercase()

    }while(repetir=="s")

}