package one.digitalinovation.collection

fun main() {
    val values = intArrayOf(4, 5, 6, 12, 43, 6, 7)
    values.forEach {
        println(it)
    }

    println("-------------------------------")

    values.sort()
    values.forEach {
        println(it)
    }
}