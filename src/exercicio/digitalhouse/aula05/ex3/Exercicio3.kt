package exercicio.digitalhouse.aula05.ex3

fun main(){

    val atleta1 = Atleta("Mateus", 10, 10)
    val atleta2 = Atleta("Maria", 15, 5)
    val arrayAtletas = arrayOf(atleta1, atleta2)

    val prova1 = Prova("Natação",15, 5)
    val prova2 = Prova("Corrida",10, 10)
    val prova3 = Prova("Ciclismo",15, 10)
    val arrayProvas = arrayOf(prova1, prova2, prova3)

    arrayAtletas.forEach { atleta ->
        println("###########################################################")
        arrayProvas.forEach {
            when {
                it.podeRealizar(atleta) -> println("${atleta.nome} pode realizar a prova de ${it.nome}")
                !it.podeRealizar(atleta) -> println("${atleta.nome} não pode realizar a prova de ${it.nome}")
            }
        }
        println("###########################################################")
        println()
    }
}
