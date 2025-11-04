fun main() {
    var Vector:Array<Int> = Array(10) {-1}
    var cont=0
    while (Vector.size==cont){
        println (Vector[cont])
        cont++
    }
    println(leer(Vector))

}
fun leer (vector: Array<Int>){
    var cont=0
    while (vector.size==cont){
        println (vector[cont])
        cont++
    }
}

/**    var v1: Array<Int> = Array(3){0}
var v2: Array<Int> = Array(8){5}

rellenar (v1, 1,9)
rellenar(v2, 2, 8)
}
fun rellenar (s:Array<Int>, indice:Int, valor:Int){
if (indice<s.size){
s[indice]=valor
}/