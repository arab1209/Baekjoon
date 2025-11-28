fun main() {
    val (a, b) = readLine()!!.split(" ").map{ it.toInt() }
    var count = 0
    for(i in 1..a) {
        if(a % i == 0) count++
        if(count == b) {
            println(i)
            break
        }
    }
    if(count < b) println(0)
}

