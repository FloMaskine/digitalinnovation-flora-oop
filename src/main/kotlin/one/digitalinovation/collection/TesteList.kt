package one.digitalinovation.collection

fun main() {
    val joao = Funcionario("Joao", 3250.0,"CLT")
    val pedro = Funcionario("Pedro", 2345.0,"PJ")
    val maria = Funcionario("Maria", 6500.0,"CLT")

    val funcionarios = listOf(joao, pedro, maria)

    funcionarios.forEach { println(it) }

    println("---------------------------")
    println(funcionarios.find { it.nome == "Maria"})

    println("---------------------------")
    funcionarios
        .sortedBy { it.salario }
        .forEach { println(it) }
    println("---------------------------")
    funcionarios
        .groupBy { it.tipoContratacao }
        .forEach { println(it) }


}

