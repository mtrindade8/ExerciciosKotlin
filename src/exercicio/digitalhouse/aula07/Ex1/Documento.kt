package br.aulas.com.br

class Documento(override var nome: String, override var tipoDocumento: String) : Imprimivel{
    override inline fun imprimir() = println("Eu sou um documento word com nome de $nome e tipo $tipoDocumento")
}