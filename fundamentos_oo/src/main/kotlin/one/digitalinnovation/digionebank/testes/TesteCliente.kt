package one.digitalinnovation.digionebank.testes

import one.digitalinnovation.digionebank.Cliente
import one.digitalinnovation.digionebank.ClienteTipo

fun main() {
    val laryssa = Cliente(
        nome = "Laryssa Godoy",
        cpf = "364.335.678.32",
        clienteTipo = ClienteTipo.Pf,
        senha = "123456"
    )

    println(laryssa)

    TesteAutenticacao().autentica(laryssa)

}