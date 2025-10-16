fun main() {

    var mes=0
    var year=0

    println("Introduce un mes y un año y te dire cuantos dias tiene el mes y si es bisiesto o no")
    do{
        println("Introduce el mes: \n" +
                "1.- Enero, 2.- Febrero, 3.- Marzo, ...")
        mes=readln().toInt()
        if((mes<1)||(mes>12)) println("Solo valen digitos del 1 al 12")
    }while ((mes<1)||(mes>12))

    println("Introduce un año")
    year=readln().toInt()

    when(mes){
        1,3,5,7,8,10,12 -> println("Este mes tiene 31 dias")
        4,6,9,11-> println("Este mes tiene 30 dias")
    }
    if((mes==2)&&(year%4==0)&&(year%100!=0)||(year%400==0)) println("Este mes tiene 29 dias")
    else if(mes==2) println("Este mes tiene 28 dias")
    when {
        ((year%4==0)&&(year%100!=0)||(year%400==0)) -> println("Es bisiesto")
        else -> println("No es bisiesto")
    }




}