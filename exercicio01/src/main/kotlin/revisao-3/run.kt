package `revisao-3`

fun main() {
    var produto1 = Estoque("Feijão", 20, 5)
    var produto2 = Estoque("Arroz", 18, 3)
    var produto3 = Estoque("Açúcar",12,2)


//    produto1.precisaRepor(produto1)
//    produto1.darBaixa(produto1, 5)
//    produto3.repor(produto3, 15)
//    produto1.mudarNome("Arroz")
    produto3.mostra() // se colocar pirnt antes aparece kotlin.unit
}