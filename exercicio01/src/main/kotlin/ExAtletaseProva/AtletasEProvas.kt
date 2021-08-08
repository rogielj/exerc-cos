package ExAtletaseProva

fun main() {
    var atleta = Atleta("Pedro",10,10)
    var atleta2 = Atleta("Marcos",5,7)

    var prova = Prova(10,12)
    var prova2 = Prova(2,3)
    var prova3 = Prova(5,6)

    println(atleta.nome)
    println ("Pode realizar 1ºprova? "+prova.podeRealizar(atleta))
    println ("Pode realizar 2ºprova? "+prova2.podeRealizar(atleta))
    println ("Pode realizar 3ºprova? "+prova3.podeRealizar(atleta))

    println (prova.podeRealizar(atleta2))

}