fun main() {
    var num=1
    var copia=num

    while (num<=20){
        copia+=num
        num+=2
    }
    println("El resultado es ${copia}")
    println()

    var num1=0
    var num2=0

    println("Introduce dos numeros para sumar consecutivamente")
    print("Inreoduce el primer numero: ")
    num1=readln().toInt()
    print("Introduce el segundo numero: ")
    num2=readln().toInt()
    copia=0
    if (num1<num2){
        while(num1<=num2){
            copia=copia+num1
            num1++
        }
    }else if(num2<num1){
        while(num2<=num1){
            copia=copia+num2
            num2++
        }
    }
    println("El resultado es ${copia}")
}