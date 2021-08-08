package Jogadores

fun main() {
    var jogadordefutebol1 = JogadorDeFutebol("Messi",75,30,1,2)
    var jogadordefutebol2 = JogadorDeFutebol("Ronaldo",90,15,0,1)

    var treinamentojogador1 = SessaoDeTreinamento(jogadordefutebol1.experiencia)
    var treinamentojogador2 = SessaoDeTreinamento(jogadordefutebol2.experiencia)

    println("--"+jogadordefutebol1.nome+"--")
    println(treinamentojogador1.treinarA(jogadordefutebol1))

    println("--"+jogadordefutebol2.nome+"--")
    println(treinamentojogador2.treinarA(jogadordefutebol2))

}