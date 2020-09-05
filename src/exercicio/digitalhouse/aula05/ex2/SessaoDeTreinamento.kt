package exercicio.digitalhouse.aula05.ex2

class SessaoDeTreinamento (var experienciaSessao: Int = 1) {
    fun treinarA(jogador: JogadorDeFutebol){
        println("##########################################")
        println("Treinamento de ${jogador.nome}")
        jogador.correr()
        jogador.fazerGol()
        jogador.correr()

        println("Experiência inicial: ${jogador.experiencia}")
        jogador.experiencia += experienciaSessao
        println("Experiência final: ${jogador.experiencia}")
        println("##########################################")
        println()
    }
}
