package `Herança-1`

open class Conta(cliente: Cliente) {
    var saldo: Double = 0.0
    var d: Double = 0.0

    fun Deposito(d: Double) {// variável que receberá valor depósito
        saldo += d
    }

    open fun Saque(s: Double) {
        while (s == saldo) {
        }
    }

    open fun consultaSaldo() {
//        if (m == 1) {
        println("Saldo disponível:" + saldo)
    }

    class Poupanca(cliente: Cliente, var juros: Double = 0.0) : Conta(cliente) {
//        var juros: Double = 0.0

        fun recolherJuros(op: Boolean) {
            if (op) {
                juros += saldo * 0.05
            }
            println("juros: $juros")
        }

        override fun Saque(s: Double) {
            super.Saque(s)
            if (s < saldo) {
                saldo -= s
            } else {
                println("Não há saldo suficiente")
            }
        }
    }

    class C_corrente(cliente: Cliente) : Conta(cliente) {
        open fun Depositarcheque(v: Double, codBanco: Int, datapagam: String) {
            if (saldo > 0) {
                saldo += v
            }
        }

        override fun Saque(s: Double) {
            super.Saque(s)
            if (s < saldo) {
                saldo -= s
            } else if (s > saldo) {
                val x = 150.00
                println("Saldo insufiiente, Cheque Especial $x")

            }
        }
    }
}

