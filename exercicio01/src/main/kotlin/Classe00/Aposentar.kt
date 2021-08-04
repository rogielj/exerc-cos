package Classe00

class Aposentar (var nome: String, var idade: Int, var sexo: Char, var anosContri: Int) {

    fun resposta() {
        if (idade >= 60 && sexo == 'F' && anosContri >= 30) {
            print((nome)+" Verdadeiro")
        } else if (idade >= 65 && sexo == 'M' && anosContri >= 30) {
            print((nome)+" Verdadeiro")
        } else {
            print((nome)+" Falso")
        }
    }
}
