package `Abstract-Class-Exercicio`

import java.util.*

abstract class Ingresso(var valor: Double) {
    abstract fun imprimeValor()
}

class IngressoPadrao(valor: Double) : Ingresso(valor) {
    override fun imprimeValor() {

        println("Ingresso Padrão = R$$valor")
    }
}

class IngressoVip(valor: Double, var valorAd: Double) : Ingresso(valor) {
    override fun imprimeValor() {

        valor += valorAd
        println("Ingresso Vip = R$$valor\n Acréscimo de R$$valorAd")
    }
}
