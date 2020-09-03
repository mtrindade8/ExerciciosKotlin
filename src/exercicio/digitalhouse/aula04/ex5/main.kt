package exercicio.digitalhouse.aula04.ex5

fun main() {
    println(analisaQuatroNumeros(5, 6, 1, 2))
}

fun analisaQuatroNumeros(numA: Int, numB: Int, numC: Int, numD: Int): Boolean{
    return ((numA > numC && numA > numD) || (numB > numC && numB > numD))
}