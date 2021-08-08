package ExAtletaseProva

class Prova (var dif: Int,var enenecessaria: Int) {

fun podeRealizar(atleta: Atleta): Boolean {
    return (atleta.nivel >= dif && atleta.ene >= enenecessaria)
}
}
