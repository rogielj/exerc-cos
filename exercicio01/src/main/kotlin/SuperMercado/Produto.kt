package SuperMercado

class Produto(
    var nome: String,
    var preco: Double
) {
    fun imprima() {
//        println("* $nome R$ $preco")
        System.out.printf( "%-15s %15s %n", nome, preco);
    }
}