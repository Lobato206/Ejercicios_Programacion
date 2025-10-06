fun main() {
    var h=0
    var m=0
    var s=0
    println("Esto es un reloj, introduce la horo, minuto y segundo que desees y se sumara  un segundo")
    do{
        print("Dame la hora (horario 24h): ")
        h=readln().toInt()
        if ((h<0)||(h>23)) println("Solo horas desde las 0 a las 23")
    }while((h<0)||(h>23))
    do{
        print("Dame los minutos: ")
        m=readln().toInt()
        if((m<0)||(m>59))println("Solo minutos desde las 0 y 59")
    }while((m<0)||(m>59))
    do {
        print("Dame los segundos: ")
        s = readln().toInt()
        if ((s<0)||(s>59)) println("Solo segndos desde 0 y 59")
    }while((s<0)||(s>59))


    s=s+1

    if(s==60){
        s=0
        m=m+1
        if (m==60){
            m=0
            h=h+1
            if(h==24){
                h=0
            }
        }
    }
    println("La hora es: ${h}:${m}:${s}")

}