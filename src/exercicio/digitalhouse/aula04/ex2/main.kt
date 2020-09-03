package exercicio.digitalhouse.aula04.ex2

fun main() {
    var texto1 = "Teste Teste"
    var texto2 = "Teste Teste"

    println(analizaTexto(texto1, texto2))
}

fun analizaTexto(texto1: String, texto2: String): Boolean {
    return texto1 != texto2
}