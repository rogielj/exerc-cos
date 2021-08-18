package Interface

class Contrato(
    override var nome: String,
    override var tipoDoc: String
) : Imprimivel {

    override fun imprimir() {
        println("Eu sou do tipo $tipoDoc = $nome")
    }
}