import kotlin.random.Random

const val TAMANIOMAXIMO=18
fun main() {
    var tamanio=pedirTamanio()
    var maximoCartas=tamanio/2
    var tablero= rellenarVector(tamanio, maximoCartas)
    var tirada = pedirTirada()
    var resultado= jugar(tablero, tirada)

}
fun pedirTamanio():Int{
    var t=0
    do{
        println("Dame el tamaño del tablero (Numero Par)")
        t=readln().toIntOrNull()?:1
    }while (t%2 != 0)

    return t
}

fun generarCartas(c:Int):String{
    var s=""
    var contar=1
    while(contar<=c){
        s=s+contar+contar
    }

}

fun rellenarVector(v:Int, c:Int):Array<Int>{
    var a: Array<Int> = Array(v){0}
    var posicion=0
    var cartas= generarCartas
    while (posicion<a.size){
        a[posicion]=
    }
}

fun rellenarVectorBruto(v:Int, c:Int):Array<Int>{
    var a: Array<Int> = Array (v) {0}
    var carta=1
    while(carta<=c){
        var contar=0
        while(contar<2){
            var posicion=Random.nextInt(0,c)
            if(a[posicion]==0){
                contar++
                a[posicion] = carta
            }
        }
    }
}