fun main() {
    var matriz= Array(4){Array<Int> (4){0} }
    var i=0
    var j=0
     rellenar(matriz)

    while (i<matriz.size){
        while(j<matriz[i].size){
            if(matriz[i][j]<10){
                print("[0${matriz[i][j]}]")
            }else{
                print("[${matriz[i][j]}]")
            }
           j++
        }
        j=0
        println()
        i++
    }
    println()
    i=0

    trasponer(matriz)

    while (i<matriz.size){
        while(j<matriz[i].size){
            if(matriz[i][j]<10){
                print("[0${matriz[i][j]}]")
            }else{
                print("[${matriz[i][j]}]")
            }
            j++
        }
        j=0
        println()
        i++
    }


}
fun rellenar(matriz:Array<Array<Int>>){
    var cont=1
    for(i in matriz.indices){
        for (j in matriz[i].indices){
            matriz[i][j]=cont
            cont++
        }
    }
}

fun trasponer(matriz:Array<Array<Int>>){
    var aux=0
    /*for (i in matriz.indices){
        for (j in matriz[i].indices){
            aux=matriz[i][j]
            matriz[j][i]=aux
        }
    }*/
    var i=0
    var j=0
    while (i<matriz.size){
        while(j<matriz[i].size){
            aux=matriz[i][j]
            matriz[i][j]=matriz[j][i]
            matriz[j][i]=aux
            j++
        }
        j=0
        i++
    }
    i=0
}