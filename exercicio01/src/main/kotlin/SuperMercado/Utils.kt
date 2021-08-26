package SuperMercado

import java.util.*
import java.util.Calendar.*
import kotlin.collections.ArrayList
const val TEXT_PURPLE = "\u001B[35m"
// Imprime cabecalho
fun cabecalhoDoComprovante() { // caberia Lambda aqui e nos outros
    println("##### DH SuperMarket ######")
}

//Mostra a data da compra dos produtos
val dataDaCompra: () -> String = {
    val data = Calendar.getInstance()
    "${data.get(DATE)}/${data.get(MONTH)+1}/${data.get(YEAR)}"
}

/* receberá como parametro a lista de itens e fará a impressão dos mesmos, usando println() para
 cada item da lista, através do laço de repetição for*/
fun imprimeListaDeCompra(lista: ArrayList<Produto>) {
    println("  -------- Produtos --------")
    for (i in lista) {
//        println("* "+i.nome+" R$ "+i.preco)
        i.imprima()
    }
}

//receberá a lista de produtos e fará a somatória total, exibindo a ao fim do calculo.
var r = 0.0
fun adicionaRodape(lista: ArrayList<Produto>){
    println("---------------------------------")
    var ss = "Total da Compra"
    for (k in lista) {
        r += k.preco
    }
//    println("\n_____ Total da Compra: R$ $r ")
    System.out.printf( "%-15s %15s %n", ss,r);
}
fun desconto (lista: ArrayList<Produto>, pagamentoAvista: Boolean, desconto: Double = 0.0){
    var res = 0.0
    var s = "Total c/ desconto"
    if (pagamentoAvista){
        res = r - (desconto*r)
//        println("$TEXT_PURPLE\nTotal da Compra após Desconto R$ $res $TEXT_RESET")
        System.out.printf( "%-15s %15s %n", s,res);
    }
}
