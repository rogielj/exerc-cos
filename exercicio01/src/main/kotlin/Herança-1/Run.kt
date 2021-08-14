package `Herança-1`

fun main() {

    var cliente_João = Cliente(89670, "Junior", 18909645, "89.678.567-08")

//    var poupanca = Conta.Poupanca(cliente_João)
    var corrente = Conta.C_corrente(cliente_João)

    println("${cliente_João.DadosCliente()}")

/*    poupanca.Deposito(60.0)
    poupanca.recolherJuros(true)
    poupanca.Saque(80)
    poupanca.consultaSaldo()
 */
// Git gabarito = https://github.com/jonatasaraujodh
    corrente.Deposito(20.0)
    corrente.Depositarcheque(0.0, 104, "09-07-2021")
    corrente.Saque(60.0)
    corrente.consultaSaldo()

}