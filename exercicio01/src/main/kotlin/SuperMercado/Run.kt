package SuperMercado

/*utilize o recurso de parametro nomeado ao chamar as funções,
para qualquer programador entender quais parametros
estão sendo passados para as funções.*/

fun main() {
    var lista = arrayListOf(
        Produto("Feijão", 4.11),
        Produto("Arroz", 6.05),
        Produto("Açúcar", 2.50),
        Produto("Café", 2.00),
        Produto("Mortadela", 5.00),
        Produto("Ovos", 4.00),
        Produto("Pão", 3.55),
        Produto("Leite", 2.25),
    )

    val carrinho = CarrinhoDeCompras(lista)
    carrinho.adicionarProdutos()

    val caixa1 = Caixa()
    caixa1.fechamentoDeCaixa({ cabecalhoDoComprovante() }, { dataDaCompra() },
        { imprimeListaDeCompra(lista) },

    {adicionaRodape(lista) }, { desconto(lista,false)})
}
