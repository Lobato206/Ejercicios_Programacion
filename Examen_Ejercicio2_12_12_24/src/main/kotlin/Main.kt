import kotlin.random.Random

const val N_PISTOLERO = 5
const val VALOR = 3
fun main() {
    var valores = Array(N_PISTOLERO) { Array<Int>(VALOR) { 0 } }
    var p=valores.size
    var pist1 = 0
    var pist2 = 1
    var puntos: Array<Int> = Array(N_PISTOLERO) { 0 }
    var cont = 1
    var x: Int = 0
    var y: Int = 0
    rellenarValores(valores)
    while (x < valores.size) {
        while (y < valores[x].size) {
            print("[${valores[x][y]}]")
            y++
        }
        println()
        y = 0
        x++
    }


}

fun rellenarValores(valor: Array<Array<Int>>) {
    var x = 0
    var y = 0
    while (x < valor.size) {
        while (y < valor[x].size) {
            valor[x][y] = Random.nextInt(65, 90)
            y++
        }
        y = 0
        x++
    }
}
/*fun rellenarPuntos(valor: Array<Int>, puntos:Array<Array<Int>>){
    var y = 0
    valor[y]=calcularPuntos(puntos, y)
}*/

fun calcularPuntos(valor: Array<Array<Int>>, pistolero: Int): Int {
    var y = 0
    var puntos = 0

    while (y < valor[pistolero].size) {
        if (valor[pistolero][y].toChar() == 'A' || valor[pistolero][y].toChar() == 'E' || valor[pistolero][y].toChar() == 'I' || valor[pistolero][y].toChar() == 'O' || valor[pistolero][y].toChar() == 'U') {
            puntos += 2
        } else {
            puntos++
        }
        y++
    }
    y = 0
    return puntos
}
