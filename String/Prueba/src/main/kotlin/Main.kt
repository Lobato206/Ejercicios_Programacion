//TIP Para <b>ejecutar</b> el código, pulsa <shortcut actionId="Run"/> o
// Clic en el icono <icon src="AllIcons.Actions.Execute"/> en el canalón.
fun main() {
    var cont=0
    var x="Me encanta el ruido"
    /*for (char in x){
        println(char)
    }
    var ruido=x.substring(14,19)
    /*while (cont<x.length){
        println()
        cont++
    }*/
    ///println(ruido)
    //println(x.indexOf("e"))*/
    var patata=x.indexOf('e')
    while(patata!=-1){
        println("La letra 'e' se encentra en la posición " + patata)
        patata=(x.indexOf('e', patata+1))

        cont++
    }


}