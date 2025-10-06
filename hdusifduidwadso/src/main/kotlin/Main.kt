//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {
    /*var num = 0
    while (num<500){
        println("Dame un numero:")

        num=readln().toInt()*/

    /*println("Hasta donde quieres contar")
    var  total=readln().toInt()
    var i=0
    while(i<=total){
        println(i)
        i++
    }*/
    println("Introduce un numero")
    var num1=readln().toInt()
    var i=0
    println("Dame un numero, si es par contara de 0 a X, y si es impar de X a 0")
    num1=readln().toInt()
    if (num1%2 == 0){
        while(i<=num1) {
            println(i)
            i++
        }
    }else{
        while(num1>=i){
            println(num1)
            num1--
        }
    }
}