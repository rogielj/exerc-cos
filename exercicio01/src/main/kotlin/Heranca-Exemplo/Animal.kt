package `Heranca-Exemplo`
// protected Classe pai e filho
// private somente onde ele está
// Abstract, caso queira a classe só como um molde (pode usar para herança)

open class Animal {
    var tamanho: Int = 0
    var cor: String = ""
    var peso: Double = 0.0

    open fun correr()
    {
        println ("""
            corre vamos
        """.trimIndent())
    }
}