fun main() {
   /* println("Introduce un numero: ")
    var x=readln().toInt()

    when{
        ((x>10)&&(x<20)) -> println("el valor de $x esta entre 10 y 20")
        ((x==10)||(x==20)) -> println("El valor de $x es 10 o 20")
        (!(x==10)) -> println("$x es distinto de 10")
    }*/
    var mes=0
    do{
        println("Introduce un mes: ")
        mes=readln().toInt()
        if((mes>12)||(mes<1)) println("Solo puedes introducir un numero del 1 al 12")
    }while((mes>12)||(mes<1))


    when{
        ((mes==12)||(mes==1)||(mes==2)) -> println("Estamos en Invierno")
        ((mes==3)||(mes==4)||(mes==5)) -> println("Estamos en Primavera")
        ((mes==6)||(mes==7)||(mes==8)) -> println("Estamos en Verano")
        ((mes==9)||(mes==10)||(mes==11)) -> println("Estamos en Otoño")
    }


}