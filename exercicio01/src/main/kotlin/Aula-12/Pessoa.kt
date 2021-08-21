package `Aula-12`

class Pessoa(var nome: String, var RG: Int){
    override fun equals (other: Any?): Boolean{ //sobreescrevendo
        return (other is Pessoa && other.RG == this.RG)
    }
    override fun toString(): String{
        return "${nome} tem o RG ${RG}" // this.nome referencia a variável da classe
    }
    override fun hashCode(): Int{
        return this.RG
    }
}

fun main() {
    val pessoa1 = Pessoa("Maria",1928343)
    val pessoa2 = Pessoa("Maria",1978343)

    println(pessoa1.toString())
    println(pessoa2.toString())

//    print("Comparação dos nomes = ")
//    println(pessoa1.hashCode() == pessoa2.hashCode())
/*SEM DATA CLASS retorna um código do hashcode
COM DATA CLASS retorna numero c/ base nos parametros
 */
    print("Comparação dos RGs = ")
    println(pessoa1 == pessoa2)

}