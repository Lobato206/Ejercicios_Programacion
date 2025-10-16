fun main() {
    val PRECIO_KILOMETRO=2.5

    var descuento=0.0

    println("Vamonos de viaje, dime los kilometros y los dias de estancia")
    print("Introduce los kilometros:")
    var kilometros=readln().toDouble()

    println()
    print("Introduce los dias de estancia:")
    var dias=readln().toInt()
    var precio=PRECIO_KILOMETRO*kilometros
    if((dias>7)&&(kilometros>800)){
        descuento=precio*0.3
        precio=precio-descuento
    }
    println("El precio es $precio €")


}