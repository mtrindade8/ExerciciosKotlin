package exercicio.digitalhouse.aula04.ex4

import exercicio.digitalhouse.aula04.ex3.analisaNumero

fun main() {
    var count = 0
    var i = 1
    do {
        if (!analisaNumero(i)){
            println(i)
            count++
        }
        i++
    } while (count != 100)
}