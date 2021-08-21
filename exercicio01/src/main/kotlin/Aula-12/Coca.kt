package `Aula-12`

class Coca(var tamanho: Int, var preco: Double){ // data class
    override fun equals (other: Any?): Boolean{ //sobreescrevendo
        return (other is Coca && other.tamanho == this.tamanho)
    }
    override fun toString(): String{
        return "o tamanho é ${tamanho} e o preço é: ${preco}"
    }
    override fun hashCode(): Int{
        return this.tamanho
    }
}


fun main() {

    var coca = Coca(2,3.60)
    var coca2 = Coca(2,2.60)

//    println(coca.equals(coca2)) //
    print("Coca 1 ")
    println(coca.toString())
    print("Coca 2 ")
    println(coca2.toString())

    println(coca.hashCode() == coca2.hashCode())
}