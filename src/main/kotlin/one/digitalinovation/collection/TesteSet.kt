package one.digitalinovation.collection

fun main() {
    val joao = Funcionario("Joao", 3250.0, "CLT")
    val pedro = Funcionario("Pedro", 2345.0, "PJ")
    val maria = Funcionario("Maria", 6500.0, "CLT")

    val funcionarios1 = setOf(joao, pedro)
    val funcionarios2 = setOf(maria)

    val resultUnion = funcionarios1.union(funcionarios2)
    resultUnion.forEach { println(it) }

    println("----------------------------------")
    val funcionarios3 = setOf(joao, pedro, maria)
    val resultSubtract = funcionarios1.subtract(funcionarios2)
    resultSubtract.forEach { println(it) }

    println("----------------------------------")
    val resultIntersect = funcionarios1.intersect(funcionarios3)
    resultIntersect.forEach { println(it) }

}