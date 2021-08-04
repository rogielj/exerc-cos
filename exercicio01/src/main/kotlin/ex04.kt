fun main(){
    numI()
}

fun numI() {
        for (x in 1..100 step 1){
            if (x % 2 == 0)
                continue
            println("$x")
        }
}
