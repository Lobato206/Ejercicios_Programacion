fun main() {
    var num=0
    var sumatorio=0
    var cont=1

   /* while(cont<=10){
        print("Introduce la nota numero${cont}: ")
        num=readln().toInt()

        sumatorio=sumatorio+num

        cont++
    }
    sumatorio=sumatorio/10

    println("La nota media es ${sumatorio}")*/

    println("Introduce el numero de numeros para hacer media")
    var numMedia=readln().toInt()
    while(cont<=numMedia){
        print("Introduce la nota numero${cont}: ")
        num=readln().toInt()

        sumatorio=sumatorio+num

        cont++
    }
    sumatorio=sumatorio/numMedia

    println("La nota media es ${sumatorio}")


}