package one.digitalinnovation.digionebank.testes

import one.digitalinnovation.digionebank.Pessoa
import one.digitalinnovation.digionebank.Funcinario
import java.math.BigDecimal


fun main() {
    val flora = Pessoa("Flora", "123.456.789.10")

    println(flora.nome)
    println(flora.cpf)

    val maxine = Funcinario("Flora Maxine", "098.765.321.12", BigDecimal.valueOf(2300.0))

    println(maxine.nome)
    println(maxine.cpf)


}