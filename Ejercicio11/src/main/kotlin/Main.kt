fun main() {

    println("Introduce tres numeros y dire si estan organizados de mayor a mayor")

    println("Dame el primer numero")
    var num1=readln().toInt()

    println("Dame el segundo numero")
    var num2=readln().toInt()

    println("Dame el tercer numero")
    var num3=readln().toInt()

    if((num1<num2) && (num2<num3)){
        println("Estan ordenados de menor a mayor")

    }else println("No estan organizados de menor a mayor")

}