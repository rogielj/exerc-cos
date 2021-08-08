package ExConta

fun main() {

    var cliente = Cliente ("João", "Santos")
    var conta = Conta (9022,40.20, titular = cliente)

    var cliente2 = Cliente ("Lucas","Silva")
    var conta2 = Conta (9018,500.00, titular = cliente2)

    println (cliente.nome)
    println ("Deposito realizado!! Saldo Disponível: "+conta.Deposito(300.00))
    println ("Saldo Disponível após saque: "+conta.saque(100.00))

    println (cliente2.nome)
    println ("Depósito realizado!! Saldo Disponível: "+conta2.Deposito(50.00))
    println ("Saldo Disponível após saque: "+conta2.saque(15.00))
}

