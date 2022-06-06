package one.digitalinnovation.digionebank.testes

import one.digitalinnovation.digionebank.Analista
import one.digitalinnovation.digionebank.Pessoa
import one.digitalinnovation.digionebank.Funcinario
import java.math.BigDecimal


fun main() {
    val maxine = Analista("Flora Maxine", "098.765.321.12", 3000.0)

    RelatorioFuncionario.relatorio(maxine)
}
