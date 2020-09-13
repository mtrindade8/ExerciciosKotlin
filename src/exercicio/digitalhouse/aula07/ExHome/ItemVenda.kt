package exercicio.digitalhouse.aula07.ExHome

class ItemVenda(var produto: String, var quantidade: Int, var valor: Double): IRecebivel {

    override fun totalizarReceita(): Double = quantidade*valor

    override fun toString(): String = "Produto: $produto || Quantidade: $quantidade || Valor: $valor || Total da Receita: ${totalizarReceita()}"

}
