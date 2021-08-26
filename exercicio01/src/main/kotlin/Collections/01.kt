package Collections

fun main() {

    val dicionario = mapOf<Int, String>(
        0 to "ovos",
        1 to "água",
        2 to "Escopeta",
        3 to "Cavalo",
        4 to "Dentista",
        5 to "Fogo"
    )
//    for (x in dicionario){
//        println("${x.key} -- ${x.value}")
//    }
    for ((a,b) in dicionario){
        println("Indice = $a,Valor = $b")
    }
// exercício 2 = dois for

}