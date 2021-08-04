fun main(){
    maiorNum(2,5,6)
}

fun maiorNum(a: Int, b: Int, c:Int) {

    if (a>b && a>c) {
        print (a)
    } else if(b>a && b>c){
        print (b)
    } else {
        print (c)
    }
}