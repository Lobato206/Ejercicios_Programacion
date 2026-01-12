import kotlin.collections.indices
import kotlin.random.Random

const val VACIO=0
const val MOSCA = 1
const val GANAR=2
const val NOENCONTRADO=0
const val CERCA=1
fun main() {
    var tamanio = pedirDato("Dame el tamaño del tablero: ")
    var tablero = rellenarTablero(tamanio)

    do {

        imprimir(tablero)
        var tirada = tirada(tamanio)

        when (buscarMosca(tablero, tirada)) {
            NOENCONTRADO -> println("No encontrado")
            CERCA -> {
                println("Has estado cerca, la mosca ha volado")
                tablero = rellenarTablero(tamanio)
                imprimir(tablero)
            }

            GANAR -> {
                matarMosca(tablero, tirada)
                println("Has matado a la mosca ¡HAS GANADO!")
            }
        }
        var estado = analizarTablero(tablero)
    } while (estado)


}
fun analizarTablero(t:Array<Array<Int>>): Boolean{
    var moscas=false
    var i=0
    var j=0
    while (i<t.size && !moscas){
        while(j<t[i].size && !moscas){
            if (t[i][j]==MOSCA) moscas=true
            j++
        }
        j=0
        i++
    }
    return moscas
}

fun matarMosca(m:Array<Array<Int>>, c:Array<Int>){
    if(m[c[0]][c[1]]==MOSCA){
        m[c[0]][c[1]]=VACIO
    }

}

fun pedirDato(mensaje:String):Int{
    print(mensaje)
    var num=readln().toIntOrNull()?:4
    return num
}

fun adyacentes(m:Array<Array<Int>>, c:Array<Int>): Boolean{
    var resultado=false

    var i= -1
    var j= -1
    while(i<2 && !resultado){
        while (j<2 && !resultado){
            var casillaX=c[0]+i
            var casillaY=c[1]+j
                if (!((casillaX < 0 || casillaX >= m.size) || (casillaY < 0 || casillaY >= m.size))) {
                    if (m[casillaX][casillaY] == MOSCA) {
                        resultado = true
                    }
                }
            j++
        }
        j=-1
        i++
    }

    return resultado
}

fun buscarMosca(m:Array<Array<Int>>, c:Array<Int>):Int{
    var resultado=NOENCONTRADO

    if(m[c[0]][c[1]]==MOSCA){
        resultado=GANAR
    }else if (adyacentes(m,c)){
        resultado=CERCA
    }

    return resultado
}

fun tirada(v:Int):Array<Int>{
    var m= Array<Int>(2){VACIO}

    do{
        print("Dame la fila: ")
        m[0]=readln().toIntOrNull()?:-1

        if((m[0]<0||m[0]>v)){
            println("Debes elegir un numero entre 1 y ${v+1}")
        }
    }while((m[0]<0||m[0]>v))
    m[0]=m[0]-1
    do{
        print("Dame la columna: ")
        m[1]=readln().toIntOrNull()?:-1
        if((m[0]<0||m[1]>v)){
            println("Debes elegir un numero entre 1 y ${v+1}")
        }
    }while(m[0]<0||m[1]>v)
    m[1]=m[1]-1
    return m
}

fun rellenarTablero(v:Int): Array<Array<Int>>{
    var t= Array(v){ Array(v){VACIO} }
    var randomY=0
    var randomX=0
    var cont=0
    while(cont<v/2){
        randomX= Random.nextInt(0,v)
        randomY=Random.nextInt(0, v)
        t[randomX][randomY]=MOSCA
        cont ++
    }

    return t
}

fun imprimir(t:Array<Array<Int>>){
    for(i in t.indices){
        for (j in t[i].indices){
            print("[${t[i][j]}]")
        }
        println()
    }
}