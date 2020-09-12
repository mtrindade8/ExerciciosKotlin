package br.aulas.com.br

class Impressora(){
    var listaImprimivel = mutableListOf<Imprimivel>()
    fun addList(vararg obj : Imprimivel){
        for(item in obj) {
            listaImprimivel.add(item)
        }
    }
    fun Imprimir(){
        for(item in listaImprimivel){
            item.imprimir()
        }
    }
}