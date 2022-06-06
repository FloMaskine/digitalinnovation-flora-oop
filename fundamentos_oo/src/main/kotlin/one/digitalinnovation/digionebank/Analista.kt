package one.digitalinnovation.digionebank

import java.math.BigDecimal

class Analista(
    nome: String,
    cpf: String,
    salario: Double
) : Funcinario(nome, cpf, salario) {
    override fun calculoAuxilio() = salario * 0.1


}