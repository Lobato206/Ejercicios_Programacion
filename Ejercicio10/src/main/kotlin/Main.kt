fun main() {

    var select=0

    println("Esto es un conversor de grados Farenheit")

    do{
        println("Quieres pasar de Celsius a Farenheit (1) o de Farenheit a Celsius (2)?")
        print("Introduce el numero: ")
        select=readln().toInt()

        if ((select>2)||(select<1)) {
            println()
            println("Solo puedes elegir 1 o 2")
            println()
        }

    } while((select>2) || (select<1))

    if (select==1){
        println("Introduce los grados Celsius para pasar a Farenheit")
        print("Introduce el numero: ")
        var gradoc=readln().toDouble()

        var farenheit= (gradoc*9/5)+32
        println("Los grados en Farenheit son: ${farenheit}")
    }else{
        println("Introduce los grados en Farenheit para pasar a Celsius")
        print("Introduce el numero: ")
        var gradof=readln().toDouble()

        var celsius= (gradof - 32) * 5/9
        println("Los grados en Celsius son: ${celsius}")
    }

}