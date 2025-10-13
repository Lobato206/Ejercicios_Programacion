fun main() {
    println("Notas de clase")

    /*println("Cuantos alumnos tienes en clase?")
    var alumno=readln().toInt()
    var contAlumno=0
    var aprobado=0
    var suspenso=0
    var nota=0
    while(alumno>0){
        contAlumno++
        do{
            println("Dame la nota del alumno numero ${contAlumno}: ")
            nota=readln().toInt()
            if((nota<0)||(nota > 10))println("Las notas tienen que ser entre 0 y 10")
        }while((nota<0)||(nota > 10))


        if(nota>=5) aprobado++
        else suspenso++

        alumno--
    }

    println("La cantidad de aprobados es ${aprobado} y la cantidad de suspensos es ${suspenso}")*/


    var contAlumno=1

    var sobresaliente=0
    var notable=0
    var bien=0
    var suspenso=0

    do{
        println("Dame la nota del alumno numero ${contAlumno}: ")
        var nota=readln().toInt()

        when (nota){
            in 9..10 -> sobresaliente++
            in 7..8 -> notable++
            in 5..6 ->bien++
            else -> suspenso++
        }

        contAlumno++
    }while((nota>0))

    print("Sobresalientes: ${sobresaliente} .\n" +
            "Notables: ${notable} .\n" +
            "Bienes: ${bien} .\n" +
            "Suspensos ${suspenso}")

}