package exercicio.digitalhouse.aula05.ex4

fun main(){

    val tripe = Tripe(
            false,
            60,
            200,
            120
    )

    tripe.definirAltura(150)
    tripe.dobrar()
    tripe.prontoParaGuardar()
    tripe.guardar()
    tripe.prontoParaGuardar()
    tripe.desdobrar()
    tripe.definirAltura(80)
    tripe.prontoParaUsar()
    tripe.usar()
    tripe.prontoParaUsar()

}