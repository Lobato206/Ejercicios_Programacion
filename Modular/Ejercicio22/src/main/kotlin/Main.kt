fun main() {
    var num = 0
    var par = 0
    var impar = 0
    println("Vamos a ver cuantos numeros pares e impares tiene el numero introducido")
    num=pedirNumero("Introduce el numero: ")
    parImpar(num)
    while (num!=0) {
        var digito= num%10
        when(parImpar(digito)){
            'i' -> par++
            'p' -> impar++
        }
        num/=10
    }
    println("Impar = $impar; Par = $par")
}
fun pedirNumero(mensaje: String):Int{

    print(mensaje)
    var num = readln().toInt()
    return num
}

fun parImpar(num: Int):Char {
    var esPar='i'
    if(num%2==0) esPar='p'

    return esPar
}
