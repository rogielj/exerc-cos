package `revisao-2`

class Fatura (var itens: List<Item>){
var total = 0.0


// criar ArrayList<item>
//criar uma classe item

    fun totalDaFatura(): Double {
        for (i in itens){
            total += i.qtd_comprada_item * i.precoItem

        }
return total
    }
}

