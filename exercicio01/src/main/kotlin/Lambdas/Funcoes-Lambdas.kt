package Lambdas

fun main() {

    val soma: (Int, Int) -> Int = { a: Int, b: Int -> a + b }

    val somaOutraForma: (Int, Int) -> Int = { a, b -> a + b }

    val somaResumida = { a: Int, b: Int -> a + b }

    val subtracaoResumida = { a: Int, b: Int -> a - b }

    val multiplicaResumida = { a: Int, b: Int -> a * b }

    val divisaoResumida = { a: Int, b: Int -> a / b }

    val somaUnicoParametro: (Int) -> Unit = { println(it + 10) }

    val validarEmail: (String) -> Boolean = {
        it.contains("@.")
    }
    val lista: (List<Int>) -> Unit = {
        var r: Int = 1
        if (it.isEmpty()) {
            println("\n-------------------------\nResultado da Lista: "+0)
        } else {
            for (item in it) {
                r *= item
            }
            println("\n-------------------------\nResultado da Lista: $r")
        }
    }

        println("Soma: " + soma(10, 10))
//    println(somaOutraForma(10,10))
        println("Soma Lambda Resumida: " + somaResumida(10, 10))
        println("Subtração Lambda Resumida: " + subtracaoResumida(10, 5))
        println("Multiplicação Lambda Resumida: " + multiplicaResumida(10, 10))
        println("Divisão Lambda Resumida: " + divisaoResumida(10, 2))
        println("")

//    (somaComRetornoUnit(10,10))

        print("**** Função Valida Email ****\nEmail contém @: ")
        println(validarEmail("rogiel@bol.com.br"))

        lista(listOf(4,4,4))

}
