package `Aula-12`

data class Pessoai (var nome: String, var CPF: Int)

fun main() {
    var pessoaA = Pessoai("Pedro",567)
    var pessoaB = Pessoai("Pedro",567)

    println(pessoaA.toString())
    println(pessoaA.hashCode())
    println(pessoaB)
    println(pessoaB.hashCode())
    println(pessoaA == pessoaB) // chama também o toString

}