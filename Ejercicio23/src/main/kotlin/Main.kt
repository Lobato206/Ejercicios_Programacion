fun main() {

    println("Introduce un numero: ")
    var num=readln().toInt()
    var clon=num
    var resta=num

    while(resta>1){
        resta--
        num=num*resta
    }

    println("El factorial de $clon es igual a: $num")

}