fun main() {

    println("Introduce un numero:")
    val numero = readln().toInt()

    /*if (numero>0){
        println("${numero} es un numero positivo")
    }
    println("Soy una linea secuencial detras de un if")*/

    if(numero <0){
        println("este numero es negativo")
    }else if(numero >0){
        println("Este numero es positivo")
    }else{
        println("El numero es 0")
    }


}