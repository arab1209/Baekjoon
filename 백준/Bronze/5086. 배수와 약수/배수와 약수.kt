fun main() {
    while(true) {
        val (a, b) = readLine()!!.split(" ").map { it.toInt() }
        if(a == 0) break
        
        if(a < b && b % a == 0) println("factor")
        else if(a > b && a % b == 0) println("multiple")
        else println("neither")
    }
}