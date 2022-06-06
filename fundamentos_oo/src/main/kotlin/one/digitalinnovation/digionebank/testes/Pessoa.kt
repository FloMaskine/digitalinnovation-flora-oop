package one.digitalinnovation.digionebank.testes

class Pessoa {
    var nome: String = "Flora"

    var cpf: String = "123.456.789-10"
    private set

    fun infoPessoa() = "Nome: $nome\nCPF: $cpf"

}

fun main() {
    val flora = Pessoa()

    println(flora.infoPessoa())



}