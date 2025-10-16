fun main(){

    println("Calcular la media de tres numeros")

    println("Dame el primer numero:")
    var num1=readln().toDouble()

    println("Dame el segundo numero:")
    var num2=readln().toDouble()

    println("Dame el tercer numero:")
    var num3=readln().toDouble()

    var media= (num1+num2+num3)/3.0
    var redondeo= media.toInt()
    println("La media sin redondear es: ${media}")
    println("La media redondeada es:${redondeo}")


}