fun main(){

    println("Introduce un numero y se determinara si es positivo o negativo")
    var num=readln().toInt()

    if (num>0) println("El numero ${num} es positivo")
    else if (num<0) println("El numero ${num} es negativo")
    else println("El numero 0 no es positivo ni negativo")


}