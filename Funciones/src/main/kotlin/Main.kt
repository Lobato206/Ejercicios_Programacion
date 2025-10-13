//TIP Para <b>ejecutar</b> el código, pulsa <shortcut actionId="Run"/> o
// Clic en el icono <icon src="AllIcons.Actions.Execute"/> en el canalón.
fun main() {

    /*showMyName()
    showMyLastName()
    showMyInformation("Daniel", "Lobato")

    var resultado = suma(2,4)
    println("El resultado es $resultado")*/
    var opcion=0
    do{
        menu()
        opcion=readln().toInt()
        when (opcion){
            1->suma()
            2->resta()
            5->println("Saliendo del programa")
        }
    }while(opcion!=5)
}
fun menu(){
    println("Selecciona una opción:\n" +
            "1.- Suma\n" +
            "2.- Resta\n" +
            "5.- Salir")
}
fun pedirDatos():Int{
    var dato=0
    println("Dame un numero")
    dato=readln().toInt()
    return dato
}
fun suma(){
    var valor1:Int=pedirDatos()
    var valor2=pedirDatos()


    println("El resultado es ${valor1 + valor2}")

}

fun resta(){
    var valor1=pedirDatos()
    var valor2=pedirDatos()

    println("El resultado es ${valor1 - valor2}")

}

fun showMyName(){
    println("Mi nombre es Daniel")
}

fun showMyLastName(){
    println("Me apellido Lobato")
}

fun showMyInformation(name:String, lastName:String){
    println("Mi nombre es $name y mi apellido $lastName")
}

