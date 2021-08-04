package Classe00

class listaNumeros(var n: List<Int>) {
    fun multiplica(): Int {
        var r :Int = 1
        for (k in n)
            r *= k
        return r
    }

}

