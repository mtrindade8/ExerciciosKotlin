package exercicio.digitalhouse.aula04.ex1

fun main() {
    println(maiorNumero(2, 6, 1))
}

fun maiorNumero(a: Int, b: Int, c: Int): Int {
    return when {
        a > b && a > c -> a
        b > a && b > c -> b
        else -> c
    }
}