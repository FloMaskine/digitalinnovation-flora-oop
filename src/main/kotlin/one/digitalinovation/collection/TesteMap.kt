package one.digitalinovation.collection

fun main() {
    val pair: Pair<String, Double> = Pair("Joao", 1000.0)
    val map1 = mapOf(pair)
    map1.forEach { (k,y ) -> println("Chave: $k - Valor: $y") }

    println("--------------------------------")
    val map2 = mapOf(
        "Pedro" to 1234.5,
        "Maria" to 3456.6
    )

    map2.forEach { (k,y ) -> println("Nome: $k - Salario: $y") }
}