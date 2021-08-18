package Interface

fun main() {

    val foto = Foto("Foto de Perfil", "Foto")
    val contrato = Contrato("Contrato de Locação","Contrato")
    val documento = Documento("CNH","Carteira Nacional de Habilitação")

    val impressora = Impressora()

    impressora.adicionar(foto)
    impressora.adicionar(contrato)
    impressora.adicionar(documento)

    impressora.imprimirLista()

}
