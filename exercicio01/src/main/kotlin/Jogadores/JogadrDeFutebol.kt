package Jogadores

class JogadorDeFutebol (var nome: String, var energia: Int, var alegria: Int, var gol: Int, var experiencia: Int) {
// poderia iniciar com valor padrão ex.: energia: Int = 0

    fun fazerGol() {
        energia = (energia - 5) // ou energia -= 5
        alegria = (alegria + 10)
        gol = (gol + 1)
        println("Gollll")
        println("Energia:$energia")
    }

    fun correr() {
        energia = (energia - 10)
        print("Cansei")
        println(" $energia de energia")
    }
}