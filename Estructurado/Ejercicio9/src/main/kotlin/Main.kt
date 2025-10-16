fun main() {
    var resta=0
    println("Dame un numero")
    var num1=readln().toInt()

    println("Dame otro numero")
    var num2=readln().toInt()

    if(num1<num2){
        resta= num2-num1
        println("El numero mayor es ${num2} y la resta es: ${resta}")
    }else if (num2<num1){
        resta= num1 - num2
        println("El numero mayor es ${num1} y la resta es: ${resta}")
    }else{
        resta = num1 - num2
        println("Ambos numeros son iguales y la resta es: ${resta}")
    }


}