//TIP Para <b>ejecutar</b> el código, pulsa <shortcut actionId="Run"/> o
// Clic en el icono <icon src="AllIcons.Actions.Execute"/> en el canalón.
fun main() {
    val name = "Kotlin"
    //TIP Presiona <shortcut actionId="ShowIntentionActions"/> en el texto resaltado
    // ver cómo IntelliJ IDEA sugiere corregirlo.
    println("Hello, " + name + "!")

    for (i in 1..5) {
        //TIP Pulsa <shortcut actionId="Debug"/> para empezar la depuración de tu código. Hemos marcado un <icon src="AllIcons.Debugger.Db_set_breakpoint"/> punto de ruptura
        // para vos, pero siempre podés agregar más presionando <shortcut actionId="ToggleLineBreakpoint"/>.
        println("i = $i")
    }
}