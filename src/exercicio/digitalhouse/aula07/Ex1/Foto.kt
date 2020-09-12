package br.aulas.com.br

class Foto (override var nome: String, override var tipoDocumento: String) : Imprimivel {
    override inline fun imprimir() = println("Eu sou uma selfie com nome de $nome e tipo $tipoDocumento")
}