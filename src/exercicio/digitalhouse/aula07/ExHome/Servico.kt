package exercicio.digitalhouse.aula07.ExHome

class Servico (var descricao: String, var horas: Int, var precoHora: Double ) : IRecebivel {

    override fun totalizarReceita(): Double = horas*precoHora

    override fun toString(): String = "Descrição: $descricao || Horas: $horas || Preço por hora: $precoHora || Total da Receita: ${totalizarReceita()}"

}
