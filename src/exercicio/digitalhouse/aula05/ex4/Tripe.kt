package exercicio.digitalhouse.aula05.ex4

class Tripe(
        var dobrado: Boolean,
        val alturaMinima: Int,
        val alturaMaxima: Int,
        var alturaAtual: Int)
{
    fun definirAltura(novaAltura: Int){
        if(novaAltura in alturaMinima..alturaMaxima){
            alturaAtual = novaAltura
            println("Altura ajustada para $alturaAtual cm.")
        }else{
            println("Não é possível ajustar na altura selecionada.")
        }
    }

    fun dobrar(){
        if(!dobrado) {
            dobrado = true
            println("O tripé foi dobrado.")
        } else {
            println("O tripé já esta dobrado.")
        }
    }

    fun desdobrar(){
        if(dobrado) {
            dobrado = false
            println("O tripé foi desdobrado.")
        } else {
            println("O tripé já esta desdobrado.")
        }
    }

    fun guardar(){
        alturaAtual = alturaMinima
        dobrar()
        println("Altura ajustada para guardar.")
    }

    fun prontoParaGuardar(){
        if(dobrado && alturaAtual == alturaMinima){
            println("O tripé esta pronto para ser guardado.")
        }else{
            println("O tripé não esta pronto para ser guardado.")
        }
    }

    fun usar(){
        alturaAtual = alturaMaxima
        desdobrar()
        println("Altura ajustada para usar.")
    }

    fun prontoParaUsar(){
        if(!dobrado && alturaAtual >= (alturaMaxima/2)){
            println("O tripé esta pronto para ser usado.")
        }else{
            println("O tripé não esta pronto para ser usado.")
        }
    }
}
