package one.digitalinovation.collection

fun main() {
    val salarios = doubleArrayOf(1234.5, 4352.9, 7654.5)
    for (salario in salarios) {
        println(salario)
    }

    println("--------------------------")

    println("Maior Salario: ${salarios.maxOrNull()}")
    println("Menor Salario: ${salarios.minOrNull()}")
    println("Media Salarial: ${salarios.average()}")

    println("--------------------------")

    val salariosFilterMaior2500 = salarios.filter { it > 2500 }

    salariosFilterMaior2500.forEach { println("Sao maiores que 2500: $it") }

    println("--------------------------")

    println(salarios.count { it in 2000.00..8000.00 })

    println("--------------------------")

    println(salarios.find { it == 1234.5 })

    println("--------------------------")

    println(salarios.any { it == 1234.5 })


}