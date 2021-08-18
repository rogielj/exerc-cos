package Interface

class Impressora() {
    var listaimprimivel = mutableListOf<Imprimivel>()

    fun adicionar(imprimivel: Imprimivel) {
        listaimprimivel.add(imprimivel)

    }

    fun imprimirLista() {
        for (element in listaimprimivel) {
            element.imprimir()
            // println(i.imprimir())
        }
    }
}
