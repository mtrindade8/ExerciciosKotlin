package exercicio.digitalhouse.aula07.ExHome

fun main(){

    val item1 = ItemVenda("Bateria", 2, 49.99)
    val item2 = ItemVenda("Radiador", 1, 199.99)
    val item3 = ItemVenda("Pneu", 4, 299.99)

    val servico1 = Servico("Recarga de bateria", 1, 15.0)
    val servico2 = Servico("Troca de radiador", 5, 20.0)
    val servico3 = Servico("Troca de pneus", 1, 20.0)

    val registro = RegistroRecebimentos()
    registro.adicionarRecebimento(item1, item2, item3, servico1, servico2, servico3)
    registro.apresentarRecebimentos()
}