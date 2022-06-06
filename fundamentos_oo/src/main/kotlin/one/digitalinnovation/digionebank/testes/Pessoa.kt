package one.digitalinnovation.digionebank.testes

class Pessoa {
    var nome: String = "Flora"
    var cpf: String = "123.456.789-10"

}

fun main() {
    val flora = Pessoa()

    println(flora.nome)
    println(flora.cpf)
}