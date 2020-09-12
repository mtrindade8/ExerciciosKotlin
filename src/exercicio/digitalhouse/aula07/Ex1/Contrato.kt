package br.aulas.com.br

class Contrato(override var nome: String, override var tipoDocumento: String) : Imprimivel {
    override inline fun imprimir() = println("Sou um contrato muito legal com nome de $nome e tipo $tipoDocumento")
}