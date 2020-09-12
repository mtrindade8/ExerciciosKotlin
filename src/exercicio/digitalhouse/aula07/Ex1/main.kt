package br.aulas.com.br

fun main(){
    var foto = Foto("Joao","PNG")
   // foto.imprimir()

    var documento = Documento("Vitoria","DOCX")
   // documento.imprimir()

    var contrato = Contrato("Digital House", "Matricula")
    //documento.imprimir()

    var impressora = Impressora()
    impressora.addList(foto,documento, contrato)
    impressora.Imprimir()
}
