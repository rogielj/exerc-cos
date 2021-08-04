fun main(){
    num(true)
}

fun num(a: Boolean) {
    val x = 1..100
    if (a){
        for (k in x){
            println(k)
        }
    }
}