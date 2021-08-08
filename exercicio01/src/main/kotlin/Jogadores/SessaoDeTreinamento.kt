package Jogadores

class SessaoDeTreinamento (var experiencia: Int) {

// ex. var global var experiencia: Int 1

    fun treinarA (jogadorDeFutebol: JogadorDeFutebol){
        jogadorDeFutebol.correr()
        jogadorDeFutebol.fazerGol()
        jogadorDeFutebol.correr()

        println("Experiencia Incial:$experiencia")
        println("Melhoramento da experiência:"+(1+experiencia))

    }
}