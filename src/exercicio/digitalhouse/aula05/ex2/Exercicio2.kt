package exercicio.digitalhouse.aula05.ex2

fun main(){

    val jogador1 = JogadorDeFutebol("Flavio Caça-Rato", 10, 20, 0,5)
    val jogador2 = JogadorDeFutebol("Lucas Lima", 1, 1, 0,10)

    val sessao = SessaoDeTreinamento()
    sessao.treinarA(jogador1)
    sessao.treinarA(jogador2)
}