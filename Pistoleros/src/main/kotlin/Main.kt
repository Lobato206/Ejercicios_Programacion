import kotlin.random.Random
const val N=3
fun main(args: Array<String>) {
    val M=5
    var pistoleros= Array(M){Array(N){ Random.nextInt(65,91)}}
    var ganador=Array(M){0}
    var contador =2
    var pi1=0
    var pi2=1
    var tPis1=0
    var tPis2=0
    var elKiller=0
    while (contador< M){
        var numerosecreto=Random.nextInt(65,91)
        var Arraypis1= devolverValores(pistoleros,pi1)
        var Arraypis2= devolverValores(pistoleros,pi2)
        var tPis1= calcularPuntos(Arraypis1,Arraypis2,numerosecreto)
        var tPis2= calcularPuntos (Arraypis2,Arraypis1,numerosecreto)
        if (tPis1 > tPis2){
            pi2= contador
            ganador[pi1]= ganador[pi1] + 1
            elKiller=pi1
        }else{
            pi1= contador
            ganador[pi2]= ganador[pi2] + 1
            elKiller=pi2
        }

        contador ++
    }
    imprimirResultados(ganador)
}
fun imprimirResultados(g:Array<Int>){
    var cont = 0
    var ganador = 0
    while(cont<g.size){
        println("El pistolero ${cont+1} duelos ganados ${g[cont]}")
        if (g[cont]>g[ganador]){
            ganador = cont
        }
        cont ++
    }
    println("El gandor es pistolero $ganador")
}
fun calcularPuntos(v1: Array<Int>, v2: Array<Int>, numeroSecreto: Int):Int{
    var valor1=compararSumaTotal(v1, v2)
    var valor2=compararValoresPorPosicion(v1, v2)
    var valor3=puntosPorLetras(v1)
    var valor4=contarCoincidenciasConNumeroSecreto(v1,numeroSecreto)
    var sumaTotal = valor1 +valor2 +valor3+valor4

    return sumaTotal

}
fun compararSumaTotal(v1: Array<Int>, v2: Array<Int>): Int{
    var cont = 0
    var sumav1 =0
    var sumav2 =0
    var suma=0
    while(cont<v1.size){
        sumav1= sumav1 + v1[cont]
        sumav2= sumav2 + v2[cont]
        cont ++
    }
    if (sumav1>sumav2){
        suma ++
    }
    return suma
}
fun compararValoresPorPosicion(v1: Array<Int>, v2: Array<Int>): Int{
    var cont = 0
    var suma =0
    while(cont<v1.size){
        if (v1[cont] > v2[cont]){
            suma ++
        }
        cont ++
    }
    return suma
}
fun puntosPorLetras(v: Array<Int>): Int{
    var cont = 0
    var suma =0
    while(cont<v.size){
        when (v[cont]){
            65,69,73,79,85 -> suma+=2 //suma =suma = 2
            else -> suma ++
        }
        cont ++
    }
    return suma
}
fun contarCoincidenciasConNumeroSecreto(v1: Array<Int>,numeroSecreto: Int): Int{
    var cont = 0
    var suma =0
    while(cont<v1.size){
       if (v1[cont]==numeroSecreto ){
           suma++
       }
        cont ++
    }
    return suma
}

fun devolverValores(p:Array<Array<Int>>,valor:Int):Array<Int>{
    var a=Array<Int>(N){0}
    var cont=0
    while(cont<p[valor].size){
        a[cont] = p[valor][cont]
        cont ++
    }
    return a
}
