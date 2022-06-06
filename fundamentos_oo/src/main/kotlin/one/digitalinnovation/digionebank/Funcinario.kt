package one.digitalinnovation.digionebank

abstract class Funcinario(
    nome: String,
    cpf: String,
    val salario: Double
) : Pessoa(nome, cpf) {
    protected abstract fun calculoAuxilio(): Double

    override fun toString(): String = """
        Nome: $nome
        Nome: $cpf
        Nome: $salario
        Auxilio: ${calculoAuxilio()}
    """.trimIndent()
}