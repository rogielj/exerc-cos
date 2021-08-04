fun main() {
    println(inteiros(2,3,6,2))
}

fun inteiros(a: Int, b: Int, c: Int, d: Int): Boolean {

        return (a>c && a>d) || (b>c && b>d)

}
