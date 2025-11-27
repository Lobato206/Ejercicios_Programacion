const val TAMANIO=5
const val PERSONAS_TESORO=5
const val PERSONAS_MALDICION=4

fun main() {
    var horas= horario()
    println("TerrorLand estará abierto $horas horas")
    println()

    var atracciones: Array<String> = Array (TAMANIO) {""}
    rellenarAtracciones(atracciones)
    var precios: Array<Int> = Array (TAMANIO){0}
    rellenarPrecios(precios)
    var pases: Array<Int> = Array (TAMANIO){0}
    calcularPases(horas, pases)

    var respuesta= menuPases(atracciones,precios, pases)


}

fun pedirDato(mensaje: String): Int {
    print(mensaje)
    var num = readln().toInt()
    return num
}

fun horario(): Int {
    var apertura = 0
    var cierre = 0

    do {
        apertura = pedirDato("Hora de apertura: ")
        if (apertura < 0 || apertura > 23) println("Introduce una hora entre 0 y 23")
    } while (apertura < 0 || apertura > 23)
    do {
        cierre = pedirDato("Hora de cierre: ")
        if (cierre < apertura || cierre > 23) println("Introduce una hora mayor a la de apertura hasta las 23")
    } while (cierre < apertura || cierre > 23)
    var horasAbierto = cierre - apertura
    return horasAbierto
}
fun rellenarAtracciones(datos:Array<String>){
    datos[0]="La mina de las pesadillas"
    datos[1]="Laberinto del horror"
    datos[2]="El tesoro del bandido fantasma"
    datos[3]="La maldicion del pueblo fantasma"
    datos[4]="Zona de Juegos"
}
fun rellenarPrecios(datos:Array<Int>){
    datos[0]= 8     //La mina de las pesadillas
    datos[1]= 5     //Laberinto del horror
    datos[2]= 20    //El tesoro del bandido fantasma
    datos[3]= 10    //La maldicion del pueblo fantasma
    datos[4]= 5     //Zona de Juegos
}
fun calcularPases(horas:Int, pases:Array<Int>){
    pases[0]= Int.MAX_VALUE                         //La mina de las pesadillas
    pases[1]= Int.MAX_VALUE                         //Laberinto del horror
    pases[2]= horas * PERSONAS_TESORO               //El tesoro del bandido fantasma
    pases[3]= (horas * PERSONAS_MALDICION) *2       //La maldicion del pueblo fantasma
    pases[4]= Int.MAX_VALUE                         //Zona de Juegos
}
fun menuPases(atracciones:Array<String>, precios:Array<Int>, pases: Array<Int>): Int{
    var cont=0

    while(cont<atracciones.size){
        print("${cont + 1}.-")
        print(atracciones[cont])
        print(" - ")
        print("${precios[cont]}€")
        print(" - ")
        if (cont==0||cont==1||cont==4) print("Sin limite")
        else print(pases[cont])
        println()
        cont++
    }
    return pedirDato("¿A que atraccion quieres entrar?: ") -1
}