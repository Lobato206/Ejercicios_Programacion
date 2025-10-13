fun main() {
    println("Vamos a hacer el perimetro y superficie de un cuadrado")
    print("Introduce un numero: ")
    var lado=readln().toInt()

    println("La superficie es ${superficie(lado)} y el perimetro es ${perimetro(lado)}")

}

fun superficie(lado:Int):Int{
    var s=lado*lado
    return s
}
fun perimetro(lado:Int):Int{
    var p=lado*4
    return p
}