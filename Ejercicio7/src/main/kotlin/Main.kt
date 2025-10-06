fun main() {

    println("Introduce un año y dire si es bisiesto o no")
    println("Introduce tu año:")
    var year= readln().toInt()

    if ((year%4==0)&&(year%100!=0)||(year%400==0)) println("Es bisiesto")
    else println("No es bisiesto")

}