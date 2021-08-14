package `revisao-2`

class Item(
    var num_item: Int,
    var desc_item: String,
    var qtd_comprada_item: Int,
    var precoItem: Double
) {
init {
    if (qtd_comprada_item<0){
        qtd_comprada_item = 0
    }
    if (precoItem<0.0){
        precoItem=0.0
    }
}
}