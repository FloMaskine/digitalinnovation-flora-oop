package one.digitalinnovation.digionebank.testes

import one.digitalinnovation.digionebank.Analista
import one.digitalinnovation.digionebank.Pessoa
import one.digitalinnovation.digionebank.Funcinario
import one.digitalinnovation.digionebank.Gerente
import java.math.BigDecimal


fun main() {
    val cida = Gerente("Aparecida Dos Santos", "068.765.432.40", 6540.0)

    RelatorioFuncionario.relatorio(cida)
}

