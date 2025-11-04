fun main() {
    println("Comprobaremos si un año es bisiesto o no")
    var num=pedirNumero("Introduce un año: ")
    when(comprobar(num)){
        true -> println("El año es bisiseto")
        false -> println("El año no es bisiesto")
    }
}
fun pedirNumero(mensaje:String): Int {
    print(mensaje)
    var num = readln().toInt()
    return num
}
fun comprobar(num: Int): Boolean{
    val year=num
    var bisiesto=false
    if((year%4==0)&&(year%100!=0)||(year%400==0)) bisiesto=true

    return bisiesto
}