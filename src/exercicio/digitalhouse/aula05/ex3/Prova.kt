package exercicio.digitalhouse.aula05.ex3

class Prova (var nome: String, var dificuldade: Int, var energiaNecessaria: Int) {
    fun podeRealizar(atleta: Atleta): Boolean{
        return when {
            atleta.nivel >= dificuldade && atleta.energia >= energiaNecessaria -> true
            else -> false
        }
    }
}