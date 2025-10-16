fun main() {
    var num=0
    do{
        println("Introduce el numero de ejercicio que quieres: (23,29,31)")
        num=readln().toInt()
        if((num!=23)&&(num!=29)&&(num!=31)) println("Solo estan los ejercicios 23, 29 y 31")
    }while((num!=23)&&(num!=29)&&(num!=31))

    if(num==23){
        println("Introduce un numero: ")
        var num=readln().toInt()
        var clon=num
        var resta=num

        while(resta>1){
            resta--
            num=num*resta
        }

        println("El factorial de $clon es igual a: $num")
    }else if(num==29){
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

    }else if(num==31){

    }


}