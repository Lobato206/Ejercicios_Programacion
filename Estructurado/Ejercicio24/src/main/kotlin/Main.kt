fun main() {
    var num = 0
    var sumatorio = 0
    var cont = 1
    var eleccion = 0

    do {
        println("Elige entre hacer la media de 10 numeros (1) o de tantos numeros como quieras (2)")
        print("Introduce un valor")
        eleccion=readln().toInt()
        when(eleccion) {

            1 -> {
                while (cont <= 10) {
                    println("Se calcularan 10 medias")
                    print("Introduce la nota numero ${cont}: ")
                    num = readln().toInt()

                    sumatorio = sumatorio + num

                    cont++
                }
                sumatorio = sumatorio / 10
            }


            2 -> {
                println("Introduce el numero de numeros para hacer media")
                var numMedia = readln().toInt()

                while (cont <= numMedia) {
                    print("Introduce la nota numero ${cont}: ")
                    num = readln().toInt()

                    sumatorio = sumatorio + num

                    cont++
                }
                sumatorio = sumatorio / numMedia

            }
        }
    }while((num==1)&&(num==2))

    println("La nota media es ${sumatorio}")


}