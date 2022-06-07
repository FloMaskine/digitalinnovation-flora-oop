package one.digitalinovation.collection

fun main() {
    val values = IntArray(5)
    values[0] = 1
    values[1] = 8
    values[2] = 3
    values[3] = 6
    values[4] = 5

    for (valor in values){
        println(valor)
    }

    values.forEach{valor ->
        println(valor)
    }

    for (index in values.indices){
        println(values[index])
    }

    values.sort()
    for (valor in values){
        println(valor)
    }

}