fun main(args: Array<String>) {
    var matriz = Array(6){Array<Int>(6){0} }
    rellenar(matriz)
    imprimir(matriz)
    var x= pedirValor(matriz.size)
    var y =pedirValor(matriz.size)
    imprimirAdyacentes(x,y, matriz)

}
fun imprimirAdyacentes(x:Int, y:Int, m:Array<Array<Int>>){
    var i=-1
    var j=-1
    var nuevaX=0
    var nuevaY=0
    while(i<2){
        j=-1
        while(j<2){
            nuevaX = x + i
            nuevaY = y +j
            if ((nuevaX>=0&&nuevaX<m.size)&&(nuevaY>=0&&nuevaY<m.size)){
                if (!(nuevaX == x) && !(nuevaY == y)) {
                    miimprimir(m[nuevaX][nuevaY])
                }
                if (x!=0 && y!=0) {
                    miimprimir(m[nuevaX][nuevaY])
                }
                if (x==0 || y ==0) {
                    miimprimir(m[nuevaX][nuevaY])
                }
            }
            j++

        }
        println()
        i++
    }

}
fun rellenar(m:Array<Array<Int>>){
    var x=0
    var cont=1
    while (x< m.size){
        var y=0
        while (y< m.size){
            m[x][y]=cont
            cont ++
            y ++
        }
        x++
    }
}
fun imprimir(m:Array<Array<Int>>){
    var x=0
    while (x< m.size){
        var y=0
        while (y< m.size){
            miimprimir(m[x][y])
            y ++
        }
        println()
        x++
    }
}
fun miimprimir(v:Int){
    if (v<10){
        print(" "+"0"+v)
    }else{
        print(" " + v)
    }
}
fun pedirValor(tamanio:Int):Int{
    var valor=0
    do{
        println("Dame un valor del del 1 al $tamanio")
        valor = readln().toInt()
    }while (valor<1 || valor > tamanio)
    return (valor-1)
}

