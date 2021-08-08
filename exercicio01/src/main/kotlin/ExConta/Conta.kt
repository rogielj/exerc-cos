package ExConta

class Conta (var numerodaConta: Int, var saldo: Double, var titular: Cliente) {

    fun Deposito (entrada: Double): Double{

        saldo = (saldo + entrada)
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
