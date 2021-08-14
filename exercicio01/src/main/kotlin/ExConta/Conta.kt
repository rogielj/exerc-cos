package ExConta

class Conta (var numerodaConta: Int, var saldo: Double, var titular: Cliente) {

    init{
        if (saldo < 0) saldo = 0.0
    }
    fun Deposito (entrada: Double): Double{

        saldo += entrada
        return saldo
    }
    fun saque (quantia: Double){
           if (quantia > saldo) {
        print ("Saldo Insuficiente")
    } else {
        print (saldo - quantia)
        }
}
}
