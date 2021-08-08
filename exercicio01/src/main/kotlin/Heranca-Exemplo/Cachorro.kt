package `Heranca-Exemplo`

class Cachorro: Animal() {

    override fun correr(){ // polimorfismo
        super.correr()
        println("Corre, corre")

    }

    fun atributos(){
        print(correr())
    }
}