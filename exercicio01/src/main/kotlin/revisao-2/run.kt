package `revisao-2`

fun main() {
    var itens = listOf<Item>(
        Item(9800, "Notebook", 50, 1400.00),
        Item(1347, "Impressora", 7, 500.00),
        Item(67894, "Mouse", 15, 27.89),
        Item(907886, "Teclado", 20, 111.00),
    )

    val fatura = Fatura(itens)
    val resposta = fatura.totalDaFatura()

    itens.map { item -> println(
        "Codigo: ${item.num_item}, " +
                    "Produto: ${item.desc_item}, " +
                    "Quantidade: ${item.qtd_comprada_item}, " +
                    "Valor: ${item.precoItem}")}

    println("\n O total é: $resposta")
}