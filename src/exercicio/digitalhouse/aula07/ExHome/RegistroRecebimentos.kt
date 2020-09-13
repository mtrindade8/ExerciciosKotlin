package exercicio.digitalhouse.aula07.ExHome

class RegistroRecebimentos {

    var registroRecebimentos = mutableListOf<IRecebivel>()

    fun adicionarRecebimento(vararg r: IRecebivel) = registroRecebimentos.addAll(r)

    fun apresentarRecebimentos() {
        println("###################################################################################################")
        var valorTotal = 0.0
        registroRecebimentos.forEach {
            println(it.toString())
            valorTotal += it.totalizarReceita()
        }
        println("###################################################################################################")
        println("Total a receber: $valorTotal")
    }
}
