package one.digitalinnovation.digionebank

data class Banco(
    var nome: String,
    var numero: Int
){
    fun info() = "Nome: $nome\nNumero: $numero"
}