package exercicio.digitalhouse.aula05.ex2

class JogadorDeFutebol(
        var nome: String,
        var energia: Int,
        var alegria: Int,
        var gols: Int,
        var experiencia: Int
) {

    fun fazerGol() {
        println("Gooool!")
    }

    fun correr() {
        energia -= 10
        println("Cansei...")
    }
}