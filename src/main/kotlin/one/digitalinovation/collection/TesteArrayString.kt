package one.digitalinovation.collection


fun main() {
    val nomes = Array<String>(4) { "" }
    nomes[0] = "Cida"
    nomes[1] = "Flora"
    nomes[2] = "Luna"
    nomes[3] = "Malu"

    for (nome in nomes) {
        println(nome)
    }

    println("-------------------------------")
    nomes.sort()
    nomes.forEach {
        println(it)
    }
    println("-------------------------------")
    val nomes2 = arrayOf("Zuli", "Costa", "Dalmata")
    nomes2.sort()
    nomes2.forEach { println(it) }
}