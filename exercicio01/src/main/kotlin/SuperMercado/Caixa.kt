package SuperMercado

const val TEXT_YELLOW = "\u001B[33m"
const val TEXT_RESET = "\u001B[0m"

class Caixa {

    inline fun fechamentoDeCaixa(
        cabecalhoDoComprovante: () -> Unit,
        data: () -> String,
        imprimeListaDeCompra: () -> Unit,
        adicionaRodape: () -> Unit,
        desconto: () -> Unit
    ) {
        cabecalhoDoComprovante()

        println(TEXT_YELLOW+"Data da Compra: ${data()}"+ TEXT_RESET)
        imprimeListaDeCompra()
        adicionaRodape()
        desconto()
    }
}