package `Abstract-Class-Exercicio`

import `Abstract-Class-Exercicio`.IngressoPadrao
import `Abstract-Class-Exercicio`.IngressoVip
import java.util.*

fun main() {
    operacao()
}

val ingresso = IngressoPadrao(valor = 90.0)
val ingressoV = IngressoVip(valorAd = 15.00, valor = 90.0)

fun operacao() {

    val scanner = Scanner(System.`in`)

    println("----- Olá!, digite o número do ingresso que deseja -----")
    println(
        """
        1 - Ingresso Padrão
        2 - Ingresso Vip
    """.trimIndent()
    )
/*    var retorno = scanner.nextInt()
    if (retorno == 1) {
        ingresso.imprimeValor()
    } else if (retorno == 2) {
        ingressoV.imprimeValor()
    } else {
        println("Opção inválida")
        return main()
    }

 */
    when (scanner.nextInt()) {
        1 -> IngressoPadrao(50.0).imprimeValor()
        2 -> IngressoVip(50.0, 10.0).imprimeValor()
        else -> {
            println("Opção inválida")
            return main()
        }
    }
}


