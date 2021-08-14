// Classe abstrata não pode ser instanciada na Main
abstract class Funcionario(var funcional: String) {
    // posso criar variáveis
    //abstract fun trabalhar()
    fun trabalhar() {
        println("")
    }
}

class FuncionarioTI(funcional: String) : Funcionario(funcional) {
//     override fun trabalhar() { // obrigado a subescrever, sem abstract não precisa
}

class Diretor(funcional: String) : Funcionario(funcional) {
/*    override fun trabalhar() {
        println("Vou Gerenciar")

    }

 */
}

