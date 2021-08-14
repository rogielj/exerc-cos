package `Abstract-Class`

open class Funcionario (var funcional: String)

class FuncionariodaTI(funcional: String, var notebook: String): Funcionario (funcional)

// construtores?
// instância do objeto: pode colocar o nome da variável e = e colocar o valor, não importa ordem
// private => só acessado dentro da classe
// super para referencia a Classe - this: mesma classe

class FuncionarioDaTI(funcional: String, var notebook: String): Funcionario(funcional)

open class Funcionario2( var funcional: String = ""){

    var nome: String = ""

    open fun trabalhar(valor: String){
        println("o funcionario trabalha")
    }
}

class FuncionarioDaTI2: Funcionario2 {

    var notebook: String = ""

    constructor(funcional: String, nome: String): super(funcional){
        this.notebook = notebook
    }

    override fun trabalhar(valor: String){
        println("alguma coisa")
    }

    fun trabalhar(valor: Int){
        println("alguma coisa")
    }

}

fun main() {
    val funcionario = FuncionarioDaTI2("foo","Mais")
    funcionario.funcional = "HP"
    funcionario.trabalhar("")
}