//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {
    var cociente=0


    println("Vamos a hacer una division")

    println("Introduce el denominador:")
    var denominador=readln().toInt()

    println("Introduce el divisor:")
    var divisor=readln().toInt()

    var resto=denominador
    while (resto>=divisor){
        resto -= divisor
        cociente++
    }
    println("La division de ${denominador}/${divisor} da de resto ${resto} y de cociente ${cociente}")




}