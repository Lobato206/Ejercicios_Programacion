fun main() {

    println("Esto es un reloj, introduce la hora, minuto y segundo que desees y se sumara un segundo")
    var hora = pedirHora("Dame la hora:", 0, 24)
    var minutos=pedirHora("Dame los minutos: ", 0, 59)
    var segundos=pedirHora("Dame los segundos: ", 0, 59)
}
fun pedirHora(mensaje:String, vmin:Int, vmax:Int):Int{
    var num=0
    do{
        print(mensaje)
        num=readln().toInt()
        if ((num<vmin)||(num>vmax)) println("Solo horas desde las 0 a las 23")
    }while((num<vmin||(num>vmax))
    return num
}
fun calculo(hora:Int, minuto:Int, segundo:Int){

}