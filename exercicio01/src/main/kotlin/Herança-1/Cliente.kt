package `Herança-1`

class Cliente (
    var numeroCLiente: Int,
    var sobrenome: String,
    var RG: Int,
    var CPF: String
) {
    fun DadosCliente() {
        print(
            """
            Numero do CLiente: $numeroCLiente
            Sobrenome: $sobrenome
            RG : $RG
            CPF: $CPF
                        
        """.trimIndent()
        )
    }
}
