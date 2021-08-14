package `revisao-3`

class Estoque(
    var nome: String,
    //var Produtonome: String,
    var qtdAtual: Int,
    var qtdMinima: Int,
) {
    init {
        if (qtdAtual < 0) {
            println("Quantidade Atual não pode ser um Numero negativo")
        }
        if (qtdMinima < 0) {
            println("Quantidade Mínnima não pode ser um Numero negativo")
        }
    }

    fun mudarNome(nome: String): Unit {
        this.nome = nome
        //Produtonome = nome
    }

    fun mudarQtdMinima(qtdMinima: Int): Unit {
        this.qtdMinima = qtdMinima
    }

    fun repor(qtd: Int): Unit { // talvez produto não precise entrar aqui
        qtdAtual += qtd

        println("**Repondo Estoque**")

    }

    fun darBaixa(qtd: Int): Unit {
        qtdAtual -= qtd
        println("** Dando Baixa **")
    }

    fun mostra(): Unit {
        if (qtdAtual > 0 && qtdMinima > 0) {
            print(
                "Produto: $nome" +
                        "\nQuantidade Atual: $qtdAtual" +
                        "\nQuantidade mínima: $qtdMinima\n"
            )
        }
    }

    fun precisaRepor(): Boolean {

        return qtdAtual <= qtdMinima
    }
}