fun main() {
    var numero=0
    var cifra=0
    println("Vamos a ver cuantas cifras tiene un numero de hasta maximo 5 cifras")

    do{
        println("Dame un numero:")
        numero=readln().toInt()
        if((numero>99999)||(numero<-99999)) println("Solo numeros de 5 cifras")
        else{
            do {
                numero /= 10
                cifra++
            } while (numero > 0 || numero < 0)
            println("El numero de cifras es ${cifra}")
        }
    } while((numero>99999)||(numero<-99999))





}