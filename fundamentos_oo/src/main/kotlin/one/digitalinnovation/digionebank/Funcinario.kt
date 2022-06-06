package one.digitalinnovation.digionebank

import java.math.BigDecimal

class Funcinario(
    override val nome: String,
    override val cpf: String,
    val salario: BigDecimal
) : Pessoa(nome, cpf) {

}