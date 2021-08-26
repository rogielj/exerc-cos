package Collections

fun main() {
    // não sei se a resposta é essa
    val apelidos = mutableMapOf<String, String>(
        "João" to "Juan, El Divo, Maromba, Zé Bonitinho",
        "Miguel" to "Dark Knight, Bruce Wayne, Batfleck, Gengiva",
        "Maria" to "Ju, Mary, Marilene, Ventania",
        "Lucas" to "Lukinha, Jorge, George, Kevin Flynn"
        // Lista de Nomes e respectivos apelidos
    )
//    println(""+apelidos)
//    println("Chave"+apelidos.size)
//    println("Valores"+apelidos.values)
    for (i in apelidos){
        println("${i.key} -> ${i.value}")
    }
}